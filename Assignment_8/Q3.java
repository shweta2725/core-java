import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class Q3 {
    public static void main(String[] args) {
        
        List<String> car=new ArrayList<>();
        System.out.println();
        car.add("Mustang");
        car.add("Jaguar");
        car.add("Mercedes-Benez");
        car.add("Buggati");
        car.add("Porshe");

        System.out.println("Car List: "+car);

        System.out.println();
        car.set(3,"BMW");
        System.out.println("Updated Car List: "+car);
         System.out.println();
    }
    
}
