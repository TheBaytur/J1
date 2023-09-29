import java.sql.SQLOutput;
public abstract class Transport {

    protected float speed;
    private int weight;
    public String color;
    private byte[] coordinate;


    public Transport(float _speed, int _weight, String _color, byte[] _coordinate){
        System.out.println("Object created");
        setValues(_speed, _weight, _color, _coordinate);
//        System.out.println(getValues());
    }

    public abstract void moveObject(float speed);
    public abstract boolean stopObject();

    public Transport(int weight, byte[] coordinate){
        this.weight = weight;
        this.coordinate = coordinate;
 //       System.out.println(this.getValues());
    }
    public void setValues(float speed,int weight, String color, byte[] coordinate){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    public String getValues(){
        String info = "Object speed: " + this.speed + ". Weight: " + this.weight + ". Color: "
                + this.color;
        String infoCoorfinates = " Coordinates:\n";

        for (int i = 0; i < coordinate.length; i++) {
            infoCoorfinates += coordinate[i] + "\n";
        }

        return info + infoCoorfinates;
    }

    class Engine {
        private boolean isReady;
        private int km;

        public void setValues(boolean isReady, int km){
            this.isReady = isReady;
            this.km = km;
        }

        public void info() {
            if(isReady)
            System.out.println("Engine is ready");
            else
            System.out.println("Engine if off, Drived " + km + "km");
        }
    }

}
