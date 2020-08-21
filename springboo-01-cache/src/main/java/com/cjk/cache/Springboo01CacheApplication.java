package com.cjk.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Springboo01CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboo01CacheApplication.class, args);
    }

}
