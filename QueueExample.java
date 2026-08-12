import java.util.Scanner;

public class QueueExample {

    static int queue[] = new int[5];
    static int front = -1;
    static int rear = -1;

    static void enqueue(int value) {

        if (rear == queue.length - 1) {
            System.out.println("Queue is full!");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        queue[rear] = value;

        System.out.println(value + " added to the queue.");
    }

    static void dequeue() {

        if (front == -1 || front > rear) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println(queue[front] + " removed from the queue.");

        front++;

        if (front > rear) {
            front = -1;
            rear = -1;
        }
    }

    static void peek() {

        if (front == -1) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Element at front: " + queue[front]);
        }
    }

    static void display() {

        if (front == -1) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("Elements in the queue:");

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== QUEUE OPERATIONS =====");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Show Front");
            System.out.println("4. Display Queue");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number: ");
                    int value = sc.nextInt();
                    enqueue(value);
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Please enter a valid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}