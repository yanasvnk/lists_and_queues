import java.util.List;

public class Main {


    public static void main(String[] args) {

        Car car = new Car("Toyota", "B-901", 45, 3, 7, 250, TypeOfBody.SEDAN);

        Lorry lorry = new Lorry("Ленинград", "SD-678", 90, 4, 9, 145, LiftCapacity.N2);

        Bus bus = new Bus("Жигули", "NM-45", 60, 5, 10, 130, Capacity.AVERAGE);

        DriverB driverB = new DriverB("Иванов Иван", true, 4);

        Sponsor lukoil = new Sponsor("Лукойл", 2000000);
        Sponsor michelin = new Sponsor("Michelin", 3000000);


        car.addDriver(new DriverB("Иванов Иван", true, 4));
        car.addMechanic(new Mechanic<Car>("Пётр ", "Петров ", "Механики России "));
        car.addSponsor(lukoil, michelin);

        lorry.addDriver(new DriverC("Cтепанов Степан", true, 10));
        lorry.addMechanic(new Mechanic<Lorry>("Сергей ", "Сергеев  ", "Механики России"));
        lorry.addSponsor(michelin);

        bus.addDriver(new DriverD("Егоров Егор", true, 19));
        bus.addMechanic(new Mechanic<Bus>("Алексей  ", "Алексеев ", "Механики России "));
        bus.addSponsor(lukoil);


        List<Transport> transports = List.of(car, lorry, bus);


        for (Transport transport : transports) {
            printInfo(transport);
        }
    }

    private static void printInfo(Transport transport) {
        System.out.println("Информация по транспорту " + transport.getBrand() + " " + transport.getModel());

        System.out.println("Водители: ");
        for (Driver driver : transport.getDrivers()) {
            System.out.println(driver.getName());
        }
            System.out.println("Спонсоры: ");
        for (Sponsor sponsor : transport.getSponsors()) {
            System.out.println(sponsor.getName());
        }
            System.out.println("Механики: ");
        for (Mechanic mechanic : transport.getMechanics()) {
            System.out.println(mechanic.getName() + mechanic.getSurname() + mechanic.getCompany());
        }
    }
}











