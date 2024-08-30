package com.example;

import com.example.fasade.Support;
import com.example.fasade.SupportService;

public class Client implements Support {
    Support service;

    public Client(SupportService service) {
        this.service = service;
    }

    @Override
    public String chatWithTheSupportService(String theEssenceRequest) {
        return theEssenceRequest;
    }
    public void theProblemWithTheProduct(String theEssenceRequest){
        service.chatWithTheSupportService("С товаром возникла проблема: "+ theEssenceRequest);
    }
}
