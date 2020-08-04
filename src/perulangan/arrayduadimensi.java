package belanja;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author revnant
 */
public class arrayduadimensi {
     public static void main(String[] args) {
        String siswa[][]={
           
           {"andi","alfin","bayu"},
           {"akbar","herdiyang","cindy"},
           {"milana","bagas","sella"},  
       };
         for (String[] siswa1 : siswa) {
             for (int col = 0; col<siswa.length; col++) {
                 System.out.print("\t" + siswa1[col]);
             }
             System.out.println();
         }
    }
    

}
