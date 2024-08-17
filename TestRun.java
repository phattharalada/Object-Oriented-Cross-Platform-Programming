/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 6652300346
 */
public class TestRun {

    public static void main(String[] args) {

        System.out.println("========================== Staff ============================");

        Staff ck = new Staff("Chanakarn Kingkaew", "85/1 PIM Nonthaburi", "PIM", 1_000_000);
        System.out.println(ck);

        System.out.println("========================== Student ============================");

        Student cv = new Student("Kim Taeyeon", "85/1 PIM Nonthaburi", "CPE", 2558, 50000);
        System.out.println(cv);
        
        System.out.println("========================== Student ============================");
        
        Student bam = new Student("Phattharalada Suksena", "303/29 Chanthaburi", "ET", 2566, 30000);
        System.out.println(bam);
    }

}
