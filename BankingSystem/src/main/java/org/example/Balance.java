package org.example;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


class Balance {
    static Scanner scan = new Scanner(System.in);
    static FileWriter fw;
    static String log;

    static {
        try {
            fw = new FileWriter("balance.txt", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static File file1 = new File("balance.txt");


//
    static void balWriter(String balance) throws IOException {
        Files.writeString(
                Path.of(System.getProperty("java.io.tmpdir"), "balance.txt"),
                balance + System.lineSeparator());
        try(FileWriter fw = new FileWriter("balance.txt", true);
            BufferedWriter bf = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bf)) {
            out.println(AccountCreation.username + ":" + Main.bal);
        }
    }

    //Načte hodnotu balance  z Files a zapíše ji do doublu v mainu
    static Double balReader() throws IOException {
        String toCharArray = "";
        Path path = Paths.get("balance.txt");
            Scanner sc = new Scanner(path);
            while(sc.hasNextLine()) {
                String s = sc.nextLine();
                if (s.contains(AccountCreation.username)) {
                    toCharArray = s;
                }
            }
        StringBuilder builder = new StringBuilder(toCharArray);
        int index = builder.indexOf(":");
        toCharArray = toCharArray.valueOf(builder.replace(0 , index + 1, ""));
        return Double.parseDouble(toCharArray);
    }
}
