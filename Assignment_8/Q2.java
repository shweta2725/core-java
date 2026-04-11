import java.util.ArrayList;
import java.util.Collections;

public class Q2{
    public static void main(String[] args) {
        ArrayList<String> color=new ArrayList<>();

        color.add("Black");
        color.add("pink");
        color.add("Orange");
        color.add("White");
        color.add("Yellow");

        Collections.sort(color);

        System.out.println("Sorted List: ");
        for(String str: color){
            System.out.println(str);
        }
        
    }
}