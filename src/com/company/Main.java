package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Square> array = new ArrayList<Square>();

        int continueFl = 1;

        for (int j = 0; continueFl != 0; j++) {
            Scanner kbInput = new Scanner(System.in);
            System.out.println("Please enter in a name.");

            String fullName = kbInput.nextLine();
            array.add(new Square(fullName));

            System.out.println("Nice to meet you, " + array.get(j).getName() + "! Your lucky number is " + array.get(j).getNum() + ".");
            int decision = 0;

            for (int m = 1; m != 0;) {
                System.out.println("Press 0 to continue entering names or 1 to stop.");
                try {
                    decision = kbInput.nextInt();
                    m = 0;
                } catch(Exception e) {
                    System.out.println("That is not a 0 or a 1!  You entered " + kbInput.nextLine());
                    m = 1;
                }

                if (decision != 1 && decision != 0) {

                    System.out.println("That is not a 0 or a 1!  You entered " + decision );
                    m = 1;

                }

            }

            if (decision == 1) {
                continueFl = 0;
            } else {
                continueFl = 1;
            }

        }

        for (int n = 0; n < array.size(); n++) {
            System.out.println(array.get(n).getName() + "'s lucky number is " + array.get(n).getNum());
        }

    }

}