package com.dio.firstproject.service;

import com.dio.firstproject.models.Transaction;
import com.dio.firstproject.repository.TransactionRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    TransactionRespository transactionRespository;

    public Transaction create(Transaction transaction){ return transactionRespository.save(transaction);}
}
