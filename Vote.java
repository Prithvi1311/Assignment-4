import java.util.Scanner;

// Custom unchecked exception
class InvalidVoterAgeException extends RuntimeException {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}

// Voter class
class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) {
        if (age < 18) {
            throw new InvalidVoterAgeException("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Voter ID: " + voterId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class Vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Voter ID: ");
            int voterId = scanner.nextInt();
            scanner.nextLine(); // Consume leftover newline

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            Voter voter = new Voter(voterId, name, age);
            voter.display();

        } catch (InvalidVoterAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
