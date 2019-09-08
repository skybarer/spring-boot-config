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
    public static ApplicationContext context;
    public static Configuration config;
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static <T> T getBean(String beanType, Class<T> clazz) throws BeansException {
        String beanName = config.getString(beanType);
        return context.getBean(beanName, clazz);
    }
}
