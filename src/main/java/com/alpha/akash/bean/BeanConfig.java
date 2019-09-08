package com.alpha.akash.bean;

import com.alpha.akash.config.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : akashdhar
 * @date : 21-07-2019
 * @time : 01:34 PM
 */
@Configuration
public class BeanConfig {

    @Bean
    public App b(ApplicationContext applicationContext, com.alpha.akash.config.Configuration config) {
        App.config = config;
        App.context = applicationContext;
        return new App();
    }
}
