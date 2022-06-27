package com.example.mmtrbot;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;

public interface ChatConfigRepo extends MongoRepository<ConfigChat, BigInteger> {
    ConfigChat findAllByChatId(Long chatId);
    void deleteByChatId(Long chatId);
}
