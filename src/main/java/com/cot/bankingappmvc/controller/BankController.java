package com.cot.bankingappmvc.controller;

import com.cot.bankingappmvc.model.Bank;
import com.cot.bankingappmvc.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BankController {

    BankService bankService;

    @Autowired
    public BankController(BankService bankService){
        this.bankService = bankService;
    }


    @GetMapping("/bank/{id}")
    public String giveJspView(@PathVariable int id, ModelMap map){
//        System.out.println("Тут будет бизнес логика!!");
        Bank bank = bankService.getBankBuId(id);
        map.addAttribute("someBank", bank.toString() );
        return "resultBank";
    }


//    @PostMapping
//    @PutMapping
//    @DeleteMapping
}

