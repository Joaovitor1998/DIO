package com.dio.firstproject.controller;

import com.dio.firstproject.models.Transaction;
import com.dio.firstproject.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacao")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    public Transaction createTransaction(@RequestBody Transaction transaction){
        return transactionService.create(transaction);
    }
}
