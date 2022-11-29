import java.util.Scanner;

public class Main {
    static double a;
     static double b;
     static double c;
     static  double d;
     static double x1;
     static double x2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Methods pepa = new Methods();


        System.out.println("Zadejte parametr A");
        a = input.nextDouble();
        System.out.println("Zadejte parametr B");
        b = input.nextDouble();
        System.out.println("zadejte parametr C");
        c = input.nextDouble();
        pepa.input();
        pepa.vypocet0();
        System.out.println(x1);
        if (x2 != 0){
            System.out.println(x2);
        }

    }
}