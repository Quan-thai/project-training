package bt1;

import java.util.Scanner;
// Write a Java program to convert temperature from Fahrenheit to Celsius degree
public class testData {
    public double temp;
    Scanner scanner = new Scanner(System.in);

    public void convert(){
        System.out.print("Input a degree in Fahrenheit: ");
        temp = scanner.nextDouble();
        double tempc = (temp -32)/1.8;
        System.out.println("\n");
        System.out.println(temp + " degree Fahrenheit is equal to " + tempc +" in Celsius");
    }
}
