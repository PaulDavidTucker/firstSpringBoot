package com.paul.firstspringproject.Endpoints;

import com.paul.firstspringproject.Model.Users;

import java.util.Date;

public class QuoteDTO {
    private int ID;
    private String quoteText;
    private Date DateCreated;
    private int UpVotes;
    private Users usersThatCreatedQuote;

    private String Username;


// Constructors, getters, and setters


    public QuoteDTO() {
    }

    public QuoteDTO(int ID, String quoteText, Date DATECREATED, int UpVotes, Users usersThatCreatedQuote) {
        this.ID = ID;
        this.quoteText = quoteText;
        this.DateCreated = DATECREATED;
        this.UpVotes = UpVotes;
        this.usersThatCreatedQuote = usersThatCreatedQuote;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }

    public Date getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(Date DATECREATED) {
        this.DateCreated = DATECREATED;
    }

    public int getUpVotes() {
        return UpVotes;
    }

    public void setUpVotes(int UPVOTES) {
        this.UpVotes = UPVOTES;
    }

    public Users getUserThatCreatedQuote() {
        return usersThatCreatedQuote;
    }

    public void setUserThatCreatedQuote(Users usersThatCreatedQuote) {
        this.usersThatCreatedQuote = usersThatCreatedQuote;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }
}

