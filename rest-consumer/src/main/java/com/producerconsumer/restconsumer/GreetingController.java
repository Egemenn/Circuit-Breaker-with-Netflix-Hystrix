package com.producerconsumer.restconsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/get-greeting/{usernam}")
    public String getGreeting(Model model, @PathVariable ("username") String username){
        return greetingService.getGreeting(username);
    }


}
