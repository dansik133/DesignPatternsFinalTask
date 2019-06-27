package partOne.task3;

public class CarFacade {
    private Car car;

    public CarFacade() {
        this.car = new CarImpl();
    }
    
    public void showFuel() {
        car.showFuel();
    }

    public void showPosition() {
        car.showPosition();
    }
}
