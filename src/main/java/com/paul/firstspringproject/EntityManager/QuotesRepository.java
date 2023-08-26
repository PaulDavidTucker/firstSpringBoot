package com.paul.firstspringproject.EntityManager;

import com.paul.firstspringproject.Model.Quotes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface QuotesRepository extends JpaRepository <Quotes, Integer>{

    @Query("select q from QUOTES q where q.ID = :id")
    List<Quotes> getQuoteById(@Param("id") int id);

}
