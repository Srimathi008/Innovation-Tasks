class Computer {
    private String brand = "Dell";
    private String model = "XPS 15";

    class Processor {
        private String processorType = "Intel ";
        public void show() {
            System.out.println("Processor Type: " + processorType);
            System.out.println("Computer Brand: " + brand);
            System.out.println("Computer Model: " + model);
        }
    }

    public void display() {
        class LocalProcessor {
            private String processorType = "AMD ";
            public void showInfo() {
                System.out.println("Local Processor Type: " + processorType);
            }
        }
        LocalProcessor lp = new LocalProcessor();
        lp.showInfo();
    }

    public void runWith() {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Running from an anonymous .");
            }
        };
        r.run();
    }

    public static void main(String[] args) {
        Computer myComputer = new Computer();
        Computer.Processor myProcessor = myComputer.new Processor();
        myProcessor.show();
        myComputer.display();
        myComputer.runWith();
    }
}
