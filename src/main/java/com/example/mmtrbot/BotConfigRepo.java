package com.example.mmtrbot;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;

public interface BotConfigRepo extends MongoRepository<BotConfig, BigInteger> {
    //BotConfig findAllByChatId(Long chatId);
    //void deleteByChatId(Long chatId);
}
