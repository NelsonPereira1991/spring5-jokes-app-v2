package com.guru.springframework.spring5jokesappv2.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuoteServiceImpl implements ChuckNorrisQuoteService{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisQuoteServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomChuckNorrisQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
