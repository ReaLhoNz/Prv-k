import java.util.Scanner;

class Mathematic {
    double a;
    double b;
    Scanner input = new Scanner(System.in);
    public void input(){
        System.out.println("Napiš ujetou vzdalenost v metrech");
        a = input.nextDouble();
        System.out.println("Zadejte hodnotu hodin");
        b = input.nextDouble() * 60 * 60;
        System.out.println("Zadejte hodnotu minut");
        b += input.nextDouble() * 60;
        System.out.println("Zadejte hodnotu v sekundách");
        b+= input.nextDouble();

    }
    public double rychlost(){
        return (Main.vysledek = a/b) + (Main.milesvysledek = a / 1609);
    }

}
