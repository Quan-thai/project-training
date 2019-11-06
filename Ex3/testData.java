package bt3;

import java.util.Scanner;
//a Java program to find the maximum and minimum value of an array.

public class testData {
    Scanner scanner = new Scanner(System.in);

    public void findMaxMin(){
        int n;
        System.out.print("nhập số lượng phần tử của mảng: ");
        n = scanner.nextInt();
        double[] arr = new double[n];

        //nhap mang
        for (int i = 0; i <arr.length ; i++){
            arr[i] = scanner.nextDouble();
        }

        //tim max min trong mang
        double max = arr[0];
        double min = arr[0];

        for (int i =0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }

            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("phần tử lớn nhất trong mảng: "+ max);
        System.out.println("phần tử bé nhất trong mảng: "+ min);
    }
}
