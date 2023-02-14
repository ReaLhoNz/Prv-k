import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


class Balance {
    static FileWriter fw;

    static {
        try {
            fw = new FileWriter("balance.txt", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static BufferedWriter bf = new BufferedWriter(fw);
    static PrintWriter out = new PrintWriter(bf);
    static File file1 = new File("balance.txt");
     static String toCharArray;

    Balance() throws IOException {
    }

    static void balSetter(String balance) throws IOException {
         Files.writeString(
            Path.of(System.getProperty("java.io.tmpdir"), "balance.txt"),
            balance + System.lineSeparator());

        out.println(AccountCreation.username + ":" + Main.bal);

         }

         //Načte hodnotu balance  z Files a zapíše ji do doublu v mainu
         static double balReader(){
        StringBuffer stringBuffer = new StringBuffer();
        try {
            Scanner sc = new Scanner(file1);
            while(sc.hasNextLine()) {
                String s = sc.nextLine();
                if (s.contains(AccountCreation.password)) {
                    toCharArray = s;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
             String result = stringBuffer.toString();
        toCharArray = toCharArray.replaceAll("[^\\d.]", "");

             return Main.bal = Double.parseDouble(toCharArray);
         }
    }

