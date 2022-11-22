import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String b;
        System.out.println("Napište nějakou větu.");
        b = input.nextLine();

        for (int i = 1; i <= 10; ++i){
            System.out.println(b);
        }

    }
}