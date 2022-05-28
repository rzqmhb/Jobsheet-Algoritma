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

    public void addFirst(int item){
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item){
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) throws Exception{
        if (isEmpty()) {
            addFirst(item);
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
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, item, current);
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
            Node tmp = head;
            while(tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat menghapus node!");
        } else if (size == 1){
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat menghapus node!");
        } else if (head.next == null){
            head = null;
            size--;
        } else {
            Node current = head;
            while(current.next.next != null){
                current = current.next;
            }
            current.next = null;
            size--;
        }
    }

    public void remove(int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Index Melebihi Batas!");
        } else if (index == 1){
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while(i < index){
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                head = current.next;
                head.prev = null;
            } else {
                current.next.prev = current.prev;
                current.prev.next = current.next;
            }
            size--;
        }
    }

    public int getFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat mengambil data!");
        }
        return head.data;
    }

    public int getLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat mengambil data!");
        }
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception{
        if(isEmpty() || index >= size){
            throw new Exception("Indeks Melebihi Batas!");
        }
        Node tmp = head;
        int i=0;
        while(i < index){
            tmp = tmp.next;
            i++;
        }
        return tmp.data;
    }
}
