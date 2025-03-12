class Battery {
    int capacity;

    public Battery(int capacity) {
        this.capacity = capacity;
    }

    public void showCapacity() {
        System.out.println("Battery capacity: " + capacity + "mAh");
    }
}

class Mobile {
    String model;
    Battery battery;

    public Mobile(String model, int batteryCapacity) {
        this.model = model;
        this.battery = new Battery(batteryCapacity);
    }

    public void showInfo() {
        System.out.println("Mobile model: " + model);
        battery.showCapacity();
    }
}

public class Composition{
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Samsung Galaxy", 5000);
        mobile.showInfo();
    }
}
