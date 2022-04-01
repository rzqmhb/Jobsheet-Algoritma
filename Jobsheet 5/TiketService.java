public class TiketService {
    Tiket tikets[] = new Tiket[6];
    int indeks = 0;

    void tambah(Tiket t){
        if (indeks < tikets.length) {
            tikets[indeks] = t;
            indeks++;
        } else {
            System.out.println("Data Sudah Penuh!!!");
        }
    }

    void tampilAll(){
        System.out.println("====================================================");
        System.out.println("Maskapai\t\tHarga\t\tAsal\t\tTujuan");
        for(int i=0; i<tikets.length; i++){
            System.out.println(tikets[i].maskapai + "\t\t\t" + tikets[i].harga + "\t\t" + tikets[i].asal + "\t\t" + tikets[i].tujuan);
        }
        System.out.println("====================================================");
    }

    void bubbleSort(){
        for (int i = 0; i < tikets.length-1; i++) {
            for (int j = 1; j < tikets.length-i; j++) {
                if(tikets[j-1].harga > tikets[j].harga){
                    Tiket temp = tikets[j-1];
                    tikets[j-1] = tikets[j];
                    tikets[j] = temp; 
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < tikets.length; i++) {
            int indeksMin = i;
            for (int j = i+1; j < tikets.length; j++) {
                if(tikets[indeksMin].harga > tikets[j].harga){
                    indeksMin = j;
                }
                Tiket temp = tikets[indeksMin];
                tikets[indeksMin] = tikets[i];
                tikets[i] = temp;
            }
        }
    }
}
