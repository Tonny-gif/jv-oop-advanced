package core.basesyntax.models;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;

    public IsoscelesTrapezoid(String color, double area, double sideA,
                              double sideB, double height) {
        super(color, area);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public IsoscelesTrapezoid() {
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String draw(Object o) {
        return o.toString();
    }

    @Override
    public double obtainArea() {
        return ((sideA + sideB) / 2) * height;
    }

    @Override
    public String toString() {
        return super.toString() + ", sideA: "
                + sideA + " units, sideB: "
                + sideB + " units, height: "
                + height + " units , color: "
                + getColor();
    }
}


