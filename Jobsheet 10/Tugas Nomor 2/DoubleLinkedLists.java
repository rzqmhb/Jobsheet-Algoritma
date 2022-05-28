package pertemuan_12.tugas.no2;

public class DoubleLinkedLists {
    Node head;
    int size, idx;
    Film[] arrMovie;

    public DoubleLinkedLists() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Film movie) {
        if (isEmpty()) {
            head = new Node(null, movie, null);
        } else {
            Node newNode = new Node(null, movie, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Film movie) {
        if (isEmpty()) {
            addFirst(movie);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, movie, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Film movie, int index) throws Exception {
        if (isEmpty()) {
            addFirst(movie);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, movie, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, movie, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.movie.id + " - " + tmp.movie.nama + " - " + tmp.movie.rating);
                tmp = tmp.next;
            }
            System.out.println("\nJumlah Antrian Film : " + size);
        } else {
            System.out.println("Linked Lists kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        System.out.println("Film " + current.movie.nama + " berhasil dihapus");
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar baras");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            System.out.println("Film " + current.movie.nama + " berhasil dihapus");
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size++;
        }
    }

    public void indexOf(int key) {
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.movie.id != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            System.out.println("\ndata tidak ditemukan");
        } else {
            System.out.println("\nid-" + key + " ditemukan pada posisi node ke-" + index + 1);
            System.out.println("\nIDENTITAS :\n\nid film : " + tmp.movie.id + "\njudul film : " + tmp.movie.nama
                    + "\nIMDB rating : " + tmp.movie.rating);
        }
    }

    public void filmSort() {
        Node cur = head;
        idx = -1;
        arrMovie = new Film[size];
        while (cur != null) {
            idx++;
            arrMovie[idx] = cur.movie;
            cur = cur.next;
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 1; j < size - i; j++) {
                if (arrMovie[j].rating > arrMovie[j - 1].rating) {
                    Film tmp = arrMovie[j];
                    arrMovie[j] = arrMovie[j - 1];
                    arrMovie[j - 1] = tmp;
                }
            }
        }

        System.out.println("Pengurutan film berdasarkan rating :\n");
        for (int i = 0; i < size; i++) {
            System.out.println(arrMovie[i].id + " " + arrMovie[i].nama + " " + arrMovie[i].rating);
        }
    }
}
