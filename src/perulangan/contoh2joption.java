package perulangan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A407MA
 */

import javax.swing.JOptionPane;
        
public class contoh2joption {
    public static void main(String[] args) {
         String jenis = JOptionPane.showInputDialog("jenis makanan");
         String jumlah = JOptionPane.showInputDialog("jumlah makanan");
         String harga = JOptionPane.showInputDialog("harga makanan");
         String total = JOptionPane.showInputDialog("total yang harus dibayar");
         String tempatduduk = JOptionPane.showInputDialog("pilih tempat duduk");
         
         
        int Jumlah = Integer.parseInt(jumlah);
         int Total= 30000;
        double biaya = Jumlah*Total;
         
         System.out.println("jenis makanan  :" + jenis);
         System.out.println("jumlah makanan :" +jumlah);
         System.out.println("harga makanan  :"+ harga);
         System.out.println("total yang harus dibayar  :"+total);
         System.out.println("pilih tempat duduk :"+tempatduduk);
         
         
         
                
                
        
    }
}

    

