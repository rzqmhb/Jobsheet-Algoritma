public class Queue {
    int[] data;
    int front, rear, size, max;

    Queue(int n){
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    boolean isFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    void enqueue(int dt){
        if (isFull()) {
            System.out.println("Queue Sudah Penuh!!");
        } else {
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (rear == max-1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    int dequeue(){
        int dt=0;
        if (isEmpty()) {
            System.out.println("Queue Masih Kosong!!");
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear =-1;
            } else {
                if (front == max-1) {
                    front=0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    void peek(){
        if (!isEmpty()) {
            System.out.println("Elemen Terdepan : " + data[front]);
        } else {
            System.out.println("Queue Masih Kosong!!");
        }
    }

    void print(){
        if (isEmpty()) {
            System.out.println("Queue Masih Kosong!!");
        } else {
            int i = front;
            while(i != rear){
                System.out.print(data[i] + " ");
                i = (i+1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah Elemen : " + size);
        }
    }

    void clear(){
        if (! isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue Berhasil Dikosongkan");
        } else {
            System.out.println("Queue Masih Kosong!!");
        }
    }
}
