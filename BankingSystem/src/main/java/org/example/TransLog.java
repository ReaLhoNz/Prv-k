package org.example;

import java.io.*;

class TransLog {

    static FileWriter fw;

    static {
        try {
            fw = new FileWriter("log.txt", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static File file2 = new File("log.txt");

    static void LogSystem() throws IOException {
        if (file2.createNewFile()){
            System.out.println("Složka vytvořena");
        }
    }
    //
    static void logWriter() throws IOException {
        try(FileWriter fw = new FileWriter("log.txt", true);
            BufferedWriter bf = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bf)) {
            out.println(Balance.log);
        }
    }
}
