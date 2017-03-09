/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package employee;

/**
 *
 * @author Lukman
 */
public class Employee {
    String name;
    String address;
    int salary;

    public Employee(String name, String address, int salary){
        this.name=name;
        this.address=address;
        this.salary=salary;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
