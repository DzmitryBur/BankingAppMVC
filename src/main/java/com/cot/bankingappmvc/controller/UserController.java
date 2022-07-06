package com.cot.bankingappmvc.controller;

import com.cot.bankingappmvc.model.User;
import com.cot.bankingappmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @Autowired
    UserService dao;

    @GetMapping("/user/{id}")
    public String giveJspView(@PathVariable int id, ModelMap map){
//        System.out.println("Тут будет бизнес логика!!");
        User user = userService.getUserBuId(id);
        map.addAttribute("someUser", user.toString() );
        return "resultUser";
    }

    @PostMapping("/users")
    public String addUser(
            @RequestParam String name,
            @RequestParam String industry,
            @RequestParam String residency,
            @RequestParam String login,
            @RequestParam String password,
            ModelMap map) {
        dao.addUser(name, industry, residency, login, password);
        map.addAttribute("users", dao.getAllUsers());
        return "resultUser";
    }

//    @PutMapping
//    @DeleteMapping
}
