package partOne.task9;

public abstract class CarMakerFactoryBase {

    public abstract CarBattery createCarBattary();

    public CarBody createCarBody(){
        return new CarBody();
    }

    public abstract CarCoolingSystem createCarCoolingSystem();

    public abstract CarEngine createCarEngine();

    public abstract CarLights createCarLights();

    public CarSeats createCarSeats(){
        return new CarSeats();
    }

    public CarWheels createCarWheels(){
        return new CarWheels();
    }

}
