package edu.udayton.NewCourseSpring.SpringBootProject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @RequestMapping(value = "/create")
    public String createCustomer(){
        return "Customer has been created";
    }
    @RequestMapping(value = "/update")
    public String updateCustomer(){
        return "Customer has been updated";
    }
    @RequestMapping(value = "/delete")
    public String deleteCustomer(){
        return "Customer has been deleted";
    }
    @RequestMapping(value = "/get")
    public String getCustomer(){
        return "Customer has been displayed";
    }
}
