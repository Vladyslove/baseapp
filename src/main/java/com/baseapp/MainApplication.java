package com.baseapp;

import com.baseapp.model.Student;
import com.baseapp.service.UniversityService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApplication {

    public static void main(String[] args) {
//        UniversityService universityService = new UniversityServiceImpl();

/*
//        3. Spring Application with Annotations Configuration
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("spring-config.xml");
*/
//          4. Spring Application with Java Configuration

        ApplicationContext applicationContext = new
                AnnotationConfigApplicationContext(ApplicationConfig.class);

        UniversityService universityService = applicationContext.getBean("universityService",
                UniversityService.class);

        List<Student> allStudents =
                universityService.getAvailableStudents();

        System.out.println(allStudents);
    }
}
