package partOne.task12.computers;

import partOne.task12.ComputerTemplate;

public abstract class Computer extends ComputerTemplate {
    private String computerCase;
    private String motherboard;
    private String processor;
    private String graphicsCard;
    private String RAM;

    public String getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(String computerCase) {
        this.computerCase = computerCase;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public boolean runComputerTest() {
        System.out.println("I`m OK");

        return true;
    }
}
