public class Tugas1 {
    public static void main(String[] args) {
        int ani = 4;
        int budi = 15;
        int bina = 6;
        int cita = 11;
        System.out.println("Berat laundry Ani = " + ani +" Kg");
        System.out.println("Berat laundry Budi = " + budi +" Kg");
        System.out.println("Berat laundry Bina = " + bina +" Kg");
        System.out.println("Berat laundry Cita = " + cita +" Kg");
        int bAni = hitungHarga(ani);
        int bBudi = hitungHarga(budi);
        int bBina = hitungHarga(bina);
        int bCita = hitungHarga(cita);
        int penghasilan = bAni + bBina + bBudi + bCita;
        System.out.println("Penghasilan Laundry = Rp" + penghasilan);
    }

    static int hitungHarga(int berat){
        double harga = 0;
        if(berat > 10){
            harga = berat * 4500;
            harga = harga - (harga*0.05);
        }else{
            harga = berat * 4500;
        }
        int bayar = (int) harga;
        return bayar;
    }
}
