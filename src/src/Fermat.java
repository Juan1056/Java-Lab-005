package src;

import java.util.Scanner;

public class Fermat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a value for a; ");
        int a = scanner.nextInt();

        System.out.println("enter a value for b; ");
        int b = scanner.nextInt();

        System.out.println("enter a value for c; ");
        int c = scanner.nextInt();

        System.out.println("enter a value for n; ");
        int n = scanner.nextInt();

        if (n > 2 && Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
            System.out.println("Holy Smokes, Fermat was wrong!");
        }else{
            System.out.println("No, that doesnt work");
        }
        }



    }
