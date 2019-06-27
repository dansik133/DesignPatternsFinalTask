package partOne.task9;

public class HybridMakerFactory extends CarMakerFactoryBase {
    @Override
    public CarBattery createCarBattary() {
        return new HybridBattery();
    }

    @Override
    public CarCoolingSystem createCarCoolingSystem() {
        return new HybridCollingSystem();
    }

    @Override
    public CarEngine createCarEngine() {
        return new HybridEngine();
    }

    @Override
    public CarLights createCarLights() {
        return new HybridLights();
    }
}
