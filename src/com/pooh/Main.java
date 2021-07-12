package com.pooh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_OF_YEAR = 12;
        final byte PERCENTAGE = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        int principal = scanner.nextInt();
        if (principal != 0 && principal <= 500000) {

            System.out.println("Annual interest rate: ");
            float annualInterest = scanner.nextFloat();
            float monthlyInterest = (annualInterest / PERCENTAGE) / MONTHS_OF_YEAR;

            System.out.println("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 10 && years <= 30) {
                int noPayments = years * MONTHS_OF_YEAR;

                double mortgage = principal * (monthlyInterest * Math.pow((1 + monthlyInterest), noPayments))
                        / (Math.pow((1 + monthlyInterest), noPayments)) - 1;
                String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
                System.out.println("Mortgage: " + mortgageFormatted);
            } else
                System.out.println("Enter a valid period");
        } else
            System.out.println("Please enter a valid principal");

    }
}
