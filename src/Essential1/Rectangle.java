package Essential1;

import java.util.Scanner;

public class Rectangle {

    private double side1;
    private double side2;



    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");

        int num1 = scanner.nextInt();

        System.out.println("Введите второе число:");

        int num2 = scanner.nextInt();

        rectangle.side1 = num1;
        rectangle.side2 =num2;


        System.out.println(perimeterCalculator(rectangle.side1,rectangle.side2)+"     периметр");
        System.out.println(areaCalculator(rectangle.side1,rectangle.side2)+"      площадь");


    }

    public static double perimeterCalculator(double side1, double side2) {
        double perimeter = (side1 * 2) + (side2 * 2);
        return perimeter;
    }


    public static double areaCalculator(double side1, double side2) {
        double area = (side1 * side2);
        return area;
    }
}

