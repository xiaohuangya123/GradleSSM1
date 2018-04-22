package com.reload.gradlessm.controller;

import com.reload.gradlessm.model.User;
import com.reload.gradlessm.service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserContorller {

    @Autowired
    private UserManager userManager;

    @RequestMapping("/hello")
    public ModelAndView hello(){
        ModelAndView mav = new ModelAndView();
        User user = userManager.getUserById(2);
        mav.addObject("user", user);
        mav.setViewName("welcome");
        return mav;
    }
}
