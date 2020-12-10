package nl.novi.dpcc.builder.domain;

public class Garden {
    private int amountOfTrees;
    private double length;
    private double width;

    public Garden(int amountOfTrees, double length, double width) {
        this.amountOfTrees = amountOfTrees;
        this.length = length;
        this.width = width;
    }

    public int getAmountOfTrees() {
        return amountOfTrees;
    }

    public void setAmountOfTrees(int amountOfTrees) {
        this.amountOfTrees = amountOfTrees;
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

    @Override
    public String toString() {
        return "Garden{" +
                "amountOfTrees=" + amountOfTrees +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
