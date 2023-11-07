package com.msrcin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("api/v1/customers")
class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping
    public List<Customer> getCustomers() {
    return List.of();
    }
}


//
//    @GetMapping("/greet")
//    public GreetResponse greet() {
//        GreetResponse response = new GreetResponse(
//                "Hello",
//                List.of("Java", "Golang", "JavaScript"),
//                new Person("Marcin",38,30_000)
//        );
//        return response;
//    }
//
//    record Person(String name, int age, double savings) {
//    }
//
//    record GreetResponse(
//            String greet,
//            List<String> favProgramingLanguages,
//            Person person
//    ) {
//
//    }
//}
