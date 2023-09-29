public class Truck extends Transport{

    private boolean isLoaded;
    public Engine engine = new Engine();



    public Truck(int weight, byte[] coordinate) {
        super(weight, coordinate);
    }

    public Truck(int weight, byte[] coordinate,  boolean isLoaded) {
        super(weight, coordinate);
        this.isLoaded = isLoaded;
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

    public void setValues(float speed,int weight, String color, byte[] coordinate, boolean isLoaded){
        super.setValues(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
    }

    @Override
    public String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    public void setLoaded(boolean loaded){
        isLoaded = loaded;
    }

    public String getLoaded(){
        if(isLoaded)
            return "Truck loaded";
        else
            return "Truck not loaded";
    }

}
