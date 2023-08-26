package com.paul.firstspringproject.Endpoints;

import com.paul.firstspringproject.EntityManager.QuotesService;
import com.paul.firstspringproject.Model.Quotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quotes")
public class QuoteController {

    private QuotesService quotesService;

    @Autowired
    public void QuotesController(QuotesService quotesService) {
        this.quotesService = quotesService;
    }


    @GetMapping
    public List<Quotes> getAllQuotes() {
        return quotesService.getAllQuotes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Quotes>> getQuoteById(@PathVariable int id) {
        List<Quotes> quotes = quotesService.getQuoteById(id);

        if (!quotes.isEmpty()) {
            return ResponseEntity.ok(quotes);
        } else {
            return ResponseEntity.notFound().build();
        }

    };

    @PostMapping
    public Quotes createQuote(@RequestBody Quotes quote) {
        return quotesService.saveQuote(quote);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuote(@PathVariable int id) {
        quotesService.deleteQuote(id);
        return ResponseEntity.noContent().build();
    }
}
