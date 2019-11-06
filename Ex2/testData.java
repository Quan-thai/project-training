package bt2;

import java.util.Scanner;

public class testData {
    public int year;
    Scanner scanner = new Scanner(System.in);

    public void Input(){
        System.out.print("Input the year: ");
        year = scanner.nextInt();
        System.out.println("\n");
    }
    public void checkAndOutput(){
        if((year % 4 ==0 && year % 100 != 0) || year % 400 ==0){
            System.out.println(year + " is a leap year");
        }
        else
            System.out.println(year + " isn't a leap year");
    }
}
