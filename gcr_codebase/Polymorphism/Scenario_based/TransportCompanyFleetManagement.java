class Vehicles {
    String name;
    Vehicles(String name) {
        this.name = name;
    }
    double fuelCost(int km) {
        return 0;
    }
}

class Car extends Vehicles {
    Car(String name) {
        super(name);
    }
    double fuelCost(int km) {
        return km * 8;
    }
}

class Bus extends Vehicles {
    Bus(String name) {
        super(name);
    }
    double fuelCost(int km) {
        return km * 15;
    }
}

class Bike extends Vehicles {
    Bike(String name) {
        super(name);
    }

    double fuelCost(int km) {
        return km * 3;
    }
}

class ElectricCar extends Vehicles {
    ElectricCar(String name) {
        super(name);
    }
    double fuelCost(int km) {
        return km * 2;
    }
}

public class TransportCompanyFleetManagement {
    public static void main(String[] args) {
        Vehicles[] fleet = {
                new Car("Honda"),
                new Bus("Volvo"),
                new Bike("Yamaha"),
                new ElectricCar("Tesla")
        };
        int km = 20;
        for (Vehicles v : fleet) {
            if (v instanceof Car)
                System.out.println("Car Cost = " + v.fuelCost(km));

            else if (v instanceof Bus)
                System.out.println("Bus Cost = " + v.fuelCost(km));

            else if (v instanceof Bike)
                System.out.println("Bike Cost = " + v.fuelCost(km));

            else if (v instanceof ElectricCar)
                System.out.println("Electric Car Cost = " + v.fuelCost(km));
        }
    }
}