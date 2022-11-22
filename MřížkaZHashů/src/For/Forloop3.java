package For;

import java.util.Scanner;

public class Forloop3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Zadejte šířku");
        int a = input.nextInt();
        System.out.println("Zadejte výšku");
        int b = input.nextInt();
        for (int u = 1; u <= b; u++) {
            for (int i = 1; i <= a; i++) {
                System.out.print("#");



            }
            System.out.println();
        }
    }
}
