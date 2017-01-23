/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingCart;

import java.text.DecimalFormat;

/**
 *
 * @author Rajiv
 */
public class ProductWrapper {
    Product product;
    int quantity = 1;
    Double totalPrice;
    
    public ProductWrapper(Product product){
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getTotalPrice() {
        DecimalFormat dff=new DecimalFormat(".##");            
        return Double.parseDouble(dff.format(totalPrice));
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    @Override
    public String toString(){
        DecimalFormat dff=new DecimalFormat(".##");
        return ("Name: "+product.getName()+",  Code: "+product.getCode()+",   Quantity: "+quantity+",   Total Price: "+dff.format(totalPrice));
    }
    
}
