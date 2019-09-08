package com.alpha.akash.config;

import com.alpha.akash.constants.ConfigKey;
import org.springframework.stereotype.Component;

/**
 * @author : akashdhar
 * @date : 21-07-2019
 * @time : 12:59 PM
 */

@Component
public class SystemEnvironment {
    Configuration configuration = App.config;

    public void setProperties() {
//        if (App.configuration.getBoolean(ConfigKey.SYSTEM_ENV_ENABLED)) {
//            System.setProperty("file.encoding", "UTF-8");
//        }
        System.setProperty("file.encoding", "UTF-8");
    }

}
