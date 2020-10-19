/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programpenilanganmaskersimdanstnk;

import java.util.*;
/**
 *
 * @author asus
 */
public class ProgramPenilanganMaskerSimdanSTNK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Program Penilangan
        Scanner inputUser = new Scanner(System.in);
        int jumlah,jenis;
        String nama;
        System.out.print("Masukkan Nama Anda : ");
        nama = inputUser.nextLine();
        System.out.print("Pilihan:\n 1. Tidak Pakai Masker\n 2. Tidak Membawa SIM\n 3. Tidak Membawa STNK\n");
        System.out.print("Pilih Jenis Pelanggaran Yang Telah Anda Lakukan : ");
        jenis = inputUser.nextInt();
        System.out.print("Jumlah Pelanggaran : ");
        jumlah = inputUser.nextInt();
        System.out.println("================");
        switch(jenis){
            case 1:
                System.out.println("Nama Pelanggar : " + nama);
                System.out.println("Jenis Pelanggaran : Tidak Pakai Masker");
                System.out.println("Besaran Denda Terhadap Jenis Pelanggaran : Rp 150.000 - Rp 500.000");
                System.out.println("Jumlah Pelanggaran : " + jumlah + " Kali");
                System.out.println("Total Denda Yang Harus Dibayarkan Sekitar : Rp " + jumlah*150000 + " - " + "Rp " + jumlah*500000);
            break;
            case 2:
                System.out.println("Nama Pelanggar : " + nama);
                System.out.println("Jenis Pelanggaran : Tidak Membawa SIM");
                System.out.println("Besaran Denda Terhadap Jenis Pelanggaran : Rp 300.000 - Rp 900.000");
                System.out.println("Jumlah Pelanggaran : " + jumlah + " Kali");
                System.out.println("Total Denda Yang Harus Dibayarkan Sekitar : Rp " + jumlah*300000 + " - " + "Rp " + jumlah*900000);
            break;
            case 3:
                System.out.println("Nama Pelanggar : " + nama);
                System.out.println("Jenis Pelanggaran : Tidak Membawa STNK");
                System.out.println("Besaran Denda Terhadap Jenis Pelanggaran : Rp 220.000 - Rp 650.000");
                System.out.println("Jumlah Pelanggaran : " + jumlah + " Kali");
                System.out.println("Total Denda Yang Harus Dibayarkan Sekitar : Rp " + jumlah*220000 + " - " + "Rp " + jumlah*650000);
            break;
            default:
            System.out.println("Terima Kasih Atas Kepatuhan Anda. Namun Apabila Terbukti Melanggar, Maka Anda Akan Dikenakan Sanksi Yang Lebih Berat");
        }
    }
    
}
