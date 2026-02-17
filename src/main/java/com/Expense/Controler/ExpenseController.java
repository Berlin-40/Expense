package com.Expense.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Expense.Model.Expense;
import com.Expense.Service.ExpenseService;

@Controller
@RequestMapping("/api/expenses")
public class ExpenseController {
    
    @Autowired
    private ExpenseService service;

    @GetMapping
    public ResponseEntity<Iterable<Expense>> getAll(){
        return new ResponseEntity<>(service.getExpense(),HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Expense> create(@RequestBody Expense expense) {
        return new ResponseEntity<>(service.createExpense(expense), HttpStatus.CREATED);
    }
@DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable  Long id) {
        service.deleteExpense(id);
        return  ResponseEntity.ok().build();
    }

}
