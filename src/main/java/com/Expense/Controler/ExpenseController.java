package com.Expense.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Expense.Service.ExpenseService;

@Controller
@RequestMapping("/api/expenses")
public class ExpenseController {
    
    @Autowired
    private ExpenseService service;

}
