package com.kaibalya.quickbite;

public class orderModel {
    private String fooditem,symbol,price,orderid;

    public orderModel(String fooditem, String symbol, String price, String orderid) {
        this.fooditem = fooditem;
        this.symbol = symbol;
        this.price = price;
        this.orderid = orderid;
    }

    public String getFooditem() {
        return fooditem;
    }

    public void setFooditem(String fooditem) {
        this.fooditem = fooditem;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }
}
