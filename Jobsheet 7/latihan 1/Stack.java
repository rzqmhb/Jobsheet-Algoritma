public class Stack {
    int size, top;
    Pakaian data[];

    Stack(int size){
        this.size = size;
        this.data = new Pakaian[size];
        this.top = -1;
    }

    boolean isEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull(){
        if (top == size-1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Pakaian pkn){
        if (!isFull()) {
            top++;
            data[top] = pkn;
        } else {
            System.out.println("Stack Sudah Penuh!!");
        }
    }

    void pop(){
        if (!isEmpty()) {
            Pakaian x = data[top];
            top--;
            System.out.println("Data Yang Keluar : ");
            x.print();
        } else {
            System.out.println("Stack Masih Kosong!!");
        }
    }

    void peek(){
        System.out.println("Data Teratas Dalam Stack : ");
        data[top].print();
    }

    void print(){
        System.out.println("Isi Stack :");
        for(int i=top; i>-1; i--){
            data[i].print();
        }
        System.out.println("");
    }

    void clear(){
        if (!isEmpty()) {
            for(int i=top; i>-1; i--){
                top--;
            }
            System.out.println("Stack Sudah Dikosongkan");
        } else {
            System.out.println("Stack Masih Kosong!!");
        }
    }
}
