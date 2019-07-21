package com.alpha.akash;

import com.alpha.akash.config.SystemEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import java.io.IOException;

@SpringBootApplication
public class AkashApplication {

	@Autowired
	SystemEnvironment systemEnvironment;

	public static void main(String[] args) {
		SpringApplication.run(AkashApplication.class, args);
	}


	@EventListener(ApplicationReadyEvent.class)
	public void  doSomethingAfterStartUp() throws IOException {
		systemEnvironment.setProperties();
	}

//	@Bean
//	public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomize(){
//		return factory -> factory.setContextPath("/");
//	}

}
