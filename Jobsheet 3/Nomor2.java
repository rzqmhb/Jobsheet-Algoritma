import java.util.Scanner;
public class Nomor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah tanah : ");
        int a = sc.nextInt();
        System.out.println();
        Tanah arrT[] = new Tanah[a];
        for(int i=0; i<a; i++){
            arrT[i] = new Tanah();
            System.out.println("Tanah " +(i+1));
            System.out.print("Panjang : ");
            arrT[i].panjang = sc.nextInt();
            System.out.print("Lebar : ");
            arrT[i].lebar = sc.nextInt();
        }

        System.out.println();
        int luas[] = new int[a];
        for(int i=0; i<a; i++){
            luas[i] = arrT[i].hitungLuas();
            System.out.println("Luas Tanah " + (i+1) + " : " + luas[i]);
        }

        System.out.println();
        String tanah = "";
        int terluas = 0;
        for(int i=0; i<a; i++){
            if(luas[i] > terluas){
                terluas = luas[i];
                tanah = "Tanah " + (i+1);
            }
        }
        System.out.println("Tanah terluas : " + tanah);
        sc.close();
    }
    
}

class Tanah{
    int panjang, lebar;
    
    int hitungLuas(){
        return panjang*lebar;
    }
}
