/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shape;

/**
 *
 * @author Lukman
 */
abstract class Shape {
    public String nama;
    public double Area;

    public Shape(){

    }
    abstract public String getName();
    abstract public double getArea();
}
