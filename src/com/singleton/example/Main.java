package com.singleton.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static Coach tennisCoach;
    static Coach tennisCoach1;
    static Coach footballCoach;
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
         tennisCoach = context.getBean("tennisCoach",Coach.class);
         tennisCoach1 = context.getBean("tennisCoach",Coach.class);
         footballCoach = context.getBean("footballCoach", Coach.class);

        System.out.println("The beans are the same:" + areEqual(tennisCoach,tennisCoach1) );
        System.out.println("The instance of tennis coach " + tennisCoach);
        System.out.println("The instance of tennis coach " + tennisCoach1);
        System.out.println("The instance of football coach " + footballCoach);
    }

    public static boolean areEqual(Coach tennisCoach, Coach tennisCoach1) {
        boolean equal = false;
        if(tennisCoach == tennisCoach1){
            return true;
        }
        return false;
    }
}
