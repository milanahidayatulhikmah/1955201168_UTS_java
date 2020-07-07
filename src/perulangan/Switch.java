package perulangan;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A407MA
 */
public class Switch {
    
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog( null, "Nama Siapa Pak");
        String suhu  =JOptionPane.showInputDialog( null,"Cek Suhu Pak");
        
        switch(suhu){
            case "P":
                JOptionPane.showMessageDialog(null, "Astaga" +suhu+ "Anda P");
                //P = POSITIF
            
            break ;
            case "N":
             JOptionPane.showMessageDialog(null, "Alhamdulillah" +suhu+ "Anda N");
             //N = NEGATIF
             
            break ;
            case "O":
                 JOptionPane.showMessageDialog(null, "Astaga" +suhu+ "Anda O");
                 //O = ODP
                 
            break ;
            
            
            
            default :JOptionPane.showMessageDialog(null, "Suhu Yang Anda Masukkan Salah");   
            
}
    } 
} 