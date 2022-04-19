package org.trescal.trescalrecruitmentjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TrescalRecruitmentJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrescalRecruitmentJavaApplication.class, args);
    }

}
