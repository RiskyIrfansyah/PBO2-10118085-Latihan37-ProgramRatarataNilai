/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118085.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Risky
 * Nama     : Risky Irfansyah
 * Kelas    : PBO2
 * Nim      : 10118085
 * Deskripsi Tugas : Program Rata-Rata Nilai
 */
public class RataRataNilai {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa();
        
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        mahasiswa.setJumlahMahasiswa(scanner.nextInt());
        for (int i = 1; i <= mahasiswa.getJumlahMahasiswa(); i++){
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            mahasiswa.setNilai(scanner.nextDouble());
        }
        System.out.println("\nMaka, Rata-rata Nilainya adalah " + 
                mahasiswa.hitungRataRata());
        System.out.println("Developed By : Risky Irfansyah");
    }
}
