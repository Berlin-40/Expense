package com.Expense.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Expense.Model.Expense;

public interface Repository extends CrudRepository<Expense, Long>{
    
}
