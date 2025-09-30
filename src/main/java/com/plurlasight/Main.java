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

        // billing

        System.out.println("Billing street");
        String billingStreet= scanner.nextLine();
        output.append("billing address:\n").append(billingStreet). append("\n");


        System.out.println("Billing city; ");
        String billingCity= scanner.nextLine();
        output.append(billingCity).append(", ");

        System.out.println("Billing state: ");
        String billingState = scanner.nextLine();
        output.append(billingState).append(" ");

        System.out.println("Billing zip: ");
        String billingZip = scanner.nextLine();
        output.append(billingZip).append("\n");

        // shipping

        System.out.println("Shipping street");
        String shippingStreet= scanner.nextLine();
        output.append("shipping address:\n").append(shippingStreet). append("\n");

        System.out.println("shipping city; ");
        String shippingCity= scanner.nextLine();
        output.append(shippingCity).append(", ");

        System.out.println("shipping state: ");
        String shippingState = scanner.nextLine();
        output.append(shippingState).append(" ");

        System.out.println("shipping zip: ");
        String shippingZip = scanner.nextLine();
        output.append(shippingZip).append("\n");


        // display of the customer info.

        System.out.println("\nDisplay the customer information\n");

        System.out.println(output.toString());

    }
}