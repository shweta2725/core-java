import java.util.*;


interface Stack {
    int STACK_SIZE = 5;

    void push(Employee emp);
    Employee pop();
}


class FixedStack implements Stack {
    private Employee[] stack;
    private int top;

    public FixedStack() {
        stack = new Employee[STACK_SIZE];
        top = -1;
    }

    @Override
    public void push(Employee emp) {
        if (top == STACK_SIZE - 1) {
            System.out.println("Stack Overflow...!");
            return;
        }
        stack[++top] = emp;
        System.out.println("Employee pushed.");
    }

    @Override
    public Employee pop() {
        if (top == -1) {
            System.out.println("Stack Underflow...!");
            return null;
        }
        return stack[top--];
    }
}


class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [Id=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}
    
 class GrowableStack implements Stack {
    private Employee[] stack;
    private int top;

    public GrowableStack() {
        stack = new Employee[STACK_SIZE];
        top = -1;
    }

    @Override
    public void push(Employee emp) {
        if (top == stack.length - 1) {
            // Grow array
            Employee[] newStack = new Employee[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
            System.out.println("Stack grown to size " + stack.length);
        }
        stack[++top] = emp;
        System.out.println("Employee pushed.");
    }

    @Override
    public Employee pop() {
        if (top == -1) {
            System.out.println("Stack Underflow...!");
            return null;
        }
        return stack[top--];
    }
}


public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = null;

        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Choose Fixed Stack");
            System.out.println("2. Choose Growable Stack");
            System.out.println("3. Push Employee");
            System.out.println("4. Pop Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (stack == null) {
                        stack = new FixedStack();
                        System.out.println("Fixed Stack selected.");
                    } else {
                        System.out.println("Stack already selected. Cannot change.");
                    }
                    break;

                case 2:
                    if (stack == null) {
                        stack = new GrowableStack();
                        System.out.println("Growable Stack selected.");
                    } else {
                        System.out.println("Stack already selected. Cannot change.");
                    }
                    break;

                case 3:
                    if (stack == null) {
                        System.out.println("No stack chosen !!!");
                    } else {
                        System.out.print("Enter id: ");
                        int id = sc.nextInt();

                        System.out.print("Enter name: ");
                        String name = sc.next();

                        System.out.print("Enter salary: ");
                        double salary = sc.nextDouble();

                        stack.push(new Employee(id, name, salary));
                    }
                    break;

                case 4:
                    if (stack == null) {
                        System.out.println("No stack chosen !!!");
                    } else {
                        Employee e = stack.pop();
                        if (e != null)
                            System.out.println("Popped: " + e);
                    }
                    break;

                case 5:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
        System.out.println("Application terminated.");
    }
}


