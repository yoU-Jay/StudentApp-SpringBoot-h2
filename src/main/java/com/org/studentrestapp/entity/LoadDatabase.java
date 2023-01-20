package com.org.studentrestapp.entity;

import com.org.studentrestapp.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    @Bean
    CommandLineRunner initDatabase(StudentRepository repository){
        return args ->{
            log.info("Preloading " +repository.save(new Student("Thor", "avenger9","CS","Dev004",88.0)));
            log.info("Preloading " +repository.save(new Student("Hulk", "avenger8","IS","Dev003",93.8)));
            log.info("Preloading " +repository.save(new Student("Tony", "avenger6","IS","Dev001",56.1)));
            log.info("Preloading " +repository.save(new Student("Cap", "avenger7","TE","Dev005",99.0)));
            log.info("Preloading " +repository.save(new Student("Groot", "avenger10","EC","Dev002",33.3)));
        };
    }
}
