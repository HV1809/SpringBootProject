package edu.udayton.NewCourseSpring.SpringBootProject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @RequestMapping(value = "/create")
    public String createProduct(){
        return "Product has been created";
    }
    @RequestMapping(value = "/update")
    public String updateProduct(){
        return "Product has been updated";
    }
    @RequestMapping(value = "/delete")
    public String deleteProduct(){
        return "Product has been deleted";
    }
    @RequestMapping(value = "/get")
    public String getProduct(){
        return "Product has been displayed";
    }
}
