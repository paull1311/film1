package com.bionic.film.controller;


import com.bionic.film.model.User;
import com.bionic.film.service.SecurityService;
import com.bionic.film.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * @author vitalii.levash
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private SecurityService securityService;

    @RequestMapping(method = RequestMethod.GET)
    public String getUserInfo(ModelMap model){
        User user = userService.getById(securityService.getUserId());
        model.addAttribute("info",user);
        return "user";
    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String register(ModelMap model){
        model.addAttribute(new User());
        return "userform";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String registerUser(ModelMap model, @Valid @ModelAttribute User user, BindingResult bindingResult){
      /*
        if (bindingResult.hasErrors()) {
            return "userform";
        }
        */
        userService.addUser(user);
        model.addAttribute("info", "Thanks for registration! You can login with your credentials!");
        return "login";
    }
}