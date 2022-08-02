package com.example.demo.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ExtendWith(SpringExtension.class)
class JokeServiceTest {

    @Autowired
    private JokeService jokeService;

    @Autowired
    private JsoupService jsoupService;

    @Test
    void getJoke() {
        String joke = jokeService.getJoke("Ken", "Kousen");

        assertTrue(joke.contains("Ken") || joke.contains("Kousen"));
    }

    @Test
    void logTitle() throws IOException {
        jsoupService.getWebPage();
    }
}
