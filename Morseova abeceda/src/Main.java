import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner aha = new Scanner(System.in);
        int a = aha.nextInt();
        int b = aha.nextInt();
        int c = aha.nextInt();

        if (a>b && a >c){
            System.out.print(a + " ");
            if (b<c){
                System.out.print( "" + c + "" + b);
            }else {
                System.out.print( "" + c + "" + b);
            }
        }






        }

    }

