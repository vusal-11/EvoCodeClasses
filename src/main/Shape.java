package main;

public class Shape {
    private String color;
    private int numberOfSides;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public double calculatePerimeter() {
        // Assuming a generic formula for perimeter calculation
        return 2 * numberOfSides;
    }
}
