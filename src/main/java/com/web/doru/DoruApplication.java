package com.web.doru;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DoruApplication {
    //I've changed the default Tomcat pot 8080
    //To do this watch this tutorial https://www.youtube.com/watch?v=c8SsQy8A-jk
    // for the REST Client I've used Postman https://www.youtube.com/watch?v=8veXJ9YGlFI
    // use this extension for Json //https://chrome.google.com/webstore/detail/json-viewer/gbmdgpbipfallnflgajpaliibnhdgobh
    public static void main(String[] args) {
        SpringApplication.run(DoruApplication.class, args);


        }

    }


