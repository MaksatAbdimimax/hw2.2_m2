import java.util.*;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> aA = new ArrayList<>();
        ArrayList<String> bB = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 5; i++){
            System.out.print("Введите имя  " + ": ");
            String input = scanner.nextLine();
            aA.add(input);


        }
        System.out.println(aA);
        for (int i = 0; i < 5; i++){
            System.out.print("Введите имя "  + ": ");
            String input = scanner.nextLine();
            bB.add(input);


        }
        System.out.println(bB);

        ArrayList<String> cC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
           cC.add(aA.get(i));
           cC.add(bB.get(4 - i));
        }

        System.out.println(cC);
        cC.sort(Comparator.comparingInt(String::length));
        System.out.println(cC);


    }
}