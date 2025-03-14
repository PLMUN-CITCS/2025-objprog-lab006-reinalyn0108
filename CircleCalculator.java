import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("Enter the radius of the circle: ");

double radius = input.nextDouble();
System.out.printf("Radius: %.2f%n", radius);

double area = Math.PI * Math.pow(radius, 2);
System.out.printf("Area: %.2f%n", area);

double circumference = 2 * Math.PI * radius;
System.out.printf("Circumference: %.2f%n", circumference);


input.close();

    }
}
