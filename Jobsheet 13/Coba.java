import java.util.*;
public class Coba {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("ana");
        names.add("ani");
        names.add("inu");
        names.add("ini");
        names.add("anu");
        names.push("Mei-mei");
        System.out.printf("Elemen 0 : %s Total Elemen : %s Elemen Terakhir : %s\n", names.getFirst(), names.size(), names.getLast());
        System.out.println("Names : " + names.toString());
    }
}
