public class Main {
    public static void main(String[] args) {

        Car bmw = new Car(250, 2500, "White", new byte[] {50, 0 ,50});
        bmw.engine.setValues(false, 2000);
        bmw.engine.info();

        Truck truck = new Truck(5600, new byte[]{100, 0, 100}, true);
        truck.engine.setValues(true, 50000);
        truck.engine.info();
//        truck.setValues(250, 2500, "Red", new byte[] {50, 0 ,50}, true);
//       System.out.println(truck.getValues());



    }
}