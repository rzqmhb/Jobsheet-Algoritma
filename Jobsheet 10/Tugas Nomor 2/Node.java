package pertemuan_12.tugas.no2;

public class Node {
    Node prev, next;
    Film movie;

    Node(Node prev, Film movie, Node next) {
        this.prev = prev;
        this.movie = movie;
        this.next = next;
    }
}
