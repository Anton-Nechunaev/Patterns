package com.example.shop;

import com.example.fasade.Support;
import com.example.fasade.SupportService;

public class Warehouse implements Support {
    SupportService service;

    public Warehouse(SupportService service) {
        this.service = service;
    }

    @Override
    public String chatWithTheSupportService(String theEssenceRequest) {
        return new String(theEssenceRequest);
    }

    public void responseToTheSupportService() {
        service.chatWithTheSupportService("Товар оказался не правильно прономерован это наша вина. Начислите клиенту бонусы.");
    }
}