/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;
public class Dialog1 {
    public static void main(String[] args) {
      //  JOptionPane.showMessageDialog(null, "Welcome\nto\nJava");
        String name = JOptionPane.showInputDialog("โปรดใส่ชื่อของคุณ");
        String message = String.format("Welcome %s to Java Programming ", name);
        JOptionPane.showMessageDialog(null, message);
    }
}


