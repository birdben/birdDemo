package com.birdben;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import junit.framework.TestResult;

/**
 * Hello world!
 */
public class App {

    public static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        TestResult test = new TestResult();
        logger.info("App start");
        System.out.println("Hello World!");
        logger.info("App end");
    }
}