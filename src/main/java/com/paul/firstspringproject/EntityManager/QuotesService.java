package com.paul.firstspringproject.EntityManager;

import com.paul.firstspringproject.Model.Quotes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuotesService {

    private final QuotesRepository quotesRepository;


    @Autowired
    public QuotesService(QuotesRepository quotesRepository){
        this.quotesRepository = quotesRepository;
    }

    public List<Quotes> getAllQuotes() {
        return quotesRepository.findAll();
    }


    public Optional<Quotes> getQuoteById(int id) {
        return quotesRepository.getQuoteById(id);
    }

    public Quotes saveQuote(Quotes quote) {
        return quotesRepository.save(quote);
    }

    public void deleteQuote(int id) {
        quotesRepository.deleteById(id);
    }

}
