import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class main {

    public static void main(String[] args) {
        /*
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
    ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        */
    
        // Queue = FIFO (First In First Out) data structure (Ex. Line of ppl). A linear data strucutre that stores items in the order they were added.
        // Enqueue = Add an element to the end of the queue
        // Dequeue = Remove the first element from the queue
        // Peek = Get the first element without removing it

        Queue<String> queue = new LinkedList<String>(); // Create a queue of strings

        queue.add("Minecraft"); // Enqueue (add) an element to the end of the queue
        queue.add("Bordelands"); // Enqueue (add) another element to the end of the queue
        queue.add("FIFA"); // Enqueue (add) another element to the end of the queue

        String favGame = queue.remove(); // Dequeue (remove) the first element from the queue (Minecraft)
        System.out.println(favGame); // Print the removed element (Minecraft)

        System.out.println(queue.peek()); // Peek at the first element in the queue (Bordelands)
        System.out.println(queue.isEmpty()); // Check if the queue is empty (false)

    }
}
