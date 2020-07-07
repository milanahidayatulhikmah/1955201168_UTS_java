/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;



    import javax.swing.JOptionPane;

public class IFels {
        
    public static void main(String[] args) {
        
        String sapa = JOptionPane.showInputDialog( null,"hay");
        String nama = JOptionPane.showInputDialog( null, "Nama kamu siapa");
        String bicara = JOptionPane.showInputDialog( null,"rumahnya mana");
        int nomor= Integer.parseInt(JOptionPane.showInputDialog( null,"boleh minta nomornya nggak"));
        
        
       if(+62>= nomor){
           JOptionPane.showMessageDialog(null,"Ternyata" + nomor+"tidak diperbolehkan");
       }else{
           JOptionPane.showMessageDialog(null,"Ternyata " + nomor + ",diperbolehkan");
       }
    } 
}

