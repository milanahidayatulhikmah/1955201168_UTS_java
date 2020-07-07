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

   import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class contohBufferedReader {
    public static void main(String[] args)
            throws IOException {
       
        
       InputStreamReader isr = new InputStreamReader(System.in);
       //objek buffered
       BufferedReader br = new BufferedReader(isr);
       
       String nama ;
       String status ;
       String alamat ;
       int umur ;
       int tinggi ;
       double berat;
       double nomorWA ;
               
        System.out.println("=======");
       
        System.out.println("Siapa Nama tante      :");
        nama = br.readLine();
        
        System.out.println("Udah Punya Pasangan :");
        status = br.readLine();
        
        System.out.println("Alamat rumah          :");
        alamat = br.readLine();
        
        System.out.println("umur tante :");
        umur = Integer.parseInt(br.readLine());
       
        System.out.println("Tinggi badan tante         :");
        tinggi = Integer.parseInt(br.readLine());
        
        System.out.println("berat badan tante :");
        berat = Double.parseDouble(br.readLine());
        
        System.out.println("nomo WA        :");
        nomorWA = Double.parseDouble(br.readLine());
        
       //menampilkan nama
        System.out.println("=========");
        System.out.println("Nama Anda Adalah     :" + nama);
        System.out.println("Status Anda          :" + status);
        System.out.println("Alamat Anda          :" + alamat);
        System.out.println("Ternyata Umur Anda   : "+umur);
        System.out.println("Ternyata Tinggi Anda :" + tinggi);
        System.out.println("berat badan Anda:" + berat);
        System.out.println("nomor WA Anda             :" +nomorWA);
         
}
}
