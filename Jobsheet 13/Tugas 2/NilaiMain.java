import java.util.*;

public class NilaiMain {
    
    public static void main(String[] bool) {
        Mahasiswa[] mhs = new Mahasiswa[6];
        MataKuliah[] mk = new MataKuliah[5];
        ListNilai ln = new ListNilai();
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        mhs[0] = new Mahasiswa("2001", "Kobo", "628**");
        mhs[1] = new Mahasiswa("2002", "Tommy", "628**");
        mhs[2] = new Mahasiswa("2003", "Slebew", "628**");
        mhs[3] = new Mahasiswa("2004", "Windah", "628**");
        mhs[4] = new Mahasiswa("2005", "Wibu Tzy", "628**");
        mhs[5] = new Mahasiswa("2006", "Ikmal Slebew", "628**");

        mk[0] = new MataKuliah("0001", "Filosofi Internet", "3");
        mk[1] = new MataKuliah("0002", "Sistem Operasi", "3");
        mk[2] = new MataKuliah("0003", "Basis Data", "2");
        mk[3] = new MataKuliah("0004", "Teknologi Informasi", "3");
        mk[4] = new MataKuliah("0005", "Praktikum Basis Data", "3");

        int i=0;
        while(i<1){
            System.out.println("======================================");
            System.out.println("SISTEM PEMGOLAHAN DATA NILAI MAHASISWA");
            System.out.println("======================================");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("0. Keluar");
            System.out.println("======================================");
            System.out.print("Pilih : ");
            int pilih = sc.nextInt();
            sc.nextLine();

            if (pilih==1) {
                System.out.println("Masukkan Data :");
                System.out.print("Nilai : ");
                double nilai = input.nextDouble();
                input.nextLine();

                System.out.println("DAFTAR MAHASISWA");
                System.out.println("***********************************");
                System.out.println("NIM\t\tNama\t\tTelp");
                for (int j=0; j<mhs.length; j++) {
                    mhs[j].print();
                }
                System.out.print("Pilih Mahasiswa By NIM : ");
                String nim = input.nextLine();
                Mahasiswa x = null;
                for(int j=0; j<mhs.length; j++){
                    if(nim.equals(mhs[j].nim)){
                        x = mhs[j];
                    }
                }

                System.out.println("DAFTAR MATA KULIAH");
                System.out.println("***********************************");
                System.out.println("Kode\t\tMata Kuliah\t\t\t\tSKS");
                for (int j=0; j<mk.length; j++) {
                    mk[j].print();
                }
                System.out.print("Pilih Mata Kuliah By Kode : ");
                String kode = input.nextLine();
                MataKuliah y = null;
                for(int j=0; j<mk.length; j++){
                    if(kode.equals(mk[j].kode)){
                        y = mk[j];
                    }
                }

                
                Nilai nilaiobj = new Nilai(x.nim, x.nama, y.mataKuliah, y.sks, nilai);
                ln.add(nilaiobj);

            } else if (pilih==2) {
                System.out.println("DAFTAR MATA KULIAH");
                System.out.println("***********************************");
                System.out.println("NIM\t\tNama\t\tMata Kuliah\t\t\t\tSKS\tNilai");
                ln.tampil();

            } else if (pilih==3) {
                System.out.println("DAFTAR MATA KULIAH");
                System.out.println("***********************************");
                System.out.println("NIM\t\tNama\t\tMata Kuliah\t\t\t\tSKS\tNilai");
                ln.tampil();

                System.out.print("Masukkan Data Mahasiswa[NIM] : ");
                String nim = input.nextLine();
                ln.get(nim);

            } else if (pilih==4) {
                System.out.println("DAFTAR MATA KULIAH");
                System.out.println("***********************************");
                System.out.println("NIM\t\tNama\t\tMata Kuliah\t\t\t\tSKS\tNilai");
                ln.sort();

            } else {
                i++;
            }
        }
    }
}
