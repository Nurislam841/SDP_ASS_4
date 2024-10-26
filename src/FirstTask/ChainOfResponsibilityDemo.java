package FirstTask;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args){
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setNext(handler2);
        handler2.setNext(handler3);

        System.out.println("Sending Task1");
        handler1.handleRequest("Task1");

        System.out.println("\n Sending Task2");
        handler1.handleRequest("Task2");

        System.out.println("\n Sending Task3");
        handler1.handleRequest("Task3");

        System.out.println("\n Sending Task4 (Unrecognized Task): ");
        handler1.handleRequest("Task4");
    }
}