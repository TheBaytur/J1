public class Main {
    public static void main(String[] args) {

        Car bmw = new Car(250, 2500, "White", new byte[] {50, 0 ,50});

        Truck truck = new Truck(5600, new byte[]{100, 0, 100}, true);

        truck.setLoaded(true);
        truck.getLoaded();

    }
}