package edu.fiu.ffqr.user;

import java.security.Principal;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
/*import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
public class UserController{


    private static final User user1 = new User(1, "James Bond");
    private static final User user2 = new User(2, "Maria Jones");
    private static final User user3 = new User(3, "Anna Smith");
    private static final List<User> USERS = Arrays.asList(
        user1, user2, user3
    );
       
        

    @GetMapping(path = "{userId}")
    public User getUser(@PathVariable("userId") Integer userId) {
        return USERS.stream().filter(user -> userId.equals(user.getUserId())).findFirst()
        .orElseThrow(() -> new IllegalStateException("User " + userId + " does not exist"));


    }

}*/
/*
import org.springframework.web.bind.annotation.RestController;

//import edu.fiu.ffqr.user.User;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
 
    @RequestMapping("/login")
    public boolean login(@RequestBody User user) {
        return
          user.getUserName().equals("user") && user.getPassword().equals("password");
    }
     
    @RequestMapping("/user")
    public Principal user(HttpServletRequest request) {
        String authToken = request.getHeader("Authorization")
          .substring("Basic".length()).trim();
        return () ->  new String(Base64.getDecoder()
          .decode(authToken)).split(":")[0];
    }
}
*/