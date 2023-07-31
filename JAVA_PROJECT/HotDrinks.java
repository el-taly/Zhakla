package JAVA_PROJECT;

public class HotDrinks extends BottleOfWater {
    private int temperature;

    public HotDrinks(String name, double cost, int value, int temperature) {
        super(name, cost, value);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrinks {" +
                "name='" + super.getName() + '\'' + ", " +
                "cost='" + super.getCost() + '\'' + ", " +
                "volume='" + super.getVolume() + '\'' + ", " +
                "temperature=" + temperature +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HotDrinks)) {
            return false;
        }

        HotDrinks that = (HotDrinks) o;

        return super.getName().equalsIgnoreCase(that.getName())
                && super.getCost() == that.getCost()
                && getVolume() == that.getVolume();
    }
}
