package partOne.task12;

public class Computer {
    private String computerCase;
    private String motherboard;
    private String processor;
    private String graphicsCard;
    private String RAM;

    public String getComputerCase() {
        return computerCase;
    }

    private void setComputerCase(String computerCase) {
        this.computerCase = computerCase;
    }

    public String getMotherboard() {
        return motherboard;
    }

    private void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getProcessor() {
        return processor;
    }

    private void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    private void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getRAM() {
        return RAM;
    }

    private void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public boolean runComputerTest() {
        System.out.println("I`m OK");

        return true;
    }

    public static class Builder {
        private String computerCase;
        private String motherboard;
        private String processor;
        private String graphicsCard;
        private String RAM;

        public Builder setCase(String computerCase) {
            this.computerCase = computerCase;

            return this;
        }

        public Builder setMotherboard(String motherboard) {
            this.motherboard = motherboard;

            return this;
        }

        public Builder setProcessor(String processor) {
            this.processor = processor;

            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;

            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;

            return this;
        }

        public Computer build() {
            Computer computer = new Computer();

            computer.setComputerCase(computerCase);
            computer.setMotherboard(motherboard);
            computer.setProcessor(processor);
            computer.setGraphicsCard(graphicsCard);
            computer.setRAM(RAM);

            return computer;
        }
    }
}
