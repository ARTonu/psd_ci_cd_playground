package com.psd.cicd.play;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayApplication {
    private static final Logger logger = LoggerFactory.getLogger(PlayApplication.class);

    public static void main(String[] args) {
        logger.debug("Hello Spring");
        SpringApplication.run(PlayApplication.class, args);
    }

}
