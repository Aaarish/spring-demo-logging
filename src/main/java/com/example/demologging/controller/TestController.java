package com.example.demologging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestController {
    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/hello")
    public ResponseEntity<String> test(){
        logger.error("Get Lost");
        logger.warn("Quickly");
        logger.info("U know what");
        logger.debug("Its a secret");
        logger.trace("Fcuk you");
        return ResponseEntity.ok("Hello World !!!");
    }
}
