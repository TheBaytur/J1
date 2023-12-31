public class Car extends Transport{

    public Engine engine = new Engine();
    public Car(float _speed, int _weight, String _color, byte[] _coordinate){

        super(_speed, _weight, _color, _coordinate);

        //this.color = "Black";
        super.color = "Black";

    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Object moving with speed: " + speed);
    }

    @Override
    public boolean stopObject() {
        this.speed = 0;
        return true;
    }

}
