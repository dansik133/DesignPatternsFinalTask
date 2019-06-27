package partOne;

import partOne.task10.composites.Window;
import partOne.task10.leafs.ColorfulEdges;
import partOne.task10.leafs.D3Lights;
import partOne.task10.leafs.FlickeringBackground;
import partOne.task11.GameManager;
import partOne.task12.ComputerFactory;
import partOne.task12.Computer;
import partOne.task3.Car;
import partOne.task3.CarFacade;
import partOne.task3.CarImpl;
import partOne.task4.MultiplyStrategy;
import partOne.task4.SortStrategy;
import partOne.task4.StatisticArray;
import partOne.task4.StatisticIterator;
import partOne.task5.*;
import partOne.task6.FlyWeightNode;
import partOne.task7.ChatRoom;
import partOne.task7.User;
import partOne.task8.PullUpsWorkout;
import partOne.task8.SquatsWorkout;
import partOne.task9.CarComponent;
import partOne.task9.CarMakerFactoryBase;
import partOne.task9.HybridMakerFactory;

import java.util.ArrayList;
import java.util.List;
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
        System.out.println("Choose task (3, 4, 5, 6, 7, 8, 9, 10, 11, 12): ");
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
            case 4: {
                StatisticArray statisticArray = new StatisticArray(new SortStrategy());
                statisticArray.add(5);
                statisticArray.add(3);
                statisticArray.add(4);
                statisticArray.add(12);
                statisticArray.add(322);

                System.out.println("Choose option: (1 to sort, 2 to double)");
                int choice = reader.nextInt();

                if(choice == 1) {
                    statisticArray.setStrategy(new SortStrategy());
                    statisticArray.handleStrategy();
                } else if(choice  == 2) {
                    statisticArray.setStrategy(new MultiplyStrategy());
                    statisticArray.handleStrategy();
                }

                StatisticIterator iteratorArr = statisticArray.iterator();

                while (iteratorArr.hasNext())
                    System.out.print(iteratorArr.next() + ", ");
                System.out.println();

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
            case 6: {
                List<FlyWeightNode> list = new ArrayList<>();

                list.add(new FlyWeightNode(6,100));

                System.out.println(list.get(0).operation());

                return true;
            }
            case 7: {
                ChatRoom chatRoom = new ChatRoom();
                User user1 = new User("user1");
                User user2 = new User("user2");
                User user3 = new User("user3");

                chatRoom.addUser(user1);
                chatRoom.addUser(user2);
                chatRoom.addUser(user3);

                user1.send("Hi all");
                user2.send("Hi user3", user3);

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
            case 9: {
                CarMakerFactoryBase factory = new HybridMakerFactory();
                List<CarComponent> result = new ArrayList<>();

                result.add(factory.createCarEngine());
                result.add(factory.createCarBattary());
                result.add(factory.createCarBody());
                result.add(factory.createCarCoolingSystem());
                result.add(factory.createCarLights());
                result.add(factory.createCarSeats());
                result.add(factory.createCarWheels());

                System.out.println("Hybrid car has : ");
                result.forEach(System.out::println);

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
            case 11: {
                GameManager.play();

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
