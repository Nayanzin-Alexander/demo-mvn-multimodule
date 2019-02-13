package com.nayanzin.springbootapp;

import com.nayanzin.model.HelloWorld;
import com.nayanzin.model.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.apache.logging.log4j.Level.INFO;

@SpringBootApplication
public class SpringBootAppApplication {

    private Logger logger = LogManager.getLogger(getClass());

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            HelloWorld helloWorld = new HelloWorld();
            World world = new World();
            logger.log(INFO, "HelloWorld and World classes have been imported properly from separate maven module.");
        };
    }
}

