import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tankSize = 0.0;
        double mpg = 0.0;
        double pricePerGal = 0.0;
        double Miles100Cost = 0.0;
        double fullTankDistance = 0.0;

        String trash = "";

        // Get tank size
        while (true)
        {
            System.out.print("Enter the size of the gas tank in gallons: ");
            if (in.hasNextDouble())
            {
                tankSize = in.nextDouble();
                in.nextLine();
                if (tankSize > 0)
                {
                    break;
                }
                else
                {
                    System.out.println("Tank size must be greater than 0.");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + " Please enter a valid number.");
            }
        }

        // Get mpg
        while (true)
        {
            System.out.print("Enter the miles per gallon: ");
            if (in.hasNextDouble())
            {
                mpg = in.nextDouble();
                in.nextLine();
                if (mpg > 0)
                {
                    break;
                }
                else
                {
                    System.out.println("Miles per gallon must be greater than 0.");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + " Please enter a valid number.");
            }
        }

        // Get price per gallon
        while (true)
        {
            System.out.print("Enter the price per gallon: ");
            if (in.hasNextDouble())
            {
                pricePerGal = in.nextDouble();
                in.nextLine();
                if (pricePerGal > 0)
                {
                    break;
                }
                else
                {
                    System.out.println("Price per gallon must be greater than 0.");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + " Please enter a valid number.");
            }
        }

        Miles100Cost = (100 / mpg) * pricePerGal;
        fullTankDistance = tankSize * mpg;

        System.out.printf("The cost per 100 miles is $%.2f\n", Miles100Cost);
        System.out.printf("The distance the car can travel on a full tank is %.1f miles\n", fullTankDistance);
    }
}

