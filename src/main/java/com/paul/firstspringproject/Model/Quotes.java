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
    private String QUOTETEXT;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USERIDOFUSERWHOCREATEDQUOTE")
    private Users USERIDOFUSERWHOCREATEDQUOTE;

    @Column(columnDefinition = "DATECREATED")
    private Date DATECREATED;

    @Column(columnDefinition = "int default 0")
    private int UPVOTES;

    public Quotes() {
    }

    public Quotes(int ID, String QUOTETEXT, Users USERIDOFUSERWHOCREATEDQUOTE, Date DATECREATED, int UPVOTES) {
        this.ID = ID;
        this.QUOTETEXT = QUOTETEXT;
        this.USERIDOFUSERWHOCREATEDQUOTE = USERIDOFUSERWHOCREATEDQUOTE;
        this.DATECREATED = DATECREATED;
        this.UPVOTES = UPVOTES;
    }

    public int getID() {
        return ID;
    }

    public String getQUOTETEXT() {
        return QUOTETEXT;
    }

    public void setQUOTETEXT(String QUOTETEXT) {
        this.QUOTETEXT = QUOTETEXT;
    }

    public Users getUSERIDOFUSERWHOCREATEDQUOTE() {
        return USERIDOFUSERWHOCREATEDQUOTE;
    }

    public void setUSERIDOFUSERWHOCREATEDQUOTE(Users USERIDOFUSERWHOCREATEDQUOTE) {
        this.USERIDOFUSERWHOCREATEDQUOTE = USERIDOFUSERWHOCREATEDQUOTE;
    }

    public Date getDateCreated() {
        return DATECREATED;
    }

    public void setDateCreated(Date dateCreated) {
        DATECREATED = dateCreated;
    }

    public int getUPVOTES() {
        return UPVOTES;
    }

    public void setUPVOTES(int upVotes) {
        this.UPVOTES = upVotes;
    }
}
