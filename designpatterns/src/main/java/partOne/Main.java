package partOne;

import partOne.task10.composites.Window;
import partOne.task10.leafs.ColorfulEdges;
import partOne.task10.leafs.D3Lights;
import partOne.task10.leafs.FlickeringBackground;
import partOne.task12.ComputerFactory;
import partOne.task12.computers.Computer;
import partOne.task3.Car;
import partOne.task3.CarFacade;
import partOne.task3.CarImpl;
import partOne.task5.*;
import partOne.task8.PullUpsWorkout;
import partOne.task8.SquatsWorkout;

import java.util.Scanner;

public class Main {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int task = getTaskToRun();

        while (runTask(task)) {
            task = getTaskToRun();
        }
    }

    public static int getTaskToRun() {
        System.out.println("Choose task (3, 5, 8, 10, 12): ");
        return reader.nextInt();
    }

    private static boolean runTask(int task) {
        switch (task) {
            case 3: {
                Car car = new CarImpl();
                car.moveLeft();

                CarFacade carFacade = new CarFacade();
                carFacade.showFuel();

                return true;
            }
            case 5: {
                Logger logger = new InfoLogger();
                Logger errorLogger = new ErrorLogger();
                Logger fatalLogger = new FatalLogger();

                logger.setNextLogger(errorLogger).setNextLogger(fatalLogger);

                logger.log("info", LogLevel.INFO);
                System.out.println("=============================");
                logger.log("this is a fatal message", LogLevel.FATAL);

                return true;
            }
            case 8: {
                PullUpsWorkout workout1 = new PullUpsWorkout();
                SquatsWorkout workout2 = new SquatsWorkout();

                workout1.workout();
                System.out.println("=============================");
                workout2.workout();

                return true;
            }
            case 10: {
                Window window = new Window();

                window.addChild(new D3Lights());
                window.addChild(new ColorfulEdges());
                window.addChild(new FlickeringBackground());

                window.printMe();

                return true;
            }
            case 12: {
                Computer computer = ComputerFactory.createComputer(ComputerFactory.ComputerTypes.GAMING);
                System.out.println(computer.runComputerTest());

                return true;
            }
            default: return false;
        }
    }
}
