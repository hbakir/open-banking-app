package com.example.demo;

import java.math.BigDecimal;
import java.util.Date;

public record Transaction(String type,
                          Date date,
                          String accountNumber,
                          String currency,
                          BigDecimal amount,
                          String merchantName,
                          String merchantLogo) {
}


