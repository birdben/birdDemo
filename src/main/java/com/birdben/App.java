package com.birdben;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {

    public static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("resources/log4j.properties");
        logger.info("App start");
        System.out.println("Hello World!");
        logger.info("App end");
    }
}