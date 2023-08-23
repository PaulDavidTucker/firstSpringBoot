package com.paul.firstspringproject.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Quotes {

    @Id
    @Column(columnDefinition = "int not null AUTO_INCREMENT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(columnDefinition = "VARCHAR(255) NOT NULL", nullable = false)
    private String QuoteText;

    @ManyToOne
    @JoinColumn(name = "UserIDOfUserWhoCreatedQuote", referencedColumnName = "ID")
    private User UserIDOfUserWhoCreatedQuote;

    @Column(columnDefinition = "DATE")
    private Date DateCreated;

    @Column(columnDefinition = "int default 0")
    private int upVotes;

    @Column(columnDefinition = "int")
    private int test;

    public Quotes() {
    }

    public Quotes(int ID, String quoteText, User UserIDOfUserWhoCreatedQuote, Date dateCreated, int upVotes) {
        this.ID = ID;
        this.QuoteText = quoteText;
        this.UserIDOfUserWhoCreatedQuote = UserIDOfUserWhoCreatedQuote;
        this.DateCreated = dateCreated;
        this.upVotes = upVotes;
    }

    public int getID() {
        return ID;
    }

    public String getQuoteText() {
        return QuoteText;
    }

    public void setQuoteText(String quoteText) {
        QuoteText = quoteText;
    }

    public User getUserIDOfUserWhoCreatedQuote() {
        return UserIDOfUserWhoCreatedQuote;
    }

    public void setUserIDOfUserWhoCreatedQuote(User userIDOfUserWhoCreatedQuote) {
        UserIDOfUserWhoCreatedQuote = userIDOfUserWhoCreatedQuote;
    }

    public Date getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        DateCreated = dateCreated;
    }

    public int getUpVotes() {
        return upVotes;
    }

    public void setUpVotes(int upVotes) {
        this.upVotes = upVotes;
    }
}
