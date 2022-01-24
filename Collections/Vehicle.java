public class Vehicle {
    String make;
    String model;
    int price;

    public Vehicle(String make, String model, int price, boolean fourWDrive) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.fourWDrive = fourWDrive;
    }

    @Override // 2nd method hash to string
    public String toString() {
        return "Vehicle [fourWDrive=" + fourWDrive + ", make=" + make + ", model=" + model + ", price=" + price + "]";
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFourWDrive() {
        return fourWDrive;
    }

    public void setFourWDrive(boolean fourWDrive) {
        this.fourWDrive = fourWDrive;
    }

    boolean fourWDrive;
}
