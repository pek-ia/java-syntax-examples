public class Vehicle {
    public Vehicle(int vin, String color, String model) {
        this.vin = vin;
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private int vin;
    private String color;
    private String model;
}
