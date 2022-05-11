import java.util.Scanner;
public class StackMain {
    public static void main(String[] bool) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Stack stk = new Stack(5);

        char pilih;
        do {
            System.out.print("Jenis : ");
            String jenis = sc.nextLine();
            System.out.print("Warna : ");
            String warna = sc.nextLine();
            System.out.print("Merk : ");
            String merk = sc.nextLine();
            System.out.print("Ukuran : ");
            String ukuran = sc.nextLine();
            System.out.print("Harga : ");
            double harga = input.nextDouble();

            Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
            System.out.println("Apakah Anda Ingin Menambahkan Data Baru ke Dalam Stack ? (y/n)");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            stk.push(p);
        } while (pilih == 'y');

        //stk.print();
        //stk.pop();
        //stk.peek();
        //stk.print();

        System.out.println("Daftar Fitur :");
        System.out.println("1. Push\n2. Pop\n3. Peek\n4. Print\n5. Keluar");
        int i=0;
        while (i<1) {
            System.out.print("Pilih Fitur :");
            int nomor = input.nextInt();
            if (nomor==1) {
                System.out.print("Jenis : ");
                String jenis = sc.nextLine();
                System.out.print("Warna : ");
                String warna = sc.nextLine();
                System.out.print("Merk : ");
                String merk = sc.nextLine();
                System.out.print("Ukuran : ");
                String ukuran = sc.nextLine();
                System.out.print("Harga : ");
                double harga = input.nextDouble();
                sc.nextLine();

                Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
                stk.push(p);
            } else if (nomor==2) {
                stk.pop();
            } else if (nomor==3) {
                stk.peek();
            } else if (nomor==4) {
                stk.print();
            } else {
                i++;
            }
        }
    }
}
