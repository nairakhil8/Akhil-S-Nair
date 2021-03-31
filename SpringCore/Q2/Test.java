package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("q2.xml");
        //List
       Question question1 =(Question)context.getBean("Question1");
       question.displayAnswerList();
       //Set
        System.out.println("***");
        Question question2 =(Question)context.getBean("Question2");
        question1.displayAnswerSet();
        //Map
        System.out.println("***");
        Question question3 =(Question)context.getBean("Question3");
        question2.displayAnswerMap();

    }
}
