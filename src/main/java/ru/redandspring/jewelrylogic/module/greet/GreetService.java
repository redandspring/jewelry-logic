package ru.redandspring.jewelrylogic.module.greet;

import org.springframework.stereotype.Service;

@Service
public class GreetService {

    String findGreet(){
        return "Greet Service Jewelry Logic";
    }
}
