/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.io.Serializable;

/**
 *
 * @author Rajiv
 */
@Named(value = "loginManagedBean")
@RequestScoped
public class LoginManagedBean implements Serializable {
    String username;
    String password;
    String message;    
    /**
     * Creates a new instance of LoginManagedBean
     */
    public LoginManagedBean() {}
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String validate(){
        if(this.username.equals("k101") && this.password.equals("yoyo")){
            this.message = "Welcome "+this.username;
        }else this.message = "Wrong userid or password";
        return "response";
    }
    
    public void displayMsg(){
        System.out.println("Hello "+getUsername());
    }
    
}
