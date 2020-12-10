package nl.novi.dpcc.builder.domain;

public class Garage {
    private double length;
    private double width;
    private String doorType;

    public Garage(double length, double width, String doorType) {
        this.length = length;
        this.width = width;
        this.doorType = doorType;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getDoorType() {
        return doorType;
    }

    public void setDoorType(String doorType) {
        this.doorType = doorType;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "length=" + length +
                ", width=" + width +
                ", doorType='" + doorType + '\'' +
                '}';
    }
}
