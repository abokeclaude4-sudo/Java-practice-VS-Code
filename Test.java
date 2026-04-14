import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter your name: ");
            String name = input.nextLine();

            System.out.print("Enter your age: ");
            int age = input.nextInt();

            System.out.print("Enter your score: ");
            int score = input.nextInt();
            input.nextLine();

            System.out.println();
            System.out.println("Hello " + name + "!");
            System.out.println("You are " + age + " years old.");

            if (age >= 18) {
                System.out.println("You are an adult.");
            } else {
                System.out.println("You are a minor.");
            }

            if (score < 0 || score > 100) {
                System.out.println("Invalid score! Please enter a score between 0 and 100.");
            } else if (score >= 90) {
                System.out.println("Grade: A (Excellent)");
            } else if (score >= 80) {
                System.out.println("Grade: B (Good)");
            } else if (score >= 70) {
                System.out.println("Grade: C (Average)");
            } else {
                System.out.println("Grade: F (Fail)");
            }

            System.out.print("\nDo you want to enter another student? (yes/no): ");
            choice = input.nextLine();

            System.out.println();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Program ended. Thank you!");

        input.close();
    }
}