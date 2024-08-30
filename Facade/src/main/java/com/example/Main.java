package com.example;

import com.example.fasade.SupportService;

public class Main {
    public static void main(String[] args) {
        SupportService service = new SupportService();
        Client client = new Client(service);
        client.theProblemWithTheProduct("Почему долгая доставка?"); //Клиент обращается в службу поддержки, а не на прямую в службу доставки.
    }
}