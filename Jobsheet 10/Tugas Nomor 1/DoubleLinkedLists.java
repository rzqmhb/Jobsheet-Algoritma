public class DoubleLinkedLists {
    Node head;
    int size;

    DoubleLinkedLists(){
        head=null;
        size=0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int nomor, String nama){
        if (isEmpty()) {
            head = new Node(null, nomor, nama, null);
        } else {
            Node newNode = new Node(null, nomor, nama, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int nomor, String nama){
        if (isEmpty()) {
            addFirst(nomor, nama);
        } else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, nomor, nama, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int nomor, String nama, int index) throws Exception{
        if (isEmpty()) {
            addFirst(nomor, nama);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai Indeks Berada di Luar batas");
        } else {
            Node current = head;
            int i=0;
            while(i < index){
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, nomor, nama, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, nomor, nama, current);
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size=0;
    }

    public void print(){
        if (!isEmpty()) {
            System.out.println("++++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("++++++++++++++++++++++++");
            System.out.println("|No.\t|Nama\t|");
            Node tmp = head;
            while(tmp != null){
                System.out.print("|" + tmp.nomor + "\t|" + tmp.nama + "\t|");
                tmp = tmp.next;
            }
            System.out.println("\nSisa Antrian : " + size());
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat menghapus node!");
        } else if (size == 1){
            head = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
}
