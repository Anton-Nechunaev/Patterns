package com.example.fasade;

import com.example.shop.*;

public class SupportService implements Support {
    Delivery delivery;
    Packaging packaging;
    Suppliers suppliers;
    Taxes taxes;
    Warehouse warehouse;

    public SupportService() {
        this.delivery = new Delivery(this);
        this.packaging = new Packaging(this);;
        this.suppliers = new Suppliers(this);;
        this.taxes = new Taxes(this);;
        this.warehouse = new Warehouse(this);;
    }

    @Override
    public String chatWithTheSupportService(String theEssenceRequest) {
        return theEssenceRequest;
    }
    public void deliveryProblem(){
        delivery.chatWithTheSupportService("Почему товар не доставлен?");
    }
    public void packagingProblem(){
        packaging.chatWithTheSupportService("Почему товар плохо упакован?");
    }
    public void suppliersProblem(){
        suppliers.chatWithTheSupportService("Когда будет поставка?");
    }
    public void taxesProblem(){
        taxes.chatWithTheSupportService("Нужна справка по форме N");
    }
    public void warehouseProblem(){
        warehouse.chatWithTheSupportService("Почему товар задерживается на складе?");
    }
}
