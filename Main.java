import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int a, b = 0, c = 1, d = 0;
        out.println("Girilen sayıya kadar Fibonacci satıları bulma.");
        out.print("Sayıyı giriniz : ");
        a = input.nextInt();
        out.print(b + " " + c);
        for (int i = 0; i <= a; i++) {
            d = b + c;
            out.print(" "+d);
            b = c;
            c = d;
        }

    }

}

