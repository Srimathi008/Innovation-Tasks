class Vehicle {  
    public void start() {  
        System.out.println("Two vehicles");  
    }  
}  

class Car extends Vehicle {  
    public void start() {  
        super.start();  
        System.out.println("BMW");  
    }  
}  

class Bike extends Vehicle {  
    public void start() {  
        super.start();  
        System.out.println("Pulsar");  
    }  
}  

public class Test {  
    public static void main(String[] args) {  
        Bike b = new Bike();  
        Car c = new Car();  
        
        b.start();  
        c.start();  
    }  
}
