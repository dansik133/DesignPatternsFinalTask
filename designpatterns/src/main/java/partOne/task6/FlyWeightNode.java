package partOne.task6;

public class FlyWeightNode implements Flyweight {
    int base;
    int exponent;

    public FlyWeightNode(int base, int exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    @Override
    public double operation() {
        return Math.pow(base, exponent);
    }
}
