package com.cot.bankingappmvc.controller;

import com.cot.bankingappmvc.model.User;
import com.cot.bankingappmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public String giveJspView(@PathVariable int id, ModelMap map){
//        System.out.println("Тут будет бизнес логика!!");
        User user = userService.getUserBuId(id);
        map.addAttribute("someUser", user.toString() );
        return "result";
    }


//    @PostMapping
//    @PutMapping
//    @DeleteMapping
}
