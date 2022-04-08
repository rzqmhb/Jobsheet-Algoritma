package Latihan;

public class Mahasiswa {
    int nim, umur;
    String nama;
    double ipk;

    Mahasiswa(int ni, String na, int u, double i){
        this.nim = ni;
        this.nama = na;
        this.umur = u;
        this.ipk = i;
    }

    void tampil(){
        System.out.println("NIM\t: " + nim);
        System.out.println("Nama\t: " + nama);
        System.out.println("Umur\t: " + umur);
        System.out.println("IPK\t: " + ipk);
    }
}
