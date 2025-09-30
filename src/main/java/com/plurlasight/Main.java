package com.plurlasight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      StringBuilder output = new StringBuilder();

      // user input

        System.out.println("provide following information: ");
        System.out.println("full name: ");
        String fullName = scanner.nextLine();
        output.append(fullName).append("\n\n");

        System.out.println("Billing street");
        String billingStreet= scanner.nextLine();
        output.append("billing address:\n").append(billingStreet). append("\n");





    }
}