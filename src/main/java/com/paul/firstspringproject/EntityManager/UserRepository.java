package com.paul.firstspringproject.EntityManager;

import com.paul.firstspringproject.Model.Quotes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Quotes, Integer> {


}
