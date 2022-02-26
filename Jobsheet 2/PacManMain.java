import java.util.Scanner;
public class PacManMain {
    public static void main(String[] args) {
        PacMan p1=new PacMan(10, 10, 20, 20);
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Kiri\n2. Kanan\n3. Atas\n4. Bawah\n5. Tampil Posisi\n0. Berhenti");
        int i=0;
        while(i<1){
            System.out.print("Input : ");
            int input = sc.nextInt();
            if (input == 1) {
            p1.moveLeft();
            i+=0;
            }else if (input == 2) {
            p1.moveRight();
            i+=0;
            }else if (input == 3) {
            p1.moveUp();
            i+=0;
            }else if (input == 4) {
            p1.moveDown();
            i+=0;
            }else if (input == 5) {
            p1.printPosition();
            i+=0;
            }else if (input == 0) {
            i++;
            }else{
            System.out.println("Input Invalid !");
            i+=0;
            }
        }
    }
}

class PacMan{
    int x, y, width, height;

    PacMan(int a, int b, int c, int d){
        x=a;
        y=b;
        width=c;
        height=d;
    }

    void moveLeft(){
        x--;
        if (x<0) {
            System.out.println("Anda telah keluar dai map permainan !");
            x++;
        }
    }

    void moveRight(){
        x++;
        if (x>width) {
            System.out.println("Anda telah keluar dai map permainan !");
            x--;
        }
    }

    void moveUp(){
        y++;
        if (y>height) {
            System.out.println("Anda telah keluar dai map permainan !");
            y--;
        }
    }

    void moveDown(){
        y--;
        if (y<0) {
            System.out.println("Anda telah keluar dai map permainan !");
            y++;
        }
    }

    void printPosition(){
        System.out.println(x + ", " + y);
    }
}