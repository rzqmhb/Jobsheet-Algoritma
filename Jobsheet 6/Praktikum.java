import java.util.Scanner;
public class Praktikum {
    public static void main(String[] bool) {
        Scanner sc = new Scanner(System.in);
        int data[] = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
        Proses p = new Proses(data);
        System.out.println("Data Awal :");
        p.tampil();
        System.out.println("\n=========================");
        System.out.println("Data Terurut :");
        p.sorting();
        p.tampil();
        System.out.println("\n=========================");

        p.tampilPencarian();
    }
}

class Proses{
    int data[] = new int[10];
    int maks=0, jum=0;

    Proses(int[] a){
        this.data = a;
    }

    void tampil(){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    void tampilPencarian(){
        int posisi = binarySearch(maks, 0, data.length-1);
        System.out.println("\n=========================");
        System.out.println("Nilai Data Terbesar pada Array : " + maks);
        System.out.print("Nilai Tersebut Berada Pada Posisi : ");
        for (int i = data.length-jum; i < data.length; i++) {
            System.out.print(i+1 + ", ");
        }
        System.out.println("\n=========================");
    }

    void sorting(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length-i; j++) {
                if(data[j-1] > data[j]){
                    int temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
            maks = data[data.length-1];
            if(data[i] == maks){
                jum++;
            }
        }
    }

    int binarySearch(int cari, int left, int right){
        int mid;
        if(right>=left){
            mid = (right+left)/2;
            if (cari == data[mid]) {
                return mid;
            } else if (cari < data[mid]) {
                return binarySearch(cari, mid+1, right);
            } else {
                return binarySearch(cari, left, mid-1);
            }
        }
        return -1;
    }
}

