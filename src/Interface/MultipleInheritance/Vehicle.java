package Interface.MultipleInheritance;

public class Vehicle implements Car, Bike{
    int distanceTravelled = 0;
    public void Distance(){
        distanceTravelled = speed * distance;
        System.out.println("distance travelled = "+ distanceTravelled);
    }
}

