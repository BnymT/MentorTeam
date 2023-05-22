package mth02;

import java.util.Scanner;

public class Homework04 {

    public static void main(String[] args) {

         /*  TASK :
         *  Kullanicidan IT alanini bilgisini alarak console'a
         *  meslegi = qa ==> Quality Analyst
                     dev ==> Developer
                      ba ==> Busines Analyst
                      pm ==> Project Manager
        bilgilileri yazdiriniz
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen IT alanindaki mesleginizi seciniz");

        String job = input.nextLine();

        if (job.equalsIgnoreCase("qa")) {

            System.out.println("Quality Analyst");

        } else if (job.equalsIgnoreCase("dev")) {

            System.out.println("Developer");

        } else if (job.equalsIgnoreCase("ba")) {

            System.out.println("Business Analyst");

        } else if (job.equalsIgnoreCase("pm")) {

            System.out.println("Project Manager");

        } else {

            System.out.println("Lutfen gecerli bir IT meslegi giriniz");

        }


    }

}
