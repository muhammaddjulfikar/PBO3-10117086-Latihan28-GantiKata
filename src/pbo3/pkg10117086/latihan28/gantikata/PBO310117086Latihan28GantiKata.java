/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117086.latihan28.gantikata;
import java.util.Scanner;

/**
 *
 * @author Lenovo NAMA : RD Muhammad Djulfikar BU 
 * KELAS : IF3 
 * NIM : 10117086
 * DESKRIPSI PROGRAM : program ganti kata
 */
public class PBO310117086Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //        deklarasi Variabel
        String kalimatAwal;
        String kalimatBaru;
        String gantiKata;
        String jadiKata;
        Scanner scn = new Scanner(System.in);

        System.out.println("====Program Ganti Kata====\n");
        System.out.print("Masukkan Kalimat : ");
        kalimatAwal = scn.nextLine();
        System.out.print("Ganti Kata : ");
        gantiKata = scn.next();
        System.out.print("Menjadi Kata : ");
        jadiKata = scn.next();

//        proses pergantian kata dengan kata yang lain
        kalimatBaru = (kalimatAwal).replaceAll(gantiKata, jadiKata);

//        menampilkan hasil perubahan kata
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat Awal : " + kalimatAwal);
        System.out.println("Kalimat Baru : " + kalimatBaru);

    }

}
