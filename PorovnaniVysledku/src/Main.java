import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        double a, b ,c;
        System.out.println("Zvolte si parametr A");
        a = r.nextDouble();
        System.out.println("Zvolte parametr B");
        b = r.nextDouble();
        System.out.println("Zvolte parametr C");
        c = r.nextDouble();

        if(c > a && c > b){
            System.out.println(c + " je největší číslo");
        }

        else if(b > c && b > a){
            System.out.println(b + " je největší");
        }

        else if(a > c && a > b) {
            System.out.println(a + " je největší");
        }
    }
}