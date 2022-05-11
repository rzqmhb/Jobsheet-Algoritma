
# Laporan Pertemuan 9

>Nama : Roziq Mahbubi
>Kelas : 1G TI
>NIM : 2141720086

### 7.2.3

1. 
> jumlah data yang dapat ditampung dalam stack adalah 5.
`Stack stk = new Stack(5);`
2. 
> variabel p tersebut menyimpan data object Pakaian yang telah diisikan oleh user.
3. 
> **do-while** pada fungsi **StackMain** berfungsi agar user mengisi stack minimal satu data, dan agar perulangan pengisian stack ditentukan oleh keinginan user.
4. 
`System.out.println("Daftar Fitur :");
        System.out.println("1. Push\n2. Pop\n3. Peek\n4. Print\n5. Keluar");
        int i=0;
        while (i<1) {
            System.out.print("Pilih Fitur :");
            int nomor = input.nextInt();
            if (nomor==1) {
                System.out.print("Jenis : ");
                String jenis = sc.nextLine();
                System.out.print("Warna : ");
                String warna = sc.nextLine();
                System.out.print("Merk : ");
                String merk = sc.nextLine();
                System.out.print("Ukuran : ");
                String ukuran = sc.nextLine();
                System.out.print("Harga : ");
                double harga = input.nextDouble();
                sc.nextLine();
                Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
                stk.push(p);
            } else if (nomor==2) {
                stk.pop();
            } else if (nomor==3) {
                stk.peek();
            } else if (nomor==4) {
                stk.print();
            } else {
                i++;
            }
        }`

### 7.3.3