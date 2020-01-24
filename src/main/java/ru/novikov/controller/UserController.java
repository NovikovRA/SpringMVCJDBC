package ru.novikov.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.novikov.Entity.User;
import ru.novikov.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/hello")
    public String Test(){
        return "hello";
    }

    @GetMapping("/users")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.findAll());
        return "users";
    }

//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public @ResponseBody List<User> getAllUsersList(){
//        return userService.findAll();
//    }
}
