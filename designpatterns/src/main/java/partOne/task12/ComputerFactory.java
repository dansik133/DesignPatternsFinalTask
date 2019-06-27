package partOne.task12;

import partOne.task12.computers.Computer;
import partOne.task12.computers.GamingComputer;
import partOne.task12.computers.LivingRoomComputer;
import partOne.task12.computers.OfficeComputer;

public class ComputerFactory {
    public static Computer createComputer(ComputerTypes type) {
        Computer computer = null;

        switch (type) {
            case GAMING:
                computer = new GamingComputer();
                break;
            case OFFICE:
                computer = new OfficeComputer();
                break;
            case LIVING_ROOM:
                computer = new LivingRoomComputer();
                break;
        }

        computer.buildComputer();

        return computer;
    }

    public enum ComputerTypes {
        GAMING, OFFICE, LIVING_ROOM
    }
}
