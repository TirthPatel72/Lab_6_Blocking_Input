import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash = "";
        double length = 0.0;
        double width = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double hypotenuse = 0.0;
        boolean done = false;

        // Input length
        do
        {
            System.out.print("Enter the length of the rectangle: ");
            if (in.hasNextDouble()) {
                length = in.nextDouble();
                in.nextLine();
                if (length <= 0) {
                    System.out.println("Length must be greater than 0.");
                } else {
                    done = true;
                }
            } else {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + " Please enter a valid number.");
            }
        } while (!done);

        // Input width
        done = false;
        do
        {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                if (width <= 0) {
                    System.out.println("Width must be greater than 0.");
                } else {
                    done = true;
                }
            } else {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + " Please enter a valid number.");
            }
        } while (!done);

        // Calculate area and perimeter
        area = length * width;
        perimeter = 2 * (length + width);
        hypotenuse = Math.sqrt(length * length + width * width);

        // Output results
        System.out.printf("Length: %.2f\n", length);
        System.out.printf("Width: %.2f\n", width);
        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Perimeter: %.2f\n", perimeter);
        System.out.printf("Hypotenuse: %.2f\n", hypotenuse);
    }
}
