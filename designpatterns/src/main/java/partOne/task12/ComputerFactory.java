package partOne.task12;

public class ComputerFactory {
    public enum ComputerTypes {
        GAMING, OFFICE, LIVING_ROOM
    }

    public static Computer createComputer(ComputerTypes type) {
        Computer computer = null;

        switch (type) {
            case GAMING:
                computer = createGamingComputer();
                break;
            case OFFICE:
                computer = createOfficeComputer();
                break;
            case LIVING_ROOM:
                computer = createLivingRoomComputer();
                break;
        }

        return computer;
    }

    private static Computer createGamingComputer() {
        return (new Computer.Builder()
                .setCase("Cool case")
                .setMotherboard("good motheroard")
                .setProcessor("OK processor")
                .setGraphicsCard("Great card")
                .setRAM("A lot of ram")
                .build());
    }

    private static Computer createOfficeComputer() {
        return (new Computer.Builder()
                .setCase("OK case")
                .setMotherboard("OK motheroard")
                .setProcessor("Great processor")
                .setGraphicsCard("No card")
                .setRAM("Some of ram")
                .build());
    }

    private static Computer createLivingRoomComputer() {
        return (new Computer.Builder()
                .setCase("Small case")
                .setMotherboard("Small motheroard")
                .setProcessor("OK processor")
                .setGraphicsCard("OK card")
                .setRAM("Some of ram")
                .build());
    }
}
