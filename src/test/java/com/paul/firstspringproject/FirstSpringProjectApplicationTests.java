package com.paul.firstspringproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FirstSpringProjectApplicationTests {

    @Test
    void contextLoads() {

    }

    @Test
    public void simpleTest(){
        int num1 = 1;
        int num2 = 3;

        assertEquals(4, num1 + num2);
    }

}
