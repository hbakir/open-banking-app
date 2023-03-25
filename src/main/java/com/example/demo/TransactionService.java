package com.example.demo;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TransactionService {
    List<Transaction> findAllByAccountNumber(String accountNumber){
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("credit", Date.from(Instant.now()), "640X", "CHF", BigDecimal.valueOf(1500.0), "Nestlé", "Nestlé logo"));
        transactions.add(new Transaction("credit", Date.from(Instant.now()), "640X", "CHF", BigDecimal.valueOf(2500.0), "Coop", "Coop logo"));
        transactions.add(new Transaction("credit", Date.from(Instant.now()), "640X", "CHF", BigDecimal.valueOf(3500.0), "UBS", "UBS logo"));
        return transactions;
    }
}
