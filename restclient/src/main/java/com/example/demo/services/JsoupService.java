package com.example.demo.services;

import com.example.demo.json.joke.JokeResponse;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.jsoup.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


@Service
public class JsoupService {
    static final Logger log = LoggerFactory.getLogger(JsoupService.class);
    private Jsoup jsoup;
    private static final String BASE = "https://en.wikipedia.org/";

    @Autowired
    public JsoupService(RestTemplateBuilder builder) {
        RestTemplate restTemplate = builder.build();
    }

    public void getWebPage() throws IOException {
        Document doc = Jsoup.connect(BASE).get();
        log.info(doc.title());
        Elements newsHeadlines = doc.select("#mp-itn b a");
        for (Element headline : newsHeadlines) {
            log.info("%s\n\t%s",
                    headline.attr("title"), headline.absUrl("href"));
        }
    }
}
