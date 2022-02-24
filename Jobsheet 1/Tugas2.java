import java.util.Scanner;
public class Tugas2 {
    
    static double kecepatan=0;
    static double jarak=0;
    static double waktu=0;
    public static void main(String[] args) {
        tampilMenu();
    }

    static void tampilMenu(){
        kecepatan=0;
        jarak=0;
        waktu=0;
        Scanner sc1=new Scanner(System.in);
        System.out.println("Daftar rumus : \n1. Hitung Kecepatan\n2. Hitung Jarak\n3. Hitung Waktu");
        System.out.print("Pilih nomor rumus : ");
        int pilih = sc1.nextInt();
        if (pilih == 1) {
            hitungKecepatan();
        }else if (pilih == 2) {
            hitungJarak();
        }else if (pilih == 3) {
            hitungWaktu();
        }else if (pilih == 0){
            
        }else{
            System.out.println(" Kode Salah, Ulangi Kembali");
            tampilMenu();
        }
        sc1.close();
    }

    static void hitungKecepatan(){
        Scanner sc2=new Scanner(System.in);
        System.out.print("Masukkan nilai jarak : ");
        jarak = sc2.nextInt();
        System.out.print("Masukkan nilai waktu : ");
        waktu = sc2.nextInt();
        kecepatan = jarak/waktu;
        System.out.println("Nilai Kecepatan = " + kecepatan);
        tampilMenu();
        sc2.close();
    }

    static void hitungJarak(){
        Scanner sc3=new Scanner(System.in);
        System.out.print("Masukkan nilai kecepatan : ");
        kecepatan = sc3.nextInt();
        System.out.print("Masukkan nilai waktu : ");
        waktu = sc3.nextInt();
        jarak = kecepatan * waktu;
        System.out.println("Nilai Jarak = " + jarak);
        tampilMenu();
        sc3.close();
    }

    static void hitungWaktu(){
        Scanner sc4=new Scanner(System.in);
        System.out.print("Masukkan nilai jarak : ");
        jarak = sc4.nextInt();
        System.out.print("Masukkan nilai kecepatan : ");
        kecepatan = sc4.nextInt();
        waktu = kecepatan/jarak;
        System.out.println("Nilai Waktu = " + waktu);
        tampilMenu();
        sc4.close();
    }
}
