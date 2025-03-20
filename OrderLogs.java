import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class OrderLogs {
    
    ArrayDeque<String> orderLogs = new ArrayDeque<>();
    
    public OrderLogs(){
        orderLogs = new ArrayDeque<>();
    }

    public void addOrderLog(String Log){
        orderLogs.add(Log);
    }

    private void mostRecentLogEntry(){
        System.out.println("Most recent order log: " + orderLogs.peek());
    }

    private String getOrderLog(){
        if (!orderLogs.isEmpty()){
            return orderLogs.pop();
        }
    }

    private void removeAllLogEntries(){
        orderLogs.clear();
    }

    private boolean OrderLogsEmpty(){
        return orderLogs.isEmpty();
    }

    public void handleLogs(){
        Scanner sc = new Scanner(System.in);
        System.out.println( "Choose what you wantto do with order logs:");
        System.out.println(" 1. Display all the logs");
        System.out.println(" 2. Display the most recent log");
        System.out.println(" 3. Remove a log entry");
        System.out.println(" 4. Remove all log entries");
        System.out.println(" 5. Check if the log is empty");
        System.out.println("Enter your choice (1-5)");
        int choice = sc.nextInt();
        sc.close();

        switch(choice){
            case 1:
                System.out.println("All order logs: ");
                for(String log : orderLogs){
                    System.out.println(log);
                }
                break;
            case 2:
                mostRecentLogEntry();
                break;
            case 3:
                System.out.println("Removed log entry: " + getOrderLog());
                break;
            case 4:
                removeAllLogEntries();
                System.out.println("All log entries removed");
                break;
            case 5:
                System.out.println("Is the log empty? " + OrderLogsEmpty());
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    

} 

class OrderQueue {
    private Queue<String> orderQueue;

    public OrderQueue() {
        orderQueue = new LinkedList<>();
    }

    public void addOrder(String order) {
        orderQueue.add(order);
        System.out.println("Order has been added to the queue: " + order);
    }

    public void processOrder() {
        if (!orderQueue.isEmpty()) {
            System.out.println("Processing order: " + orderQueue.poll());
        } else {
            System.out.println("There is no order in the queue.");
        }
    }

    public void displayQueue() {
        if (orderQueue.isEmpty()) {
            System.out.println("There is no order in the queue.");
        } else {
            System.out.println("Orders in the current queue:");
            for (String order : orderQueue) {
                System.out.println(order);
            }
        }
    }

    public void handleQueue() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose what you want to do with the order queue:");
            System.out.println("1. Add an order");
            System.out.println("2. Process an order");
            System.out.println("3. Display all orders");
            System.out.println("Enter your choice (1 - 3), enter other numbers to exit");

            int choice = scanner.nextInt();
            scanner.close();

            switch (choice) {
                case 1:
                    System.out.println("Please enter the order information:");
                    String newOrder = scanner.nextLine();
                    addOrder(newOrder);
                    break;
                case 2:
                    processOrder();
                    break;
                case 3:
                    displayQueue();
                    break;
                default:
                    return;
            }
        }
    }
}
    

