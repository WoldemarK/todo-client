package com.example.todoclient.client;

import com.example.todoclient.component.ToDoRestClientProperties;
import com.example.todoclient.error.ToDoErrorHandler;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ToDoRestClient {

    private RestTemplate restTemplate;
    private ToDoRestClientProperties properties;

    public ToDoRestClient(ToDoRestClientProperties properties){
        this.restTemplate = new RestTemplate();
        this.restTemplate.setErrorHandler(new ToDoErrorHandler());
        this.properties = properties;
    }
}
