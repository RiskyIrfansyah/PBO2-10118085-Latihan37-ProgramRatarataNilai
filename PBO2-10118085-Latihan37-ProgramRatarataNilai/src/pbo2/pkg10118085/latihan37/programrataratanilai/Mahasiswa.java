/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118085.latihan37.programrataratanilai;

/**
 *
 * @author Risky
 * Nama     : Risky Irfansyah
 * Kelas    : PBO2
 * Nim      : 10118085
 * Deskripsi Tugas : Program Rata-Rata Nilai
 */
public class Mahasiswa {
    
    private double nilai;
    private int JumlahMahasiswa;
    
    public void setNilai(double nilai){
        this.nilai = this.nilai + nilai;
    }

    public int getJumlahMahasiswa() {
        return JumlahMahasiswa;
    }

    public void setJumlahMahasiswa(int JumlahMahasiswa) {
        this.JumlahMahasiswa = JumlahMahasiswa;
    }
    
    public double hitungRataRata(){
        return nilai / JumlahMahasiswa;
    }
    
}
