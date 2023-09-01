package com.paul.firstspringproject;

import com.paul.firstspringproject.Endpoints.QuoteDTO;
import com.paul.firstspringproject.Model.Quotes;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        // Define custom mappings for Quotes to QuotesDTO
        modelMapper.createTypeMap(Quotes.class, QuoteDTO.class)
                .addMapping(Quotes::getID, QuoteDTO::setID)
                .addMapping(Quotes::getQUOTETEXT, QuoteDTO::setQuoteText)
                .addMapping(Quotes::getUPVOTES, QuoteDTO::setUpVotes)
                .addMapping(Quotes::getDateCreated, QuoteDTO::setDateCreated)
                .addMapping(Quotes::getUSERIDOFUSERWHOCREATEDQUOTE, QuoteDTO::setUserThatCreatedQuote);

        return modelMapper;
    }
}
