package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class UserController {
    @RequestMapping("/")
    public ModelAndView getmsg(){
        User user=new User();
        ModelAndView modelAndView=new ModelAndView();
       modelAndView.setViewName("index");
        modelAndView.addObject("message",user.message);
       return modelAndView;
    }
}
