import java.io.IOException;
import java.util.Scanner;

public class Main {
    static double bal;
    public static void main(String[] args) throws IOException {
        AccountCreation.fileSystem();
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Chcete se přihlásit nebo regisdtrovat ? (Přihlášení = 2, Registrace = 1)");
        int answer = scan.nextInt();
        if (answer == 1) {
            System.out.println("Zadejte/ vytvořte heslo, a zadejte username");
            AccountCreation myObj = new AccountCreation(sc.nextLine(), sc.nextLine());
            myObj.account(AccountCreation.username + AccountCreation.password);
            bal = 0;
            Balance.balSetter(String.valueOf(bal));

        } else if (answer == 2) {
            System.out.println("Zadejte heslo a username");
            AccountCreation myObj = new AccountCreation(sc.nextLine(), sc.nextLine());
            myObj.login();
            System.out.println(Balance.balReader());
        }
    }
}