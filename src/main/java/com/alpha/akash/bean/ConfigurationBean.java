package com.alpha.akash.bean;

import com.alpha.akash.config.DBConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : akashdhar
 * @date : 21-07-2019
 * @time : 01:55 PM
 */
@Configuration
public class ConfigurationBean {

    @Bean
    public com.alpha.akash.config.Configuration configuration() {
        return new DBConfiguration("spring");
    }
}

