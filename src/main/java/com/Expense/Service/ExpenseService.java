package com.Expense.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Expense.Model.Expense;
import com.Expense.Repository.Repository;

@Service
public class ExpenseService {
    @Autowired
    private Repository repository;

    // TODO: Récupérer toutes les dépenses
    public Iterable<Expense> getExpense(){
        return repository.findAll();
    }
    
    // TODO: Ajouter une nouvelle dépense
    public Expense createExpense( Expense expense){
        return repository.save(expense);
    }

    // TODO: Supprimer une dépense
    public void deleteExpense(Long id){

        if(id == null){
            throw new RuntimeException("l'id ne doit être null");
        }
        repository.deleteById(id);
    }

    // TODO: Obtenir la somme totale dépensée
    public Double totalExpense(){
        Double sum = 0.;

        Iterable<Expense> listOfExpense = repository.findAll();

        for(Expense expense : listOfExpense){
            sum += expense.getAmount();
        }
        return sum;
    }
}
