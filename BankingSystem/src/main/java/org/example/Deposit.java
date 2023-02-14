package org.example;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Scanner;

class Deposit {
    static String  userAns;
    static double money;
    static void deposit() throws IOException {

        Path path = Paths.get("balance.txt");
        Charset charset = StandardCharsets.UTF_8;
        String content = new String(Files.readAllBytes(path), charset);
        LocalDateTime time = LocalDateTime.now();
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Kolik si prejete odeslat peněz ?");
        money = sc.nextDouble();

        double bals;
        if (Main.bal > 0) {
            if (money <= Main.bal) {
                Balance.log = time + " : " + AccountCreation.username + Main.bal + " - " + money;
                Main.bal = Main.bal - money;
                bals = Main.bal;
                content = content.replaceAll(Balance.balReader().toString(), String.valueOf(Main.bal));
                Files.write(path, content.getBytes(charset));
                System.out.println(Main.bal);
                System.out.println("Komu si přejete peníze odeslat ?");
                userAns = scan.nextLine();
                AccountCreation.setUsername();
                System.out.println(AccountCreation.username);
                Main.bal = Balance.balReader();
                Main.bal = Main.bal + money;
                double balanse = Main.bal;
                System.out.println(balanse);
                content = content.replaceAll(Balance.balReader().toString(), String.valueOf(balanse));
                Files.write(path, content.getBytes(charset));
                Main.bal = bals;

            }else{
                System.out.println("Nemáš dostatek peněz");
            }
        }

        TransLog.logWriter();
    }
}
