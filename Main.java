/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package employee;

/**
 *
 * @author Lukman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager boss = new Manager("Nama boss","Bandung",800000);
        boss.setBonus(200000);

        Employee[] em = new Employee[3];
        em[0] = boss;
        em[1] = new Staff("Nama Staff 1", "Bandung",200000);
        em[2] = new Staff("Nama Staff 2", "Bandung",400000);

        for (int i = 0;i < em.length;i++){
            System.out.println(em[i].getName()+"      "+em[i].getSalary());
        }
    }

}
