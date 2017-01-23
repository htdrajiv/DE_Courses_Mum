/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingCart;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Rajiv
 */
@Named(value = "shoppingCartBean")
@SessionScoped
public class ShoppingCartBean implements Serializable {

    /**
     * Creates a new instance of ShoppingCartBean
     */
    public ShoppingCartBean() {
    }
    
    public static final List<Product> availableProducts;
    static{
        availableProducts = new ArrayList<>();
        Product p1 = new Product("R1000","Rock n Roll",12.95);
        Product p2 = new Product("R1202","Ringing Bells",9.24);
        Product p3 = new Product("R2398","Remote Control",7.10);
        Product p4 = new Product("B3290","Bang Bang",10.14);
        Product p5 = new Product("U2001","U n Me",15.85);
        Product p6 = new Product("A2000","Angry man",11.12);
        Product p7 = new Product("A1098","Ambition",12.14);
        Product p8 = new Product("A2889","Auction",10.32);
        Product p9 = new Product("P6758","Players",11.22);
        Product p10 = new Product("W2145","World class",14.20);
        availableProducts.addAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10));        
    }
    
    public List<Product> getAvailableProducts(){
        return availableProducts;
    }
    
    private List<ProductWrapper> cart = new ArrayList<>();
    private Map<Product,ProductWrapper> productsAdded = new HashMap<>();
    private Double totalPrice;

    public List<ProductWrapper> getProducts() {
        return cart;
    }

    public void setProducts(List<ProductWrapper> products) {
        this.cart = products;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public void addToCart(Product product){
        if(!productsAdded.keySet().contains(product)){
            ProductWrapper pw = new ProductWrapper(product);
            pw.setTotalPrice(product.getPrice());
            cart.add(pw);
            productsAdded.put(product,pw);
        }else{
            for(ProductWrapper p : cart){            
                if(p.product.getCode().equals(product.getCode())){
                    p.setQuantity(p.getQuantity()+1);
                    p.setTotalPrice(p.getTotalPrice() + (p.product.getPrice()));
                }
            }
        }
        calculateTotalPrice();
    }
    
    public void calculateTotalPrice(){
        Double totalPrice = 0.0;
        DecimalFormat dff=new DecimalFormat(".##");
        for(ProductWrapper product : cart){
            totalPrice += (product.product.getPrice() * product.getQuantity());
        }
        this.totalPrice = Double.parseDouble(dff.format(totalPrice));
    }
    
    public void removeSingleProductFromCart(Product product){
        ProductWrapper pw = productsAdded.get(product);
        if(pw!=null){
            if(pw.quantity==1){
                cart.remove(pw);
                productsAdded.remove(product);
            }else{
                pw.setQuantity(pw.getQuantity() - 1);
                pw.setTotalPrice(pw.getTotalPrice() - (pw.product.getPrice()));            
            }
        }        
        calculateTotalPrice();
    }
    
    public String removeFromCart(ProductWrapper product){
        cart.remove(product);
        productsAdded.remove(product.getProduct());
        calculateTotalPrice();
        return "shoppingCart.xhtml";
    }    

}
