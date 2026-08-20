package com.example.service;

import com.example.model.Account;
import com.example.model.TransferRecord;
import com.example.repository.AccountRepository;
import com.example.repository.TransferRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TransferService {
    private final AccountRepository accountRepository;
    private final  TransferRepository transferRepository;

    public TransferService(AccountRepository accountRepository, TransferRepository transferRepository) {
        this.accountRepository = accountRepository;
        this.transferRepository = transferRepository;
    }

    public void  Transfer(long from, long to,
                          BigDecimal amount){

        Account fromAccount = accountRepository.findById(from).orElse(null);
        Account toAccount = accountRepository.findById(to).orElse(null);

    fromAccount.debitAccount(amount);
    toAccount.creditAccount(amount);

        TransferRecord transferRecord =
                new TransferRecord(from, to, amount,
                        java.time.LocalDateTime.now());
        transferRepository.save(transferRecord);

    }

}
