package com.paul.firstspringproject.Endpoints;

import com.paul.firstspringproject.EntityManager.QuotesService;
import com.paul.firstspringproject.Model.Quotes;
import com.paul.firstspringproject.Model.Users;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/quotes")
public class QuoteController {

    private QuotesService quotesService;
    private ModelMapper modelMapper;

    @Autowired
    public QuoteController(QuotesService quotesService, ModelMapper modelMapper) {
        this.quotesService = quotesService;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public List<QuoteDTO> getAllQuotes() {
        List<Quotes> quotesList = quotesService.getAllQuotes();
        return quotesList.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<QuoteDTO> getQuoteById(@PathVariable int id) {
        Optional<Quotes> quote = quotesService.getQuoteById(id);

        if (quote.isPresent()) {
            QuoteDTO quoteDTO = convertToDTO(quote.get());
            return ResponseEntity.ok(quoteDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public QuoteDTO createQuote(@RequestBody QuoteDTO quoteDTO) {
        Quotes quote = convertToEntity(quoteDTO);
        Quotes savedQuote = quotesService.saveQuote(quote);
        return convertToDTO(savedQuote);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuote(@PathVariable int id) {
        quotesService.deleteQuote(id);
        return ResponseEntity.noContent().build();
    }

    // Helper methods to convert between entity and DTO
    private QuoteDTO convertToDTO(Quotes quote) {
        QuoteDTO quoteDTO = modelMapper.map(quote, QuoteDTO.class);
        quoteDTO.setUserThatCreatedQuote(modelMapper.map(quote.getUSERIDOFUSERWHOCREATEDQUOTE(), QuoteDTO.class).getUserThatCreatedQuote());
        return quoteDTO;
    }

    private Quotes convertToEntity(QuoteDTO quoteDTO) {
        Quotes quote = modelMapper.map(quoteDTO, Quotes.class);
        quote.setUSERIDOFUSERWHOCREATEDQUOTE(modelMapper.map(quoteDTO.getUserThatCreatedQuote(), Users.class));
        return quote;
    }
}
