public class Nilai {
    String nim, nama, mataKuliah, sks;
    Double nilai;

    Nilai(String nim, String nama, String mataKuliah, String sks, Double nilai){
        this.nim=nim;
        this.nama=nama;
        this.mataKuliah=mataKuliah;
        this.sks=sks;
        this.nilai=nilai;
    }

    public String toString(){
        return nim + "\t\t" + nama + "\t\t" + mataKuliah + "\t\t\t" + sks + "\t" + nilai;
    }

    public void print(){
        System.out.println(nim+"\t\t"+nama+"\t\t"+mataKuliah+"\t\t\t"+sks+"\t"+nilai);
    }
}
