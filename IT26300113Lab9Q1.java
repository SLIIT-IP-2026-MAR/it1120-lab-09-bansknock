import java.util.Scanner;

public class IT26101198Lab9Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value c: ");
        double c = sc.nextDouble();

        double d = b*b - 4*a*c; 

        if (d >= 0) {
            double r1 = (-b + Math.sqrt(d)) / (2*a);
            double r2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println("Root 1: " + r1);
            System.out.println("Root 2: " + r2);
        } else {
            System.out.println("Roots are imaginary");
        }

        sc.close();
    }
}

