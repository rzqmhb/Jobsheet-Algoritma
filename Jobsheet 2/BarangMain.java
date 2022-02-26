public class BarangMain {
    public static void main(String[] args) {
        Barang b1 = new Barang("Legion", 22000000, 2);
        int harga = b1.hitungHargaTotal();
        int diskon = b1.hitungDiskon(harga);
        int bayar = b1.hitungHargaBayar(harga, diskon);
        System.out.println("Nama Barang : " + b1.nama + "\nJumlah\t : " + b1.jumlah + "\nHarga\t : Rp" + harga);
        System.out.println("Diskon\t : Rp" + diskon + "\nTotal\t : Rp" + bayar);
    }
}

class Barang{
    String nama;
    int hargaSatuan, jumlah;
    
    Barang(String nm, int hs, int jmlh){
        nama = nm;
        hargaSatuan = hs;
        jumlah = jmlh;
    }

    int hitungHargaTotal(){
        int hargaTotal = hargaSatuan * jumlah;
        return hargaTotal;
    }

    int hitungDiskon(int n){
        double diskon=0;
        if (n > 10000) {
            diskon = n * 0.1;
        } else if(n >= 50000 || n <=100000){
            diskon = n * 0.05;
        } else {
            diskon = 0;
        }
        int a = (int) diskon;
        return a;
    }

    int hitungHargaBayar(int n, int m){
        int bayar =  n - m;
        return bayar;
    }
}