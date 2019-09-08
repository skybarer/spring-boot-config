package com.alpha.akash.controller;

import com.alpha.akash.config.App;
import com.alpha.akash.config.Configuration;
import com.alpha.akash.constants.ConfigKey;
import com.alpha.akash.model.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : akashdhar
 * @date : 20-07-2019
 * @time : 08:27 PM
 */

@RestController
@RequestMapping("/v1")
public class TestController {


    @Autowired
    Configuration configuration;

    @ResponseBody
    @RequestMapping("/status")
    public Application applicationStatus() {
        Application application = new Application();
        application.setState(App.config.getString(ConfigKey.SYSTEM_STATE));
        application.setEnvironment(App.config.getString(ConfigKey.SYSTEM_ENV_ENABLED));
        return application;
    }
}
