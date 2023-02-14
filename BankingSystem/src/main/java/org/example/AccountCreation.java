package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
class AccountCreation {
    static String password;
    static String username;
    static File file = new File("credentials.txt");
    static void fileSystem(){
        try {
            if (file.createNewFile()) {
                System.out.println("Složka vytvořena");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            if (Balance.file1.createNewFile()) {
                System.out.println("Složka vytvořena");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public AccountCreation(String password, String username) {
        AccountCreation.password = password;
        AccountCreation.username = username;
    }
    public void account(String credentials) throws IOException {
        Files.writeString(
                Path.of(System.getProperty("java.io.tmpdir"), "credentials.txt"),
                credentials + System.lineSeparator());
        try(FileWriter fw = new FileWriter("credentials.txt", true);
            BufferedWriter bf = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bf)) {
            out.println(password + ":" + username);
        }
    }
    public void login(){
        try {
            Scanner sc = new Scanner(file);
            int goodCreds = 0;
            while (sc.hasNextLine()){
                String creds = password + ":" + username;
                String check = sc.nextLine();
                if(creds.equalsIgnoreCase(check)){
                    goodCreds++;
                }
            }
            if (goodCreds>0){
                System.out.println("Uspěšně si se přihlásil");
            } else if (goodCreds == 0) {
                System.out.println("Přihlášení se nezdařilo");
                System.exit(1);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setUsername() {
        AccountCreation.username = Deposit.userAns;
    }
}
