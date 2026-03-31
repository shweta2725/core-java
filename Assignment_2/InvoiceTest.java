/*
 Create a class called Invoice that a hardware store might use to represent 
an invoice for an item sold at the store. An Invoice should include four 
pieces of information as instance variables—a part number (type String), a 
part description (type String), a quantity of the item being purchased (type 
int) and a price per item (double). Your class should have a constructor 
that initializes the four instance variables. Provide a set and a get method 
for each instance variable. calculates the invoice amount (i.e. multiplies the 
quantity by the price per item), then returns the amount as a double value. 
If the quantity is not positive, it should be set to 0. 
If the price per item is not positive, it should be set to 0.0. 
Write a test application named InvoiceTest that demonstrate class Invoice’s 
capabilities.

*/

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice i = new Invoice();
        i.acceptRecord();
        i.displayRecord();
        System.out.println("Invoice Amount: " + i.calculateInvoiceAmount());
    }
}

class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice() {
        this.partNumber = "";
        this.partDescription = "";
        this.quantity = 0;
        this.pricePerItem = 0.0;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity < 0) ? 0 : quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = (pricePerItem < 0) ? 0.0 : pricePerItem;
    }

    public double calculateInvoiceAmount() {
        return this.quantity * this.pricePerItem;
    }

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Part Number: ");
        setPartNumber(sc.nextLine());
        System.out.print("Enter Part Description: ");
        setPartDescription(sc.nextLine());
        System.out.print("Enter Quantity: ");
        setQuantity(sc.nextInt());
        System.out.print("Enter Price per Item: ");
        setPricePerItem(sc.nextDouble());
    }

    public void displayRecord() {
        System.out.println("Part Number: " + getPartNumber());
        System.out.println("Part Description: " + getPartDescription());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Price per Item: " + getPricePerItem());
    }
}