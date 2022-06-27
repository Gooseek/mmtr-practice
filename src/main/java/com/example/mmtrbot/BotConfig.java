package com.example.mmtrbot;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "bot_config")
public class BotConfig {
    @Id
    private BigInteger id;

    @Value("${bot.username}") //mmtr_prac_bot
    private String name;

    @Value("${bot.token}") //5502547724:AAHkQWBev2aeG26BH0cf89iclEqzmnekJYg
    private String accessToken;

    @Value("${bot.openweather}") //http://api.openweathermap.org/data/2.5/weather?q={city}&appid=307fba711ad1eec9c79b67f36d90acf0&units=metric&lang=ru
    private String nowWeatherApiTemp;

    @Value("${bot.answer}") //https://api.telegram.org/bot{5502547724:AAHkQWBev2aeG26BH0cf89iclEqzmnekJYg}/answerCallbackQuery?callback_query_id={id}
    private String telegramCallbackAnswerTemp;

    private List <Command> commands;
}

