import java.util.Stack;

public class main {

    public static void main(String[] args) {
        
        // Stack = LIFO (Last In First Out)
        // Push = Add an element to the top of the stack
        // Pop = Remove the top element from the stack
        // Peek = Get the top element without removing it

        Stack<String> stack = new Stack<String>(); // Create a stack of strings

        stack.push("Minecraft");
        stack.push("Bordelands");
        stack.push("FIFA");

        String favGame = stack.pop(); // Remove the top element (FIFA)
        System.out.println(favGame); // Print the removed element (FIFA)
        stack.push("Happy Wheels"); // Add a new element (Happy Wheels)

        System.out.println(stack.empty()); // Check if the stack is empty
        System.out.println(stack.peek()); // Check the head of the stack (Happy Wheels)

        System.out.println(stack.search("Happy Wheels")); // Search for an element (Happy Wheels) and return its position from the top of the stack
    }
}
