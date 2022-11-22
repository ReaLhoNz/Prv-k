import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner uinput = new Scanner(System.in);


        System.out.println("Vítejte v primitivní kalkulačce(Desetiná čísla zadávejte ve tvaru např.: 1,2)");


        double a, f, s, g;




            while (true) {
                System.out.println("Vyber si operaci kterou chceš použít (+,-,/,*,%)");
                String str = uinput.nextLine();


                //Výpočetní logika

                if (str.equals("%")) {


                    System.out.println("Zadejte parametr A");
                   a = input.nextDouble();
                    System.out.println("Zadejte parametr B");
                    s = input.nextDouble();

                    f = a % s;
                    System.out.println(f);

                    System.out.println("Chcete přidat další parametr ?");
                    String u = uinput.nextLine();


                    if (u.equalsIgnoreCase("ano")) {
                        System.out.println("zadejte další parametr.");
                        g = input.nextDouble();

                        f = f % g;
                        System.out.println(f);

                    }
                    if (u.equalsIgnoreCase("ne")) {
                        continue;
                    }
                    System.out.println("Pokud chcete počítat od znova zmáčkněte Enter, pokudne napište EXIT");


                }else if (str.equalsIgnoreCase("*")) {


                    System.out.println("Zadejte parametr A");
                    a = input.nextDouble();
                    System.out.println("Zadejte parametr B");
                    s = input.nextDouble();

                    f = a * s;
                    System.out.println(f);

                    System.out.println("Chcete přidat další parametr ?");
                    String u = uinput.nextLine();


                    if (u.equalsIgnoreCase("ano")) {
                        System.out.println("zadejte další parametr.");
                        g = input.nextDouble();

                        f = f * g;
                        System.out.println(f);

                    }
                    if (u.equalsIgnoreCase("ne")) {
                        continue;
                    }
                    System.out.println("Pokud chcete počítat od znova zmáčkněte Enter, pokudne napište EXIT");

                } else if (str.equalsIgnoreCase("-")) {


                    System.out.println("Zadejte parametr A");
                    a = input.nextDouble();
                    System.out.println("Zadejte parametr B");
                    s = input.nextDouble();

                    f = a - s;
                    System.out.println(f);

                    System.out.println("Chcete přidat další parametr ?");
                    String u = uinput.nextLine();

                    if (u.equalsIgnoreCase("ano")) {
                        System.out.println("zadejte další parametr.");
                        g = input.nextDouble();

                        f = f - g;
                        System.out.println(f);


                    }
                    System.out.println("Pokud chcete počítat od znova zmáčkněte Enter, pokudne napište EXIT");
                } else if (str.equalsIgnoreCase("+")) {


                    System.out.println("Zadejte parametr A");
                    a = input.nextDouble();
                    System.out.println("Zadejte parametr B");
                    s = input.nextDouble();

                    f = a + s;
                    System.out.println(f);

                    System.out.println("Chcete přidat další parametr ?");
                    String u = uinput.nextLine();

                    if (u.equalsIgnoreCase("ano")) {
                        System.out.println("zadejte další parametr.");
                        g = input.nextDouble();

                        f = f + g;
                        System.out.println(f);

                    }
                    System.out.println("Pokud chcete počítat od znova zmáčkněte Enter, pokudne napište EXIT");
                } else if (str.equalsIgnoreCase("/")) {


                    System.out.println("Zadejte parametr A");
                    a = input.nextDouble();
                    System.out.println("Zadejte parametr B");
                    s = input.nextDouble();

                    f = a / s;
                    System.out.println(f);

                    System.out.println("Chcete přidat další parametr ?");
                    String u = uinput.nextLine();

                    if (u.equalsIgnoreCase("ano")) {
                        System.out.println("zadejte další parametr.");
                        g = input.nextDouble();

                        f = f / g;
                        System.out.println(f);

                    }
                    System.out.println("Pokud chcete počítat od znova zmáčkněte Enter, pokudne napište EXIT");
                }
                String k = uinput.nextLine();


                if (k.equalsIgnoreCase("exit")) {
                    System.out.println("Made by Daniel.R");
                    break;
                }
            }
        }
    }


