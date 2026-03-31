import java.util.Scanner;

public class Program_Food {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int quantity;
        double totalBill = 0;

        do {
            System.out.println("\n------ FOOD MENU ------");
            System.out.println("1. Dosa      - ₹50");
            System.out.println("2. Samosa    - ₹20");
            System.out.println("3. Idli      - ₹30");
            System.out.println("4. Poha      - ₹25");
            System.out.println("5. Tea       - ₹10");
            System.out.println("6. Coffee    - ₹15");
            System.out.println("7. Vada Pav  - ₹20");
            System.out.println("8. Upma      - ₹35");
            System.out.println("9. Sandwich  - ₹40");
            System.out.println("10. Generate Bill");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice >= 1 && choice <= 9) {
                System.out.print("Enter quantity: ");
                quantity = sc.nextInt();

                switch (choice) {
                    case 1: totalBill += quantity * 50; break;
                    case 2: totalBill += quantity * 20; break;
                    case 3: totalBill += quantity * 30; break;
                    case 4: totalBill += quantity * 25; break;
                    case 5: totalBill += quantity * 10; break;
                    case 6: totalBill += quantity * 15; break;
                    case 7: totalBill += quantity * 20; break;
                    case 8: totalBill += quantity * 35; break;
                    case 9: totalBill += quantity * 40; break;
                    default: System.out.println("Invalid choice!");
                }
            } 
            else if (choice != 10) {
                System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 10);

        System.out.println("\n🧾 Total Bill = ₹" + totalBill);

        sc.close();
    }
}