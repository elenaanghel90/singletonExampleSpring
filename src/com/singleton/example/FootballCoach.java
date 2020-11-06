package com.singleton.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class FootballCoach implements Coach {

    public FootballCoach() {
        System.out.println(">> FootballCoach: inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Run 5 km daily!";
    }
}
