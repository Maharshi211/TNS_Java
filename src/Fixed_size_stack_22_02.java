import java.util.Arrays;
import java.util.Scanner;

class DynamicStack {

	private int[] stackArray;
	private int top;
	private int capacity;

	public DynamicStack() {
		capacity = 1;
		stackArray = new int[capacity];
		top = -1;
	}

	public void push(int data) {
		if (top == capacity - 1) {
			expandCapacity();
		}
		stackArray[++top] = data;
		System.out.println(data + " pushed onto stack");
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		int data = stackArray[top--];
		return data;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return stackArray[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void expandCapacity() {
		int[] newStack = new int[capacity * 2];
		for (int i = 0; i < capacity; i++) {
			newStack[i] = stackArray[i];
		}
		stackArray = newStack;
		capacity *= 2;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.println("Stack elements:");
		for (int i = top; i >= 0; i--) {
			System.out.print(stackArray[i] + " ");
//			System.out.println(Arrays.toString(stackArray));
		}
		System.out.print("total size of array: " + stackArray.length);

	}

	

}

public class Fixed_size_stack_22_02 {
	public static void main(String[] args) {
		DynamicStack stack = new DynamicStack();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nStack Operations:\n");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Display");
			System.out.println("5. Exit");

			System.out.print("Enter choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter data to push: ");
				int data = scanner.nextInt();
				stack.push(data);
				break;
			case 2:
				int popped = stack.pop();
				if (popped != -1) {
					System.out.println(popped + " popped from stack");
				}
				break;
			case 3:
				int peeked = stack.peek();
				if (peeked != -1) {
					System.out.println("Top element: " + peeked);
				}
				break;
			case 4:
				stack.display();
				break;
			case 5:
				System.out.println("Exiting...");
				System.exit(0);
			default:

				System.out.println("Invalid choice");

			}
		}
	}
}
