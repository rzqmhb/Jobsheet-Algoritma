package pertemuan_12.tugas.no2;

import java.util.Scanner;

public class DoubleLinkedListsMain {

    public static void menu() {
        System.out.println("\nPilih Menu:");
        System.out.println("1. Tambah data awal");
        System.out.println("2. Tambah data akhir");
        System.out.println("3. Tambah data index tertentu");
        System.out.println("4. Hapus data pertama");
        System.out.println("5. Hapus data terakhir");
        System.out.println("6. Hapus data tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari id film");
        System.out.println("9. Urut data rating film-DESC");
        System.out.println("10. Keluar");
        System.out.println("-------------------");
    }

    public static void main(String[] args) throws Exception {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        Scanner sc = new Scanner(System.in);
        int pilih, id, index;
        String nama;
        double rating;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {

                case 1:
                    System.out.print("id Film: ");
                    id = sc.nextInt();
                    System.out.print("Nama: ");
                    sc.nextLine();
                    nama = sc.nextLine();
                    System.out.print("Rating: ");
                    rating = sc.nextDouble();
                    Film mv = new Film(id, nama, rating);
                    dll.addFirst(mv);
                    break;
                case 2:
                    System.out.print("id Film: ");
                    id = sc.nextInt();
                    System.out.print("Nama: ");
                    sc.nextLine();
                    nama = sc.nextLine();
                    System.out.print("Rating: ");
                    rating = sc.nextDouble();
                    mv = new Film(id, nama, rating);
                    dll.addLast(mv);
                    break;
                case 3:
                    System.out.print("id Film: ");
                    id = sc.nextInt();
                    System.out.print("Nama: ");
                    sc.nextLine();
                    nama = sc.nextLine();
                    System.out.print("Rating: ");
                    rating = sc.nextDouble();
                    System.out.print("Masukkan indeks: ");
                    index = sc.nextInt();
                    mv = new Film(id, nama, rating);
                    dll.add(mv, index);
                    break;
                case 4:
                    System.out.println("\nFilm : " + dll.head.movie.nama + " berhasil dihapus");
                    dll.removeFirst();
                    break;
                case 5:
                    dll.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan indeks: ");
                    index = sc.nextInt();
                    dll.remove(index);
                    break;
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.print("Masukkan id film: ");
                    int key = sc.nextInt();
                    dll.indexOf(key);
                    break;
                case 9:
                    dll.filmSort();
                    break;
                case 10:
                    System.out.println("Terima Kasih");
                    break;
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7
                || pilih == 8 || pilih == 9);
    }
}