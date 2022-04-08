package Latihan;

public class PencarianMHS {
    Mahasiswa listMHS[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m){
        if(idx<listMHS.length){
            listMHS[idx] = m;
            idx++;
        } else{
            System.out.println("Data Sudah Penuh!!!");
        }
    }

    void tampil(){
        for(Mahasiswa m : listMHS){
            m.tampil();
            System.out.println("-------------------------------");
        }
    }

    public int findSeqSearch(int cari){
        int posisi = -1;
        for (int i = 0; i < listMHS.length; i++) {
            if(listMHS[i].nim == cari){
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public int findBinarySearch(int cari, int left, int right){
        int mid;
        if(right>=left){
            mid = (right+left)/2;
            if (cari == listMHS[mid].nim) {
                return mid;
            } else if (cari < listMHS[mid].nim) {
                return findBinarySearch(cari, mid+1, right);
            } else {
                return findBinarySearch(cari, left, mid-1);
            }
        }
        return -1;
    }

    public void tampilPosisi(int x, int pos){
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada posisi " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos){
        if (pos != -1) {
            System.out.println("NIM : " + x);
            System.out.println("Nama : " + listMHS[pos].nama);
            System.out.println("Umur : " + listMHS[pos].umur);
            System.out.println("IPK : " + listMHS[pos].ipk);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
}
