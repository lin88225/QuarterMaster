package com.example.quartermaster;

public class Item {
    private String itemOwnerEmail, itemType;
    private int itemNumber;
    //Declaring details of item
    public Item(String itemOwnerEmail, String itemType){
        this.itemOwnerEmail = itemOwnerEmail;
        this.itemType = itemType;
    }

}