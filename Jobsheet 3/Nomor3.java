import java.util.Scanner;
public class Nomor3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa arrMHS[] = new Mahasiswa[3];

        for(int i=0; i<3; i++){
            arrMHS[i] = new Mahasiswa();
            System.out.println("Masukkan data mahasiswa ke-" +(i+1));
            System.out.print("Masukkan nama : ");
            arrMHS[i].nama=sc.nextLine();
            System.out.print("Masukkan NIM : ");
            arrMHS[i].nim=sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan jenis kelamin : ");
            arrMHS[i].kelamin=sc.nextLine();
            System.out.print("Masukkan IPK : ");
            arrMHS[i].ipk=sc.nextDouble();
            sc.nextLine();
            System.out.println();
        }

        for(int i=0; i<3; i++){
            System.out.println("Data mahasiswa ke-" +(i+1));
            arrMHS[i].tampilData();
        }
        sc.close();
    }
}

class Mahasiswa{
    int nim;
    double ipk;
    String nama, kelamin;

    void tampilData(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Jenis Kelamin : " + kelamin);
        System.out.println("Nilai IPK : " + ipk);
    }
}
