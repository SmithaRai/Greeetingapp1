package com.example.greetingapp1.modal;

import javax.persistence.*;

@Entity

public class Greeting {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final long id;
    private String message;



    public String getMessage() {
        return message;
    }



    public Greeting(){
        id = 0;
        message = "";
    }
   public Greeting(long id, String message) {
        this.id = id;
        this.message = message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}
