package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionServiceTest {

    TransactionService subject;
    @BeforeEach
    void setup(){
        this.subject = new TransactionService();
    }

    @Test
    @DisplayName("it Should Fetch A Non Empty List Of Transactions")
    void itShouldFetchANonEmptyListOfTransactions(){
        // given an account number
        String accountNumber = "640X";
        // when transactions are fetched for that account number
        List<Transaction> result = this.subject.findAllByAccountNumber(accountNumber);
        // then it should return list of transactions
        assert result != null;
        // and the list should contain transactions
        assert result.size() == 3;
    }

}