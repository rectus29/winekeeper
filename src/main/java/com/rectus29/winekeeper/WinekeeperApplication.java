package com.rectus29.winekeeper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class WinekeeperApplication {

    private static final transient Logger log = LoggerFactory.getLogger(WinekeeperApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WinekeeperApplication.class, args);
    }

}
