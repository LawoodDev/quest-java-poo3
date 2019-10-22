public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.println(this.getName()+ " takes off in the sky.");
    }

    @Override
    public int ascend(int meters) {
        System.out.println(this.getName()+ " flies upward, altitude : "+ this.altitude);

        return 0;
    }

    @Override
    public int descend(int meters) {
        System.out.println(this.getName()+ " flies downward, altitude : "+ this.altitude);

        return 0;
    }

    @Override
    public void land() {
        System.out.println(this.getName()+ " lands on the ground.");
    }
}
