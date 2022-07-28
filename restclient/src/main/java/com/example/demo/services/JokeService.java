package com.example.demo.services;

import com.example.demo.json.JokeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JokeService {

    private static final String BASE = "http://api.icndb.com/jokes/random?exclude=[nerdy]";
    private RestTemplate restTemplate;

    @Autowired
    public JokeService(RestTemplateBuilder builder) {
        restTemplate = builder.build();
    }

    public String getJoke(String first, String last) {
        String url = String.format("%s&firstName=%s&lastname=%s", BASE, first, last);
        JokeResponse jokeResponse = restTemplate.getForObject(url, JokeResponse.class);
        String output = "";
        if (jokeResponse != null) {
            output = jokeResponse.getValue().getJoke();
        }
        return output;
    }
}
