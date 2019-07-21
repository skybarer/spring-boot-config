package com.alpha.akash.controller;

import com.alpha.akash.model.Application;
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

    @ResponseBody
    @RequestMapping("/status")
    public Application applicationStatus() {
        Application application = new Application();
        application.setStatus("Application Up and Running");
        return application;
    }
}
