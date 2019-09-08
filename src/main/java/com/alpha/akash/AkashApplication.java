package com.alpha.akash;

import com.alpha.akash.config.SystemEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;
import org.springframework.boot.context.event.ApplicationReadyEvent;

import java.io.IOException;

import com.alpha.akash.config.Configuration;

@SpringBootApplication
public class AkashApplication {

    @Autowired
    SystemEnvironment systemEnvironment;

    @Autowired
    Configuration configuration;

    public static void main(String[] args) {
        SpringApplication.run(AkashApplication.class, args);
    }


    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartUp() throws IOException {
        systemEnvironment.setProperties();
        configuration.refresh();
    }

//	@Bean
//	public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomize(){
//		return factory -> factory.setContextPath("/");
//	}

}
