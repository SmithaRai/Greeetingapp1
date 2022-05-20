package com.example.greetingapp1.Services;

import com.example.greetingapp1.modal.Greeting;
import com.example.greetingapp1.modal.User;

public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(Long id);
    Greeting updateGreeting(long id,User user);
    Greeting deleteGreeting(Long id);
}
