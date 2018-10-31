package com.company;

public enum TShirtProperties {
    S,
    M,
    L,
    XL;

    private TShirtProperties size;
    private String manufacturer;

    TShirtProperties(TShirtProperties size,String manufacturer){
        this.size=size;
        this.manufacturer=manufacturer;
        System.out.println("siema");
        

    }

}
