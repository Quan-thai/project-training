import java.util.Scanner;

// viết chương trình java có sử dụng đệ quy
public class main {
    final static Scanner scanner = new Scanner(System.in);

    static String reverseString(String input){
        if (input.length() == 0) return "";
        return input.charAt(input.length()-1) + reverseString(input.substring(0, input.length()-1));
    }

    public static void main(String[] args){
            System.out.println("The given string is:");
            String word = scanner.nextLine();
            System.out.println("The string in reverse order is:\n" + reverseString(word));
        }
    }
