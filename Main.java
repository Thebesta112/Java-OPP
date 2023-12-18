public class Main {

        public static void main(String[] args) {

            Car car1 = new Car("Opel", "TheBest", 2022, 1.8, 4, true, "Red", 15000);

            Car car2 = new Car("Volkswagen", "Golf", 2021, 1.5, 4, false, "Blue", 20000);

            Car car3 = new Car("Polonez", "W11", 2023, 5.0, 2, true, "Black", 10000);

            Plane plane1 = new Plane("Boeing", "737", 2018, 180, 600, 20000, true, "Jet");

            Plane plane2 = new Plane("LOT", "A320", 2020, 150, 650, 22000, true, "Turbofan");

            Plane plane3 = new Plane("Łachmyt", "172", 2015, 4, 150, 1000, false, "Piston");

            Boat boat1 = new Boat("Karczycho", "Cruise Ship", 2004, 345, 41, 30, 2700, false);

            Boat boat2 = new Boat("Holender", "Container Ship", 2006, 397, 56, 25, 27000, true);

            Boat boat3 = new Boat("Diabeł", "Destroyer", 2016, 190, 24, 30, 150, false);

            System.out.println(car1.getBrand());
            System.out.println(car2.getBrand());
            System.out.println(car3.getBrand());
            System.out.println(plane1.getModel());
            System.out.println(plane2.getModel());
            System.out.println(plane3.getModel());
            System.out.println(boat1.getName());
            System.out.println(boat2.getName());
            System.out.println(boat3.getName());
        }

    }

