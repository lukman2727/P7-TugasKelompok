/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shape;

/**
 *
 * @author Lukman
 */
public class Circle extends Shape {
    public int jarijari;
    public Circle(String n){
        nama=n;
    }
    public String getName(){
        return nama;
    }
    public void setArea(int r){
        jarijari=r;
        Area=(3.14*jarijari*jarijari);
    }
    public double getArea(){
        return Area;
    }

    public static void main(String []args){
        Circle x = new Circle("Lingkaran Satu");
        x.setArea(7);
        System.out.println("Nama : "+x.getName());
        System.out.println("Luas : "+x.getArea());
    }
}
