import java.util.Comparator;
import java.util.Objects;

/**
 * Created by Adm on 10/31/2015.
 */
public class Car implements Comparable {
    int price; //2 "price"
    String type; //1
    int speed; //3
    int age;
    String color; //4
    int id; //5

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", type='" + type + '\'' +
                '}';
    }

    public Car(int price, String type) {
        this.price = price;
        this.type = type;
    }

   /* public int compareTo(Object o) { //we can use return this.price - ((Car)o).price; but if o1 == o2 we cant sort by one parametr
        if (this.price == ((Car) o).price) {
            if (this.speed == ((Car) o).speed){
                return this.age - ((Car) o).age;
            }
            return this.speed - ((Car) o).speed;
        } else {
            return this.price - ((Car) o).price;
        }
    } */
    public int compareTo (Object o){
        int temp = this.type.compareTo(((Car)o).type);
       if (temp == 0){
           return this.price - ((Car) o).price;
       }
        else return temp;
    }
     static class ComparatorByPrice implements Comparator {
        public int compare(Object o1, Object o2) {
            return ((Car) o1).price - ((Car) o2).price;
        }
    }
}














  /*  // public int compareTo(Object o){
    //    return this.price - ((Car)o).price;
    //}
    public int compareTo(Object o) {
        c
    }
}

class ComparatorByPrice implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Car) o1).price - ((Car) o2).price;
    }

  //  class ComparatorByColor implements Comparator {
  //      public int compare(Object o1, Object o2) {
 //           return ((Car) o1).price - ((Car) o2).price;
   //     }
   // }
} */