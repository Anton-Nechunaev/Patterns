package com.example.shop;

import com.example.fasade.Support;
import com.example.fasade.SupportService;

public class Delivery implements Support{
    Support service;

    public Delivery(SupportService service) {
        this.service = service;
    }

    @Override
    public String chatWithTheSupportService(String theEssenceRequest) {
        return new String(theEssenceRequest);
    }

    public void makingADelivery(){
        //ложная логика оформления доставки.
        service.chatWithTheSupportService("документы оформлены не правильно.");
    }

}
