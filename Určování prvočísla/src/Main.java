import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean flag = true;
        int r;




        for (int i = 2; i < n; i++ ) {

            if (n % i == 0) {
                flag = false;
                break;

            }
        }

            if(flag){
                System.out.println(n + " je prvočíslo");
            }else{
                System.out.println("Toto není prvočíslo");
            }

        }
    }

