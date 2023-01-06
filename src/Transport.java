import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {
    private String brand;
    private String model;
    private int engineCapacity;
    private final List<Driver> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();

    public Transport (String brand, String model, int engineCapacity ) {


        if (brand==null) {
            this.brand = "Информация не указана";
        } else {
            this.brand = brand;
        }
        if (model==null) {
            this.model = "Информация не указана";
        } else {
            this.model = model;
        }
        if (engineCapacity==0) {
            this.engineCapacity = 0;
        } else {
            this.engineCapacity = engineCapacity;
        }
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public abstract void printType();

    public void addDriver(Driver... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }
    public abstract boolean service();
    public abstract void repair();

    public List<Driver> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }
}



