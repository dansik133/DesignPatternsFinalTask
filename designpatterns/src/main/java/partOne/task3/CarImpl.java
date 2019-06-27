package partOne.task3;

public class CarImpl implements Car {
    private int speed;

    public void startDriving() {
        speed = 0;
        System.out.println("Starting car");
    }

    public void stopDriving() {
        if (speed == 0)
            System.out.println("Turning car off");
        else
            System.out.println("Cannot stop car");
    }

    public void speedUp() {
        speed++;
    }

    public void slowDown() {
        speed--;
    }

    public void moveLeft() {
        System.out.println("Moving left");
    }

    public void moveRight() {
        System.out.println("Moving right");
    }

    public void showFuel() {
        System.out.println("Tons of fuel, don`t worry");
    }

    public void showPosition() {
        System.out.println("Planet earth");
    }
}
