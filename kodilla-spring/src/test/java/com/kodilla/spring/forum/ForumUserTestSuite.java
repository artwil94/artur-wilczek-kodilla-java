package com.kodilla.spring.forum;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class ForumUserTestSuite {

        @Test
        public void testGetUsername() {
            //Given
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");


            //When
           // String username =context.getBean(ForumUser.class).getUsername();

            //Then
            assertEquals("John Smith", context.getBean(ForumUser.class).getUsername());
        }

    }


