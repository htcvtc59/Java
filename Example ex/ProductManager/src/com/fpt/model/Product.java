/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.model;

/**
 *
 * @author datht2@fpt.edu.vn
 */
public class Product {
    public String id;
    public String name;
    public float price;
    public boolean check;

    public Product(String id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.check=true;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + '}';
    }
    
    
    public static boolean addProduct(Product product){
        return true;
    }
    
}
