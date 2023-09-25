import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int age = 0;
        String trash = "";

        System.out.print("Enter your age: ");
        if(in.hasNextInt())
        {
            age = in.nextInt();
            if (age >= 21)
            {
                System.out.println("You may enter!");
            }
            else
            {
                System.out.println("You are to young to enter.");
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered " + trash);
            System.out.println("Rerun the program and do proper input");
        }
    }
}