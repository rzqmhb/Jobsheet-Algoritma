package Latihan;

import java.util.Scanner;
public class Lat1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianMHS data = new PencarianMHS();
        int jumMhs = 5;

        System.out.println("------------------------------");
        System.out.println("Masukkan data mahasiswa urut sesuai NIM :");

        for (int i=0; i<jumMhs; i++) {
            System.out.println("--------------");
            System.out.print("NIM : ");
            int nim = s.nextInt();
            System.out.print("Nama : ");
            String nama = s1.nextLine();
            System.out.print("Umur : ");
            int umur = s.nextInt();
            System.out.print("IPK : ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("------------------------------");
        System.out.println("Data Keseluruhan Mahasiswa :");
        data.tampil();

        System.out.println("______________________________");
        System.out.println("______________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan NIM Mahasiswa yang dicari :");
        System.out.print("NIM : ");
        int cari = s.nextInt();

        System.out.println("===============================");
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        System.out.println("===============================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.findBinarySearch(cari, 0, 4);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        s.close();
        s1.close();
    }
}
