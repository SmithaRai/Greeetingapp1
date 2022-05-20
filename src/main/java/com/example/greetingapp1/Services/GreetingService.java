package com.example.greetingapp1.Services;

import com.example.greetingapp1.modal.Greeting;
import com.example.greetingapp1.modal.User;
import com.example.greetingapp1.repositary.GreetingRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements  IGreetingService{

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private GreetingRepositary greetingRepository;


    @Override
    public Greeting addGreeting(User user) {
        String message = String.format(template, (user.toString().isEmpty())? "Hello World" : user.toString());
        return greetingRepository.save(new Greeting(counter.incrementAndGet(), message));
    }


    @Override
    public Greeting getGreetingById(Long id) {
        return null;
    }


    public Greeting updateGreeting(long id,User user) {
        String message = String.format(template,user.toString());
        return greetingRepository.findById(id).
                map(greeting -> {
                    greeting.setMessage(message);
                    return this.greetingRepository.save(greeting);
                }).get();
    }

    public Greeting deleteGreeting(Long id) {
        return greetingRepository.findById(id).map(greeting -> {
            this.greetingRepository.deleteById(id);
            return greeting;
        }).get();
    }

}
