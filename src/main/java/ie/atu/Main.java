package ie.atu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = 0;
        while (true) {
            System.out.println("Please enter your age:");
            String text = scan.nextLine().trim();
            try {
                age = Integer.parseInt(text);
                System.out.println("Thanks, your entered age is " + age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input " + e.getMessage());
            }
        }
    }
}