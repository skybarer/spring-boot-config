package com.alpha.akash.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

/**
 * @author : akashdhar
 * @date : 21-07-2019
 * @time : 01:01 PM
 */
public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static ApplicationContext applicationContext;
    public static Configuration configuration;

    public static <T> T getBean(String beanType, Class<T> clazz) throws BeansException {
        String beanName = configuration.getString(beanType);
        return applicationContext.getBean(beanName, clazz);
    }
}
