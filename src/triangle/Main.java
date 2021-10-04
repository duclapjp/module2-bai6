package triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào độ dài 3 cạnh của tam giác");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        System.out.println("nhập vào màu");
        String p = scanner.nextLine();
        String color = scanner.nextLine();

        Triangle triangle = new Triangle(color,side1,side2,side3);
        System.out.println(triangle.toString());
    }
}
