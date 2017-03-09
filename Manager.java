/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package employee;

/**
 *
 * @author Lukman
 */
public class Manager extends Employee{
    int bonus;
    public Manager(String name,String address, int salary){
        super(name,address,salary);
    }
    public int getBonus(){
        return bonus;
    }
    public void setBonus(int bonus){
        this.bonus=bonus;
    }

    @Override
    public int getSalary() {
        return salary + bonus;
    }


}
