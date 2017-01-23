/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingCart;

/**
 *
 * @author Rajiv
 */
public class Product {

    public Product(String code, String name, Double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }
    
    private String code;
    private String name;
    private Double price;
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
