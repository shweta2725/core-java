package tester;

import java.util.Scanner;
import com.sunbeam.geometry.Point2D;

public class TestPoint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First point
        System.out.print("Enter x1 and y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        Point2D p1 = new Point2D(x1, y1);

        // Second point
        System.out.print("Enter x2 and y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        Point2D p2 = new Point2D(x2, y2);

        // Display details
        System.out.println("P1 Details: " + p1.getDetails());
        System.out.println("P2 Details: " + p2.getDetails());

        // Check equality
        if (p1.isEqual(p2)) {
            System.out.println("Points are SAME");
        } else {
            System.out.println("Points are DIFFERENT");

            // Distance
            double distance = p1.calculateDistance(p2);
            System.out.println("Distance between points = " + distance);
        }

        sc.close();
    }
}