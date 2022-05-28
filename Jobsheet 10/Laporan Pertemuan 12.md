# Laporan Pertemuan 12

>Nama : Roziq Mahbubi
>Kelas : 1G TI
>NIM : 2141720086

## 12.2.3
1. double linked list memiliki 2 pointer yang dapat digunakan untuk mengakses alamat node sebelum dan sesudah node sekarang, sedangkan single linked list hanya memiliki 1 pointer yang menuju ke alamat node setelah node sekarang.

2. atribut tersebut merupakan pointer yang digunakan untuk mengakses alamat node yang berada sebelum dan sesudah node tersebut.

3. Inisialisasi **head = null** berguna sebagai indikator apakah linked list masih kosong atau sudah terisi, dan inisialisasi **size = 0** dilakukan agar nilai size dapat diubah ketika isi linked list berubah dan juga agar dapat dikembalikan pada user untuk mengetahui ukuran dari linked list.

4. Karena node tersebut ditambahkan pada posisi pertama sehingga tidak mungkin ada node sebelum node tersebut.

5. Baris kode **head.prev = newNode** digunakan untuk menambahkan pointer prev pada head agar dapat mengakses node yang baru.

6. Karena node baru tersebut berada pada posisi paling akhir sehingga tidak ada node setelahnya.

## 12.3.3
1. Baris Kode :
```java
head = head.next;
head.prev = null;
```
bermaksud untuk memindahkan posisi head pada bagian setelah head dan menghapus alamat prev pada head yang sudah dipindah untuk menghapus node terdepan.

2. Untuk melacak node bagian akhir, removeLast menggunakan baris kode :
```java
Node current = head;
while(current.next != null){
    current = current.next;
}
```
yang mana akan memindah posisi current dengan batasan posisi setelah current bukan null, sehingga posisi current akan dipindahkan hingga posisi akhir linked lists.

3. Potongan kode : 
```java
Node tmp = head.next;

head.next = tmp.next;
tmp.next.prev = head;
```
tidak cocok untuk method remove karena posisi tmp ditentukan secara manual dan tidak mengikuti inputan indeks dari user

4. Potongan kode : 
```java
current.prev.next = current.next;
current.next.prev = current.prev;
```
digunakan untuk mengalihkan pointer agar node sebelum dan sesudah current memiliki alamat masing-masing sehingga current tidak bisa diakses dan dihapus.

## 12.4.3
1. Method size() hanya digunakan untuk mengembalikan nilai size agar user dapat mengetahui ukuran linked list.

2. Hal itu dapat dilakukan dengan merubah beberapa baris kode pada get(index) menjadi seperti ini :
```java
if(isEmpty() || index >= size)
//diubah menjadi
if(isEmpty() || index > size)

for(int i=0; i<index; i++)
//diubah menjadi
for(int i=1; i<index; i++)
```

3. Method add() pada single linked list hanya merubah pointer next saja, sedangkan method add() pada double linked list merubah pointer prev dan next.

4. Kode A melakukan pengembalian dua nilai yang berbeda dengan syarat yang diletakkan pada if else, sedangkan kode B hanya mengecek apakah head bernilai null.

## 12.5