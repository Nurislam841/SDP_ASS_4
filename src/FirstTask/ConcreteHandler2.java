package FirstTask;

public class ConcreteHandler2 implements Handler{
    private Handler next;

    public void setNext(Handler handler) {
        next = handler;
    }
    public void handleRequest(String request){
        if(request.equals("Task2")){
            System.out.println("Handled by Handler2");
        }else if(next != null){
            System.out.println("Handler2 passing the request to the next handler");
            next.handleRequest(request);
        }
        else{
            System.out.println("Request can`t be handled");
        }
    }
}