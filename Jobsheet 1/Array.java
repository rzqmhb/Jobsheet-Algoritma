public class Array {
    public static void main(String[] args) {
        int stok[][] = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        int harga[] = {75000, 50000, 60000, 10000};

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

        stok[0][0] -= 1;
        stok[0][1] -= 2;
        stok[0][3] -= 5;
        int pendapatan = 0;
        int a,b,c,d;
        a = stok[0][0] * harga[0];
        b = stok[0][1] * harga[1];
        c = stok[0][2] * harga[2];
        d = stok[0][3] * harga[3];
        pendapatan = pendapatan + a + b + c + d;
        System.out.println("Total Pendapatan = Rp" + pendapatan);
    }
}
