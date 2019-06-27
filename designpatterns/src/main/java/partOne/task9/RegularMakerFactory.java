package partOne.task9;

public class RegularMakerFactory extends CarMakerFactoryBase {
    @Override
    public CarBattery createCarBattary() {
        return new RegularBattery();
    }

    @Override
    public CarCoolingSystem createCarCoolingSystem() {
        return new RegularCoolingSystem();
    }

    @Override
    public CarEngine createCarEngine() {
        return new RegularEngine();
    }

    @Override
    public CarLights createCarLights() {
        return new RegularLights();
    }
}
