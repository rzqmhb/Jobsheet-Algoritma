import java.util.Scanner;
public class Nomor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kubus arrK[] = new Kubus[3];
        Balok arrB[] = new Balok[3];
        Kerucut arrKr[] = new Kerucut[3];
        for(int i=0; i<arrK.length; i++){
            System.out.print("Masukkan atribut sisi Kubus ke-" + (i+1) + " : ");
            int a = sc.nextInt();
            arrK[i] = new Kubus(a);
            int volume = arrK[i].hitungVolume();
            int luasPermukaan = arrK[i].hitungLuasPermukaan();
            System.out.println("Volume Kubus ke-" + (i+1) + " = " + volume);
            System.out.println("Luas Permukaan Kubus ke-" + (i+1) + " = " + luasPermukaan);
        }

        for(int i=0; i<arrB.length; i++){
            System.out.print("Masukkan atribut panjang Balok ke-" + (i+1) + " : ");
            int a = sc.nextInt();
            System.out.print("Masukkan atribut lebar Balok ke-" + (i+1) + " : ");
            int b = sc.nextInt();
            System.out.print("Masukkan atribut tinggi Balok ke-" + (i+1) + " : ");
            int c = sc.nextInt();
            arrB[i] = new Balok(a, b, c);
            int volume = arrB[i].hitungVolume();
            int luasPermukaan = arrB[i].hitungLuasPermukaan();
            System.out.println("Volume Balok ke-" + (i+1) + " = " + volume);
            System.out.println("Luas Permukaan Balok ke-" + (i+1) + " = " + luasPermukaan);
        }

        for(int i=0; i<arrKr.length; i++){
            System.out.print("Masukkan atribut jari-jari Kerucut ke-" + (i+1) + " : ");
            double a = sc.nextInt();
            System.out.print("Masukkan atribut tinggi Kerucut ke-" + (i+1) + " : ");
            double b = sc.nextInt();
            arrKr[i] = new Kerucut(a, b);
            double volume = arrKr[i].hitungVolume();
            double luasPermukaan = arrKr[i].hitungLuasPermukaan();
            System.out.println("Volume Kerucut ke-" + (i+1) + " = " + volume);
            System.out.println("Luas Permukaan Kerucut ke-" + (i+1) + " = " + luasPermukaan);
        }

        sc.close();
    }
}

class Kubus{
    int sisi;
    Kubus(int a){
        sisi=a;
    }

    int hitungVolume(){
        return sisi*sisi*sisi;
    }

    int hitungLuasPermukaan(){
        return 6*sisi*sisi;
    }
}

class Balok{
    int panjang, lebar, tinggi;
    Balok(int a, int b, int c){
        panjang=a;
        lebar=b;
        tinggi=c;
    }

    int hitungVolume(){
        return panjang*lebar*tinggi;
    }

    int hitungLuasPermukaan(){
        return 2*((panjang*lebar) + (panjang*tinggi) + (lebar*tinggi));
    }
}

class Kerucut{
    double jariJari, tinggi, sisiMiring;
    Kerucut(double a, double b){
        jariJari=a;
        tinggi=b;
        sisiMiring=Math.sqrt((a*a)+(b*b));
    }

    double hitungVolume(){
        return (Math.PI*jariJari*jariJari*tinggi)/3;
    }

    double hitungLuasPermukaan(){
        return (Math.PI*jariJari*jariJari) + (Math.PI*jariJari*sisiMiring);
    }
}
