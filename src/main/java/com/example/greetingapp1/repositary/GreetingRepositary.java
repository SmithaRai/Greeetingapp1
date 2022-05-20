package com.example.greetingapp1.repositary;

import com.example.greetingapp1.modal.Greeting;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepositary extends JpaRepository<Greeting,Long> {
}
