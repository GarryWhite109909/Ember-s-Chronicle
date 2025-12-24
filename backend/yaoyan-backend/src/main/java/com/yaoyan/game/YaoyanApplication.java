package com.yaoyan.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class YaoyanApplication {

    public static void main(String[] args) {
        SpringApplication.run(YaoyanApplication.class, args);
    }

}
