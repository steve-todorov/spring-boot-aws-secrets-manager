package org.carlspring.hello.world.spring.boot.aws.secretsmanager.springbootawssecretsmanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootAwsSecretsManagerApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootAwsSecretsManagerApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(SpringBootAwsSecretsManagerApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(@Value("${secrets.spring.datasource.username}") String secretUsername,
                                        @Value("${secrets.spring.datasource.password}") String secretPassword,
                                        @Value("${spring.datasource.username}") String referenceUsername,
                                        @Value("${spring.datasource.password}") String referencePassword) {
        return args -> {
            LOGGER.info("`secrets.spring.datasource.username` loaded from the AWS Secret Manager: {}", secretUsername);
            LOGGER.info("`secrets.spring.datasource.password` loaded from the AWS Secret Manager: {}", secretPassword);
            LOGGER.info("`spring.datasource.username` loaded from the AWS Secret Manager: {}", referenceUsername);
            LOGGER.info("`spring.datasource.password` loaded from the AWS Secret Manager: {}", referencePassword);
        };
    }

}
