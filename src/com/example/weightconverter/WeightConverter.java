package com.example.weightconverter;
import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in lbs to convert to stone & kg:");

        double weight = scanner.nextDouble();

        double pounds = weight / 14;
        double pResult = Math.ceil(pounds * 10) / 10; // ceil rounds pounds up and 10/10 to 1 decimal place

        /* pResult needs to be made into a string to be able to separate the decimal and
        allow the st and lb string in-between the resulting numbers.
        The backslashes before the dot make it read as a dot rather than any character */

        String[] stonePoundsSeparate = String.valueOf(pResult).split("\\.");

        System.out.println(weight + "lbs" + " is " + stonePoundsSeparate[0] + "st " + stonePoundsSeparate[1] + "lbs");

        double kilos = weight * 0.453592;
        double kResult = Math.ceil(kilos * 10) / 10;
        System.out.println(weight + "lbs" + " is " + kResult + "kg");
        }
}
