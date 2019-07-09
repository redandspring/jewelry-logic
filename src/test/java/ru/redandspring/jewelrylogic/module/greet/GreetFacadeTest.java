package ru.redandspring.jewelrylogic.module.greet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GreetFacadeTest {

    @Autowired
    GreetFacade greetFacade;

    @Test
    public void findGreet(){
        final String greet = greetFacade.findGreet();
        System.out.println(greet);
        assertEquals("Greet Service Jewelry Logic", greet);
    }
}