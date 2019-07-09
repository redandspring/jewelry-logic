package ru.redandspring.jewelrylogic.module.greet;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetFacadeCleanTest {

    @Test
    public void findGreet(){
        final GreetFacade greetFacade = new GreetFacade(new GreetService());
        final String greet = greetFacade.findGreet();
        System.out.println(greet);
        assertEquals("Greet Service Jewelry Logic", greet);
    }
}
