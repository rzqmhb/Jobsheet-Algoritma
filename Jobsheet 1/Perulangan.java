import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        int nim = sc.nextInt();
        int n = nim%100;
        if(n < 10) n += 10;
        for(int i=1; i<=n; i++){
            int a = i%7;
            if(a==1){
                System.out.print("Senin ");
            }else if(a==2){
                System.out.print("Selasa ");
            }else if(a==3){
                System.out.print("Rabu ");
            }else if(a==4){
                System.out.print("Kamis ");
            }else if(a==5){
                System.out.print("Jumat ");
            }else if(a==6){
                System.out.print("Sabtu ");
            }else if(a==0){
                System.out.print("Minggu \n");
            }
        }
        sc.close();
    }
}
