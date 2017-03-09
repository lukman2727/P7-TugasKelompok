/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shape;

/**
 *
 * @author Lukman
 */
public class Square extends Shape {
    public int panjang;
    public Square(String n){
        nama=n;
    }
    public String getName(){
        return nama;
    }
    public void setArea(int p){
        panjang=p;
        Area=panjang*4;
    }
    public double getArea(){
        return Area;
    }

    public static void main(String []args){
        Square x = new Square("Lingkaran Satu");
        x.setArea(10);
        System.out.println("Nama : "+x.getName());
        System.out.println("Luas : "+x.getArea());
    }
}

