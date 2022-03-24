import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah voting");
        int suara = input.nextInt();
        Voting vote = new Voting(suara);
        input.nextLine();
        for(int i = 0; i < suara; i++){
            System.out.println("Masukkan Nama/Suara ke - "+ (i+1) + " = ");
            vote.vote[i] = input.nextLine();
        }
        int hasil = vote.ModusArray(vote.vote, vote.awal, vote.panjang, vote.hasil);
        System.out.println(" Mayoritaas Jumlah Suara adalah : " + vote.vote[hasil]);        
        input.close();
    }
}

class Voting{
    int panjang, awal=0, hasil=0;
    String[] vote;

    Voting(int a){
        this.panjang = a;
        this.vote = new String[a];
    }

    public int ModusArray(String[] nama, int awal, int length, int hasil) {
        int middle = length / 2;
        int akhirArrayKiri = middle - 1;
        int akhirArrayKanan = length - 1;
        return rekursifDC(nama, awal, hasil, akhirArrayKanan, akhirArrayKiri, middle);
    }

    public int rekursifDC(String[] nama, int awal, int hasil, int akhirArrayKanan, int akhirArrayKiri, int middle) {
        if (akhirArrayKanan == (akhirArrayKiri + 1) && akhirArrayKiri == (awal + 1)) {
            return hasil;
        } else {
            if (awal != akhirArrayKiri) {
                if (nama[awal].equalsIgnoreCase(nama[akhirArrayKiri])) {
                    return hasil = awal;
                } else {
                    return rekursifDC(nama, awal, hasil, akhirArrayKanan, (akhirArrayKiri - 1), middle);
                }
            } else {
                if (nama[middle].equalsIgnoreCase(nama[akhirArrayKanan])) {
                    return hasil = middle;
                } else {
                   return rekursifDC(nama, middle, hasil, (akhirArrayKanan - 1), akhirArrayKiri, middle);
                }
            }
        }
    }
}