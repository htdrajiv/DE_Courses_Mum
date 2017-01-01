/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.controller;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author Rajiv
 */
@Named(value = "validatorBean")
@RequestScoped
public class ValidatorBean {

    /**
     * Creates a new instance of ValidatorBean
     */
    public ValidatorBean() {
    }
    private String brand;
    
//    @Size(min = 8, max = 8)
    @Pattern(regexp = "[A-Z]{2}-[0-9]{2}-[A-Z]{2}", message = "Licence plate is not valid")
    private String licenseNo;
    
    private String price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
}
