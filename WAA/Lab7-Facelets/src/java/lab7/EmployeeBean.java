/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Rajiv
 */
@Named(value = "employeeBean")
@SessionScoped
public class EmployeeBean implements Serializable {
    private List<Employee> employees = Arrays.asList(
            new Employee("1002","Frank Brown","625-345-2635","45089"),
            new Employee("1003","John Doe","625-345-3421","55847"),
            new Employee("1004","Mary Jones","625-345-1234","63254"));
    
    public void addEmployee(String id,String name,String phone,String salary){
        Employee emp = new Employee(id,name,phone,salary);
        employees.add(emp);
    }
    
    public List<Employee> getAllEmployees(){
        return this.employees;
    }
    
    public Employee getEmployee(String id){
        for(Employee emp:employees){
            if(emp.getId().equals(id)){
                return emp;
            }
        }
        return employees.get(0);
    } 
}
