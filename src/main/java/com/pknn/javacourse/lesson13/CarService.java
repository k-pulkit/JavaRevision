package com.pknn.javacourse.lesson13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {
    private final Logger logger = LoggerFactory.getLogger(CarService.class);

    public void process(String s) {
        // Only if debugging is enabled will the s be concat
        logger.debug("This is debug message - {}", s);
    }

}
