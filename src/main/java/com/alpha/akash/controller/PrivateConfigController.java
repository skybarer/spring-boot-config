package com.alpha.akash.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alpha.akash.config.Configuration;

/**
 * @author : akashdhar
 * @date : 08-09-2019
 * @time : 08:22 PM
 */

@RestController
@RequestMapping("/config")
public class PrivateConfigController {

    private static org.slf4j.Logger logger = LoggerFactory.getLogger(PrivateConfigController.class);

    @Autowired
    private Configuration configuration;

    @GetMapping("/refresh")
    public void refresh() {
        logger.info("Refreshing configuration {}:");
        configuration.refresh();
    }
}
