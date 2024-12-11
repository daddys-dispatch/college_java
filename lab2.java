package daddy;
import java.util.Scanner;

public class Stack1 {
    private static final int MAX = 10;
    private int[] stack = new int[MAX];
    private int top = -1;

    public void push(int val) {
        if (top < MAX - 1) {
            stack[++top] = val;
            System.out.println("Pushed: " + val);
        } else {
            System.out.println("Overflow! Cannot push " + val);
        }
    }

    public int pop() {
        if (top >= 0) {
            System.out.println("Popped: " + stack[top]);
            return stack[top--];
        }
        System.out.println("Underflow! Stack is empty.");
        return -1;
    }

    public int peek() {
        if (top >= 0) {
            System.out.println("Peeked: " + stack[top]);
            return stack[top];
        }
        System.out.println("Stack is empty.");
        return -1;
    }

    public void display() {
        System.out.print("Stack: ");
        if (top >= 0) {
            for (int i = 0; i <= top; i++) System.out.print(stack[i] + " ");
            System.out.println();
        } else System.out.println("Empty");
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == MAX - 1;
    }

    public static void main(String[] args) {
        Stack1 s = new Stack1();
        Scanner sc = new Scanner(System.in);
        int ch;

        System.out.println("Stack Menu: 1.Push 2.Pop 3.Peek 0.Exit");

        do {
            s.display(); // Display the stack contents and status
            System.out.print("Choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.print("Value: ");
                    s.push(sc.nextInt());
                }
                case 2 -> s.pop();
                case 3 -> s.peek();
                case 0 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice.");
            }
        } while (ch != 0);
        sc.close();
    }
}
