package src;

import java.util.Scanner;

public class Main {
    static String name;


    public String getName(){
        return name;
    }
    Scanner input = new Scanner(System.in);
    String jmeno = input.nextLine();


    public void setName(){

        this.name = jmeno; ;

    }
   public static void main(String[] args){
        Main obj = new Main();
        obj.setName();
       System.out.println(name);
   }

}