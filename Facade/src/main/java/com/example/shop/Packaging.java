package com.example.shop;

import com.example.fasade.Support;
import com.example.fasade.SupportService;

public class Packaging implements Support {
    SupportService service;

    public Packaging(SupportService service) {
        this.service = service;
    }

    @Override
    public String chatWithTheSupportService(String theEssenceRequest) {
        return new String(theEssenceRequest);
    }
    public void responseToTheSupportService(){
        service.chatWithTheSupportService("Проверили по камерам, товар был упакован по всем требованиям.");
    }
}
