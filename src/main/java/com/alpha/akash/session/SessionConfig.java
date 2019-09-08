//package com.alpha.akash.session;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.session.web.http.HeaderHttpSessionStrategy;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.session.web.http.HttpSessionStrategy;
//
///**
// * @author : akashdhar
// * @date : 21-07-2019
// * @time : 02:32 PM
// */
//@Configuration
//public class SessionConfig {
//
//    @Bean
//    public WebMvcConfigurer webMvcConfigurer() {
//        return new WebMvcConfigurerAdapter() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry
//                        .addMapping("/**")
//                        .allowCredentials(true)
//                        .allowedMethods("GET", "POST", "PUT", "DELETE")
//                        .allowedOrigins("*");
//            }
//        };
//    }
//
//    public HttpSessionStrategy httpSessionStrategy() {
//        return new HeaderHttpSessionStrategy();
//    }
//}
