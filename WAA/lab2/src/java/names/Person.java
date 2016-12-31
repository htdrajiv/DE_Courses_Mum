/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package names;

/**
 *
 * @author Rajiv
 */
public class Person {
    private int key;
    private String firstName;
    private String lastName;
    public Person(int key,String firstName, String lastName){
        this.key = key;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getKey(){
        return this.key;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
}
