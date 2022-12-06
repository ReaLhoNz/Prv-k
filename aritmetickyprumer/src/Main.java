import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        matika obj = new matika();
        String b = "error";
        System.out.println("Vítejte v programu programu pro výpočet aritmetického průměru zadaných čísel, a pro zjíštení kterými čísli je dělitelné zadané číslo.");
        String s = scan.nextLine();
        if (s.equalsIgnoreCase("delitelnost")){
            obj.delitelnost();
        } else if (s.equalsIgnoreCase("prumer")){
            obj.prumer();
        }else{
            System.out.println(b);
        }
    }
}