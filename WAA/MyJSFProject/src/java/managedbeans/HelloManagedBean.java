/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Rajiv
 */
@Named(value = "helloManagedBean")
@RequestScoped
public class HelloManagedBean {

    /**
     * Creates a new instance of HelloManagedBean
     */
    public HelloManagedBean() {
    }
    
    private String name;
    public String getName() {
    return this.name;
    }
    public void setName(String name) {
    this.name = name;
    }
    public String sayHello() {
        this.name = "hello "+this.name;
        return null;
    } 
    
}
