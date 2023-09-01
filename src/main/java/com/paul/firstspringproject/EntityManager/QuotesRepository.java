package com.paul.firstspringproject.EntityManager;

import com.paul.firstspringproject.Model.Quotes;
import com.paul.firstspringproject.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface QuotesRepository extends JpaRepository <Quotes, Integer>{

    @Query("select q from Quotes q where q.ID = :id")
    Optional<Quotes> getQuoteById(@Param("id") int id);

    @Query("SELECT u FROM Users u WHERE u.id = :id")
    Optional<Users> getUserById(@Param("id") int id);


}
