package Ex6;

import java.util.Scanner;

public class main {
    static Scanner scanner = new Scanner(System.in);

    static int[] toArray(String s){
        int[] result = new int[52];
        int n = s.length();
        // dùng counting sort , đếm số lượng kí tự xuất hiện rồi lưu vào asciiPos
        for(int i=0; i<n; i++){
            int asciiPos = (int) s.charAt(i);
            if (65 <= asciiPos && asciiPos <= 90){
                result[asciiPos-65]++;
            }
            if (97 <= asciiPos && asciiPos <= 122){
                result[asciiPos-71]++;
            }
        }
        return result;
    }

    static boolean compareWordArray(int[] arr1, int[] arr2){
        for(int i=0; i<52; i++){
            if (arr1[i] != arr2[i] && arr2[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("nhập số lượng phần tử của mảng chuỗi");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] input = new String[n];
        int[][] inputArr = new int[n][52];
        System.out.print("The given strings are: ");
        for(int i=0; i<n; i++) {
            input[i] = scanner.nextLine();
            inputArr[i] = toArray(input[i]);
        }
        System.out.print("The given word is: ");
        String word = scanner.nextLine();
        int[] wordArr = toArray(word);
        System.out.println("The strings containing all the letters of the given word are: ");
        for(int i=0; i<n; i++){
            if (compareWordArray(inputArr[i], wordArr)){
                System.out.println(input[i]);
            }
        }
    }
}
