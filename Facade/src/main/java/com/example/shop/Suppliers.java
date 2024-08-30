package com.example.shop;

import com.example.fasade.Support;
import com.example.fasade.SupportService;

public class Suppliers implements Support {
    SupportService service;

    public Suppliers(SupportService service) {
        this.service = service;
    }

    @Override
    public String chatWithTheSupportService(String theEssenceRequest) {
        return new String(theEssenceRequest);
    }

    public void responseToTheSupportService() {
        service.chatWithTheSupportService("Поставка будет завтра");
    }
}
