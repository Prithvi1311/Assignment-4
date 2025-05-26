import java.util.Scanner;
import java.util.Stack;

public class IntegerStack {
    private Stack<Integer> stack = new Stack<>();

    // Push element onto stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println(element + " pushed to stack.");
    }

    // Pop element from stack
    public void popElement() {
        if (!stack.isEmpty()) {
            int removed = stack.pop();
            System.out.println(removed + " popped from stack.");
        } else {
            System.out.println("Stack is empty. Cannot pop.");
        }
    }

    // Check if the stack is empty
    public void isStackEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty.");
        }
    }

    // Main method to interact with the stack
    public static void main(String[] args) {
        IntegerStack myStack = new IntegerStack();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Check if empty");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter integer to push: ");
                    int value = scanner.nextInt();
                    myStack.pushElement(value);
                    break;
                case 2:
                    myStack.popElement();
                    break;
                case 3:
                    myStack.isStackEmpty();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
