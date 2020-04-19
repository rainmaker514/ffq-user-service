package edu.fiu.ffqr;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import edu.fiu.ffqr.dataloader.DataLoader;

@Component
@SpringBootApplication
public class FFQUserApplication {

	public static void main(String[] args) throws IOException{
		ApplicationContext ctx = SpringApplication.run(FFQUserApplication.class, args);
		

		// This should never be run on production/staging environment or all data will be lost
		//=======================================================================================
		String loadDataArg = (String) ctx.getBean("loadUsersEnvVar");
		if (loadDataArg.equalsIgnoreCase("true")) {
			DataLoader loader = (DataLoader)ctx.getBean(DataLoader.class);
			loader.loadAdmin();
			loader.loadClinicians();
			loader.loadParents();
			loader.loadClinics();
		}
		//======================================================================================


		DataLoader loader = (DataLoader)ctx.getBean(DataLoader.class);
		// loader.loadAdmin();
		// 	loader.loadClinicians();
		// 	loader.loadParents();
		// 	loader.loadClinics();
	
	}
	
	@Bean
	public String loadUsersEnvVar(@Value("${mongo.users.load}")String value) {
		return value;
	}
}