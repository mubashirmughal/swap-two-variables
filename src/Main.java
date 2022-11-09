import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a;
        System.out.println("Enter a: ");
        a =sc.nextInt();
        double b;
        System.out.println("Enter b :");
        b =sc.nextInt();
        System.out.println("Before swapping a = " +a);
        System.out.println("Before swapping a = " +b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping a = "+a);
        System.out.println("After swapping a = "+b);
}

}