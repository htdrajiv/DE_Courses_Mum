
package model;

/**
 * Created by Rajiv on 3/5/2017.
 */
public class Customer extends Account {

    public Customer(String name){
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer with name : "+name;
    }
}