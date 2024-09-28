import java.util.ArrayList;

public class ArrayListLoop {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        // add to the cars array
        cars.add("Volvo");
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Honda");

        for( String car: cars){
            System.out.println(car);
        }
    }
}
