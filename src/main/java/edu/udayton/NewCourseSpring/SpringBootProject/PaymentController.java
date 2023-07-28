package edu.udayton.NewCourseSpring.SpringBootProject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

    @RequestMapping(value = "/create")
    public String createPayment(){
        return "Payment has been created";
    }
    @RequestMapping(value = "/update")
    public String updatePayment(){
        return "Payment has been updated";
    }

    @RequestMapping(value = "/get")
    public String getPayment(){
        return "Payment has been displayed";
    }
}
