/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

/**
 *
 * @author A407MA
 */
public class PERULANGANFOR {
   
     public static void main(String[] args) {
         int n = 4;
        String mandi = "" ;
    System.out.println("Mulai");
    System.out.println("Siapkan sabun");
    System.out.println("usapkan sabun");
    System.out.println("bilas dengan air");

      
//      misalkan tubuh sudah bersih
    String tubuh;  
    tubuh = "bersih";
    System.out.println("apakah tubuh sudah bersih");
   if("bersih".equals(tubuh)){
    System.out.println("sudah bersih");
    }
   else {
   System.out.println("belum bersih");
}
  for (int i = 1; i <n; i++) {
    System.out.println("bilas dengan air lagi - " + i);
//		hitung++;
    }
     System.out.println("tidak perlu dibilas lagi");
     System.out.println("selesai");  
}
}