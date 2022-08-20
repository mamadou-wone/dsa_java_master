package stack;

public class Main {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Amir", "Boss", 1));
        stack.push(new Employee("Gray", "Man", 2));
        stack.push(new Employee("John", "Doe", 3));
        stack.push(new Employee("Jeanne", "DOE", 4));

    //    stack.printStack();

        System.out.println(stack.peek());
        System.out.println("Popped : " + stack.pop());
        System.out.println(stack.peek());
    }

}
