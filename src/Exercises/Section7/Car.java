package Exercises.Section7;

public class Car {

    private String make = "Kia";
    private String model = "Sportage";
    private String color = "Red";
    private int doors = 4;
    private boolean convertible = false;

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar() {

        System.out.println(
                "Make: " + make + "\n" +
                "Model: " + model + "\n" +
                "Color: " + color + "\n" +
                "Doors: " + doors +
                (convertible ? "\nConvertible" : "")
        );

    }

}
