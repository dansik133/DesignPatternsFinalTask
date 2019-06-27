package partOne.task12;

public abstract class ComputerTemplate {

    public abstract void buildCase();
    public abstract void addMotherboard();
    public abstract void addProcessor();
    public abstract void addGraphicsCard();
    public abstract void addRAM();
    public abstract boolean runComputerTest();

    public void buildComputer() {
        buildCase();
        addMotherboard();
        addProcessor();
        addGraphicsCard();
        addRAM();
        runComputerTest();
    }
}
