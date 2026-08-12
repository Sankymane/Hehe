import java.util.Scanner;

public class Dsa3 {

    static int front = -1;
    static int rear = -1;
    static final int SIZE = 10;
    static String[] queue = new String[SIZE];

    public void enqueue(String name) {

        if (rear == SIZE - 1) {
            System.out.println("Queue Overflow!");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        queue[rear] = name;

        System.out.println(name + " has been added to the queue.");
    }

    public String dequeue() {

        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow!");
            return null;
        }

        String name = queue[front];
        front++;

        return name;
    }

    public String peek() {

        if (front == -1 || front > rear) {
            System.out.println("Queue is currently empty.");
            return null;
        }

        return queue[front];
    }

    public void display() {

        if (front == -1 || front > rear) {
            System.out.println("No customers in the queue.");
            return;
        }

        System.out.print("Customers in queue: ");

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i]);

            if (i != rear) {
                System.out.print(" -> ");
            }
        }

        System.out.println();
    }

    public void displayFront() {

        if (front == -1 || front > rear) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Next customer: " + queue[front]);
        }
    }

    public void displayRear() {

        if (front == -1 || front > rear) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Last customer: " + queue[rear]);
        }
    }

    public static void main(String[] args) {

        RailwayQueue q = new RailwayQueue();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== RAILWAY TICKET QUEUE =====");
            System.out.println("1. Add Customer");
            System.out.println("2. Serve Customer");
            System.out.println("3. Display Queue");
            System.out.println("4. Show Front");
            System.out.println("5. Show Rear");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();
                    q.enqueue(name);
                    break;

                case 2:
                    String served = q.dequeue();

                    if (served != null) {
                        System.out.println("Customer served: " + served);
                    }
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    q.displayFront();
                    break;

                case 5:
                    q.displayRear();
                    break;

                case 6:
                    System.out.println("Program closed.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}