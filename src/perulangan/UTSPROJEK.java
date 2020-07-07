/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

import java.util.Scanner;

/**
 *
 * @author A407MA
 */

    import java.util.Scanner;
public class UTSPROJEK {
    public static void main(String[] args) {
      //Java Library Scanner
       Scanner scan = new Scanner(System.in);
       
        System.out.println("===========================================");
            System.out.println("||          NOMER JURUSAN              ||");
            System.out.println("========================================");
            System.out.println("o JURUSAN               | o HARGA       ");
            System.out.println("1.Surabaya - Mojokerto  | Rp. 30.000    ");
            System.out.println("2.Surabaya - Bandung    | Rp. 50.000    ");
            System.out.println("3.Surabaya - Jember     | Rp. 120.000    ");
            System.out.println("======================================");
            

        //Pembayaran & kembalian
        int bayar, kembalian;
        //Harga awal
        int harga  = 0;
        //Harga Per-Item Menu
        int t1 = 30000, t2 = 50000, t3 = 12000;
        String Jurusan = null;
        
        //Variable Menu
        int njNomor = 0, njJumlah = 0;
        
        for (String i = "Y"; i.equals("Y")||i.equals("y"); )
        {
        System.out.println("_____________________________________");
        //Input No Pesanan pada menu
        System.out.print("Pilih Nomor Jurusan yang ada di Menu : ");
        njNomor = scan.nextInt();
        System.out.print("Masukkan Jumlah Tiket : ");
        njJumlah = scan.nextInt();
        System.out.println("_____________________________________");
        
            switch (njNomor) {
                case 1:
                    //jika di pilih nomor satu, maka yang akan muncul adalah menu Nasi Goreng, dan hargan yang ter tera pada item int pada m1.
                    Jurusan = " Surabaya - Mojokerto";
                    System.out.println("Pilihan anda nomor " +njNomor + " adalah" + Jurusan);
                    harga = harga + t1 * njJumlah;
                    break;
                case 2:
                    //jika di pilih nomor dua, maka yang akan muncul adalah menu Ayam Geprek, dan hargan yang ter tera pada item int pada m2.
                    Jurusan = " Surabaya - Bandung ";
                    System.out.println("Pilihan anda nomor " +njNomor + " adalah" + Jurusan);
                    harga = harga + t2 * njJumlah;
                    break;
                case 3:
                    //jika di pilih nomor tiga, maka yang akan muncul adalah menu Mie Ayam, dan hargan yang ter tera pada item int pada m3.
                    Jurusan= " Surabaya - Jember";
                    System.out.println("Pilihan anda nomor " +njNomor + " adalah" + Jurusan);
                    harga = harga + t3 * njJumlah;
                    break;
                
                    //jika di pilih selain nomor satu sampai enam, maka akan ditampilkan "Nomor yang dipilih tidak ada di menu."
                default:
                    System.out.println("Nomor pesanan yang dipilih tidak ada pada daftar menu di atas.");
                    break;
            }
            
            System.out.println("Total Yang harus di bayar = Rp."+harga);
            System.out.println("Masukkan Jumlah Uang : ");
            bayar = scan.nextInt();
            kembalian = bayar-harga;
            System.out.println("======================================");
            System.out.println("||             LOKET                 ||");
            System.out.println("||              SATU                ||");
            System.out.println("||        Telp. 081259780718        ||");
            System.out.println("======================================");
            System.out.println("Anda Memesan :                        ");
            System.out.println(" " + Jurusan +"   " + "X"+njJumlah +"   " + "Rp"+ harga);
            System.out.println("--------------------------------------");
            System.out.println("Total                " + "Rp" + harga);
            System.out.println("Jumlah Uang          " + "Rp" + bayar);
            System.out.println("Kembalian            " + "Rp" + kembalian);
            System.out.println("======================================");
            System.out.println("||            Terima Kasih          ||");
            System.out.println("||          Selamat Menikmati       ||");
            System.out.println("======================================");

            
            System.out.print("Apakah anda ingin Memesan Lagi? [Y/T] : ");
            i = scan.next();
            
}
    }
}
        
    