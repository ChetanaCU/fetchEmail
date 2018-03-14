package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@EnableMongoRepositories(basePackageClasses = EmailRepository.class)
@Configuration
public class FetchEmailIDConfig {

}
