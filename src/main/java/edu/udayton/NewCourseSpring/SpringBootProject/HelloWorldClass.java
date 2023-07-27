package edu.udayton.NewCourseSpring.SpringBootProject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldClass {

    @RequestMapping(value = "/")
    public String getHelloWorldClass(){
        return "Hello World has been updated in the hellowroldclass";
    }
}
/*
For understanding purpose not real :

    @RestController :       HelloWorldClass obj1 = ioc.getHelloWorldClass()

    @RequestMapping :       obj.getHelloWorldClass()

 */