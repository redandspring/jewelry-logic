package ru.redandspring.jewelrylogic.module.greet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetFacade {

    private final GreetService greetService;

    @Autowired
    public GreetFacade(final GreetService greetService) {
        this.greetService = greetService;
    }

    @SuppressWarnings("WeakerAccess")
    public String findGreet(){
        return greetService.findGreet();
    }
}
