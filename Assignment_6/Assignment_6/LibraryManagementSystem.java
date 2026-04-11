
import java.util.*;
import java.util.ArrayList;

class Book{
    String isbn;
    double price;
    String authorName;
    int quantity;

    public Book(String isbn, double price, String authorName, int quantity){
        this.isbn=isbn;
        this.price=price;
        this.authorName=authorName;
        this.quantity=quantity;
    }
    @Override
    public String toString() {
        return String.format("ISBN: %s \nPrice: %.2f \nAuthor: %s \nQty: %d\n",
                isbn, price, authorName, quantity);
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {

        ArrayList<Book> book=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int choice;

        do{
            System.out.println("\n--- Library Menu ---");
            System.out.println("0 Exit");
            System.out.println("1. Add Book");
            System.out.println("2. Display (Forward)");
            System.out.println("3. Display (Reverse)");
            System.out.println("4. Delete by an index");
            System.out.println("5. Sort by Price (Desc)");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.next();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Author: ");
                    sc.nextLine();
                    String author = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    book.add(new Book(isbn,price,author,qty));
                    break;

                case 2:
                    System.out.println("Books in Forward: ");
                    for(Book b: book){
                        System.out.println(b);
                    }
                    break;

                case 3:
                    System.out.println("Books in Reverse: ");
                    for (int i = book.size() - 1; i >= 0; i--) {
                        System.out.println(book.get(i));
                    }
                    break;

                case 4:
                    System.out.print("Enter index to delete: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < book.size()) {
                        book.remove(index);
                        System.out.println("Book deleted.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 5:
                    book.sort((b1,b2)->Double.compare(b2.price, b1.price));
                    System.out.println("Sorted by price descending ");
                    break;

                default:
                    System.out.println("Enter Valid choice ");
            }

        }while(choice!=0);



    }
}
