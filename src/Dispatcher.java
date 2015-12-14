import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Adm on 10/31/2015.
 */
public class Dispatcher {
    public static void main(String[] args) {

        Car c1 = new Car(9000, "Mers");
        Car c2 = new Car(7000, "BMW");
        Car c3 = new Car(8000, "Opel");
        Car[] cars = {c1, c2, c3};
        if (args.length == 0) {
            Arrays.sort(cars);
        } else if (args[0].equals("1")) {
          //  Car.ComparatorByPrice cp = new Car().new ComparatorByPrice(); when inner class non-static
            Car.ComparatorByPrice cp = new Car.ComparatorByPrice();
            Arrays.sort(cars, cp);
        } else {
            Arrays.sort(cars);
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}

//Arrays.sort(cars);
// ComparatorByPrice cm = new ComparatorByPrice();
// Arrays.sort(cars, cm);



        /*
        for (int i = 0; i <cars.length ; i++) {
            System.out.println(cars[i]);
        }
        ComparatorByPrice cm = new ComparatorByPrice();
        //ComparatorByColor cp = new ComparatorByPrice();
        Arrays.sort(cars, cm);
        for (int i = 0; i <cars.length ; i++) {
            System.out.println(cars[i]);
        }
    }

}*/
