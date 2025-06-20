package com.yatmk.test.presentation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@ComponentScan(basePackages = {
                "com.yatmk.test.presentation",
                "com.yatmk.test.infrastructure",
                "com.yatmk.test.common",
                "com.yatmk.test.persistence"
})
@RequiredArgsConstructor
public class PresentationApplication {

        public static void main(String[] args) {

                SpringApplication.run(PresentationApplication.class, args);

        }

}
