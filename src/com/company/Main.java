package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name = "Adilhan";
        int vozrast = 16;
        int pogoda = 30;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ведите имя");
        String name1 = scan.nextLine();
        System.out.println("Ведите возраст " + name1);
        int age = scan.nextInt();
        System.out.println("Ведите  погоду " + name1);
        int pgd = scan.nextInt();


        if ((age < 45 && age > 20) && (pgd > 30 || pgd < -20)) {

            System.out.println(name1 + "  не выходит гулять");
        } else if (((age < 20) && (pgd > 28 || pgd < 0))) {


            System.out.println(name1 + "  не выходит гулять");
        } else if (((age > 45) && (pgd > 25 || pgd < -10))) {


            System.out.println(name1 + "  не выходит гулять");
        } else {
            System.out.println(name1 + "  отправляется в гости к своему другу");


        }
    }

}

