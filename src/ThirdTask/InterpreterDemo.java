package ThirdTask;

public class InterpreterDemo {
    public static void main(String[] args){
        Expression isJava = new TerminalExpression("Java");
        Expression isPython = new TerminalExpression("Python");

        Expression isJavaOrPython = new OrExpression(isJava,isPython);
        Expression isJavaAndPython = new AndExpression(isJava,isPython);

        System.out.println("Does content contain Java or Python?");
        System.out.println(isJavaOrPython.interpret("I love Java")); // true

        System.out.println("Does content contain both Java and Python?");
        System.out.println(isJavaAndPython.interpret("I love Java and Python")); // false
    }
}