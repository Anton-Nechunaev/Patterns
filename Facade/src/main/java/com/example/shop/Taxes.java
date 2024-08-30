package com.example.shop;

import com.example.fasade.Support;
import com.example.fasade.SupportService;

public class Taxes implements Support {
    Support service;

    public Taxes(SupportService service) {
        this.service = service;
    }

    @Override
    public String chatWithTheSupportService(String theEssenceRequest) {
        return new String(theEssenceRequest);
    }

    public void responseToTheSupportService() {
        service.chatWithTheSupportService("*вложенный фаил");
    }
}