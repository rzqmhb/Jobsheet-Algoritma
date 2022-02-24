import java.util.Scanner;
public class Pemilihan{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tugas, uts, uas;
        double nilaiAkhir;
        String nilaiHuruf = "";
        System.out.println("Program Menghitung Nilai Akhir\n==================");
        System.out.print("Masukkan Nilai Tugas : ");
        tugas = sc.nextInt();
        System.out.print("\nMasukkan Nilai UTS : ");
        uts = sc.nextInt();
        System.out.print("\nMasukkan Nilai UAS : ");
        uas = sc.nextInt();
        System.out.println("\n==================\n==================");
        nilaiAkhir = 0.2*tugas + 0.35*uts + 0.45*uas;
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        if(80<nilaiAkhir && nilaiAkhir<=100){
            nilaiHuruf = "A";
            System.out.println("Nilai Huruf : " + nilaiHuruf);
        }else if(73<nilaiAkhir && nilaiAkhir<=80){
            nilaiHuruf = "B+";
            System.out.println("Nilai Huruf : " + nilaiHuruf);
        }else if(65<nilaiAkhir && nilaiAkhir<=73){
            nilaiHuruf = "B";
            System.out.println("Nilai Huruf : " + nilaiHuruf);
        }else if(60<nilaiAkhir && nilaiAkhir<=65){
            nilaiHuruf = "C+";
            System.out.println("Nilai Huruf : " + nilaiHuruf);
        }else if(50<nilaiAkhir && nilaiAkhir<=60){
            nilaiHuruf = "C";
            System.out.println("Nilai Huruf : " + nilaiHuruf);
        }else if(39<nilaiAkhir && nilaiAkhir<=50){
            nilaiHuruf = "D";
            System.out.println("Nilai Huruf : " + nilaiHuruf);
        }else if(nilaiAkhir<=39){
            nilaiHuruf = "E";
            System.out.println("Nilai Huruf : " + nilaiHuruf);
        }
        System.out.println("==================");
        if(nilaiHuruf.equals("D") || nilaiHuruf.equals("E")){
            System.out.println("TIDAK LULUS");
        }else{
            System.out.println("LULUS");
        }
        sc.close();
    }
}