package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args){
        /* main 메소드에서 실행하는 SpringApplication.run 으로 인해 내장 WAS를 실행한다.(권장) */
        SpringApplication.run(Application.class, args);
    }
}
