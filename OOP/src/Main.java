import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Auto audi = new Auto();
        audi.setSpeed(input.nextInt());
        Auto skoda = new Auto(100,"red", "toyota","aha");

    }
}