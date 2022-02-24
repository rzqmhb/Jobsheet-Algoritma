public class Fungsi {
    static int stok[][] = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    public static void main(String[] args) {
        tampilArray();
        tampilStok();
    }

    static void tampilArray(){
        System.out.println("Array stok :");
        for(int i=0; i<stok.length; i++){
            for(int j=0; j<stok[0].length; j++){
                System.out.print(stok[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    static void tampilStok(){
        int total1 = 0;
        int total2 = 0;
        int total3 = 0;
        int total4 = 0;
        for(int i=0; i<stok.length; i++){
            total1 += stok[i][0];
            total2 += stok[i][1];
            total3 += stok[i][2];
            total4 += stok[i][3];
        }
        System.out.println("Total stok Aglonema = " + total1);
        System.out.println("Total stok Keladi = " + total2);
        System.out.println("Total stok Alocasia = " + total3);
        System.out.println("Total stok Mawar = " + total4);
    }
}
