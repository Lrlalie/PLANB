package fr.planb.gerald.reynier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//this annotation initializes Spring framework
@SpringBootApplication
public class ProjetPlanBApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetPlanBApplication.class, args);
		
		System.out.println("hello");
	}

}
