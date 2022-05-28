import java.util.Scanner;
public class AntrianVaksin {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        DoubleLinkedLists antri = new DoubleLinkedLists();
        int i = 0;
        while(i < 1){
            menu();
            int pilih = sc.nextInt();
            if (pilih == 1) {
                System.out.println("-----------------------------");
                System.out.println("Masukkan Data Penerima Vaksin");
                System.out.println("-----------------------------");
                System.out.print("Nomor Antrian : ");
                int nomor = sc.nextInt();
                System.out.print("Nama Penerima : ");
                String nama = input.nextLine();
                input.nextLine();
                if (antri.isEmpty()) {
                    antri.addFirst(nomor, nama);
                } else {
                    antri.addLast(nomor, nama);
                }
            } else if (pilih == 2) {
                antri.removeFirst();
            } else if (pilih == 3) {
                antri.print();
            } else {
                antri.clear();
                i++;
            }
        }
    }

    static void menu(){
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
    }
}