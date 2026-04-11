
 import java.util.*;
 class Student {
    private int rollNo;
    private String name;
    private double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student [RollNo=" + rollNo + ", Name=" + name + ", Marks=" + marks + "]";
    }
}



public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Sort by Roll No");
            System.out.println("5. Sort by Name");
            System.out.println("6. Sort by Marks");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    students.add(new Student(roll, name, marks));
                    System.out.println("Student added.");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        Iterator<Student> itr = students.iterator();
                        while (itr.hasNext()) {
                            System.out.println(itr.next());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to search: ");
                    int searchRoll = sc.nextInt();

                    boolean found = false;
                    for (Student s : students) {
                        if (s.getRollNo() == searchRoll) {
                            System.out.println("Student Found: " + s);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student not found.");
                    break;

                case 4:
                    Collections.sort(students, Comparator.comparingInt(Student::getRollNo));
                    System.out.println("Sorted by Roll No.");
                    break;

                case 5:
                    Collections.sort(students, Comparator.comparing(Student::getName));
                    System.out.println("Sorted by Name.");
                    break;

                case 6:
                    Collections.sort(students, Comparator.comparingDouble(Student::getMarks));
                    System.out.println("Sorted by Marks.");
                    break;

                case 7:
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