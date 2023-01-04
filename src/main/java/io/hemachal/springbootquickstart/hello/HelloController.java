package io.hemachal.springbootquickstart.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* Marks this as a Rest Controller
* */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String sayHi()
    {
        return "Hi!";
    }
}
