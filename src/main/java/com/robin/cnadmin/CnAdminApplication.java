package com.robin.cnadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CnAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(CnAdminApplication.class, args);
    }

}
