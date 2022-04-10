package com.guru.springframework.spring5jokesappv2.controller;

import com.guru.springframework.spring5jokesappv2.service.ChuckNorrisQuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final ChuckNorrisQuoteService chuckNorrisQuoteService;
    public JokeController(ChuckNorrisQuoteService chuckNorrisQuoteService) {
        this.chuckNorrisQuoteService = chuckNorrisQuoteService;
    }

    @RequestMapping("/")
    public String getChuckNorrisQuote(Model model){
        String joke = chuckNorrisQuoteService.getRandomChuckNorrisQuote();
        model.addAttribute("joke", joke);
        return "jokes/joke";
    }
}
