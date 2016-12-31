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
@Named(value = "calculator")
@RequestScoped
public class Calculator {

    /**
     * Creates a new instance of Calculator
     */
    public Calculator() {
    }
    
    private int firstnumber;
    private int secondnumber;
    private int result;

    public String add() {
        result = firstnumber + secondnumber;
        return null;
    }

    public String subtract() {
        result = firstnumber - secondnumber;
        return null;
    }

    public String multiply() {
        result = firstnumber * secondnumber;
        return null;
    }

    public String divide() {
        result = firstnumber / secondnumber;
        return null;
    }

    public int getFirstnumber() {
        return firstnumber;
    }

    public void setFirstnumber(int firstnumber) {
        this.firstnumber = firstnumber;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getSecondnumber() {
        return secondnumber;
    }

    public void setSecondnumber(int secondnumber) {
        this.secondnumber = secondnumber;
    }
    
}
