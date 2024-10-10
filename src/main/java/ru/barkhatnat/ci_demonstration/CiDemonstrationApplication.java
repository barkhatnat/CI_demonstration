package ru.barkhatnat.ci_demonstration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CiDemonstrationApplication {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        SpringApplication.run(CiDemonstrationApplication.class, args);
    }

}
