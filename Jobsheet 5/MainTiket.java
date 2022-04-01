public class MainTiket {
    public static void main(String[] args) {
        Tiket tiket[] = new Tiket[6];
        tiket[0] = new Tiket("Bool", 150000, "Malang", "Jogja");
        tiket[1] = new Tiket("Genshit", 400000, "Malang", "Lombok");
        tiket[2] = new Tiket("Botol", 200000, "Jogja", "Malang");
        tiket[3] = new Tiket("Abhel Bool", 750000, "Surabaya", "Singapura");
        tiket[4] = new Tiket("DBS", 330000, "Malang", "Jakarta");
        tiket[5] = new Tiket("VVIP", 1550000, "Surabaya", "Singapura");

        TiketService ts = new TiketService();

        for(int i=0; i<tiket.length; i++){
            ts.tambah(tiket[i]);
        }

        System.out.println("=====Tampilan Awal=====");
        ts.tampilAll();
        System.out.println("\n");

        System.out.println("=====Tampilan Bubble Sort=====");
        ts.bubbleSort();
        ts.tampilAll();
        System.out.println("\n");

        System.out.println("=====Tampilan Selection Sort=====");
        ts.selectionSort();
        ts.tampilAll();
        System.out.println("\n");
    }
}
