package org.sofka.punto19;

import org.sofka.utilities.Start;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main Class
 */
public class MainClass extends Start {

    // an instance is created for the scanner class
    protected static Scanner scanner = new Scanner(System.in);

    // List of Ship
    protected static ArrayList<Ship> listShip = new ArrayList<>();

    // Boolean start defaultSpacecraft
    static Boolean defaultSpacecraft = false;

    /**
     * [Método Constructor por defecto]
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.2.0]
     */
    public MainClass() {
        //Método constructor.
    }

    /**
     * [Método sobreescrito de start para iniciar la clase desde el Menu].
     *
     * @author John Esteban Alvarez Piedrahita - esteban.ea145@gmail.com
     * @since [1.2.0]
     */
    @Override
    public void start() {
        while (true) {
            System.out.println("**********************************************");
            System.out.println("* Welcome to the spacecraft favoring machine *");
            System.out.println("**********************************************");
            System.out.println("");

            switch (menu()) {
                case 1:
                    listSpacecraft();
                    break;
                default:
                    createSpacecraft(scanner);
                    break;
            }
            if (close(scanner)) {
                break;
            }

        }
    }

    public static int menu() {
        while (true) {

            System.out.println("****************");
            System.out.println("* Options menu *");
            System.out.println("****************");
            System.out.println("\nPlease select an option");
            System.out.println("1: List of spacecraft");
            System.out.println("2: create a new spacecraft");

            int option = 0;
            try {
                option = Integer.parseInt(scanner.next());
                if (option == 1 || option == 2) {
                    return option;
                } else {
                    System.out.println("\noption not valid\n");
                }
            } catch (NumberFormatException e) {
                // TODO: handle exception
            }
        }
    }

    public static void listSpacecraft() {
        if (!defaultSpacecraft) {
            defaultSpacecraft();
        }

        printShips();

    }

    public static void defaultSpacecraft() {
        MannedSpacecrasft falconx = new MannedSpacecrasft("Falcon X", 420, 100, 1, 7, "MMH");

        ShuttleVehicles shuttleVehicles = new ShuttleVehicles("Saturno V", 2900, 100, 118, 160000, 3500,
                "refined oil and liquid oxygen");

        UnmannedSpacecraft AtvSatellite = new UnmannedSpacecraft("ATV", 258, 40, 0.2f, 4, "MMH", "óxido");

        UnmannedSpacecraft robotExplores = new UnmannedSpacecraft("robotExplores", 100, 9, 0.1f, 2, "MMH", "");

        listShip.add(falconx);
        listShip.add(robotExplores);
        listShip.add(AtvSatellite);
        listShip.add(shuttleVehicles);

        defaultSpacecraft = true;
    }

    public static void printShips() {
        for (int i = 0; i < listShip.size(); i++) {
            listShip.get(i).printShip();
        }
    }

    public static String name = new String();
    public static float weigh = 0;
    public static float height = 0;
    public static int loadCapacity = 0;
    public static int horsepower = 0;
    public static int tonsThrus = 0;
    public static String nameFuel = new String();

    public static void createSpacecraft(Scanner scanner) {
        // name Fuel of shuttle Vehicles

        System.out.println("There are three types of space vehicles: " +
                "\n1) shuttle vehicles, " +
                "\n2) unmanned or robotic spacecraft, and " +
                "\n3) manned spacecraft.");
        System.out.println("\nPlease select which type of special vehicle " +
                "\nyou want to build according to your number " +
                "\n(1, 2 or 3):");

        // selected spacecraft type number
        int numTypeShip = 0;

        while (true) {
            // the user's answer typed on the keypad is captured.
            // a TRY-CHAST is used to perform the equation in case the typed data is not of
            // numerical type.
            try {
                numTypeShip = Integer.parseInt(scanner.next());
                if (numTypeShip == 1 || numTypeShip == 2 || numTypeShip == 3) {
                    break;
                } else {
                    System.out.println("\nplease enter a valid option");
                    System.out.println("1) shuttle vehicles, " +
                            "\n2) unmanned or robotic spacecraft, and " +
                            "\n3) manned spacecraft.");
                }
            } catch (NumberFormatException numEx) {
                System.out.println("\nplease enter a valid option");
                System.out.println("1) shuttle vehicles, " +
                        "\n2) unmanned or robotic spacecraft, and " +
                        "\n3) manned spacecraft.");
            }
        }

        switch (numTypeShip) {
            case 1:
                // insert data of class Ship
                insertDataShip();

                // insert data of loadCapacity and horsepower for object of Ship
                insertDataShuttle();

                // shuttle vehicle
                // an object of the vehicle class of the shuttle is created
                ShuttleVehicles shuttleVehicles = new ShuttleVehicles(name, weigh, height, loadCapacity, horsepower, tonsThrus,
                        nameFuel);
                System.out.println("**********************************************************");
                System.out.println("* Congratulations the Shuttle Vehicles has been created. *");
                System.out.println("**********************************************************");
                // print date of Ship
                shuttleVehicles.printShip();
                listShip.add(shuttleVehicles);
                break;
            case 2:

                // insert data of class Ship
                insertDataShip();
                // unmanned spacecraft
                int motors = 0;
                String energy1 = "";
                String energy2 = "";

                // ship motors
                while (true) {
                    try {
                        System.out.println("Please enter spacecraft motors (4)");
                        motors = Integer.parseInt(scanner.next());
                        break;
                    } catch (NumberFormatException e) {
                    }
                }

                System.out.println("please enter the name of type energy 1 for Unmanned Spacecrasft");
                energy1 = scanner.next();

                System.out.println("please enter the name of type energy 2 for Unmanned Spacecrasft");
                energy2 = scanner.next();

                // an object of the vehicle class of unmanned spacecraft is created
                UnmannedSpacecraft unmannedSpacecraft = new UnmannedSpacecraft(name, weigh, height, tonsThrus, motors, energy1,
                        energy2);
                System.out.println("*************************************************************");
                System.out.println("* Congratulations the unmanned spacecraft has been created. *");
                System.out.println("*************************************************************");
                // print date of Ship
                unmannedSpacecraft.printShip();
                listShip.add(unmannedSpacecraft);
                break;
            case 3:

                // insert data of class Ship
                insertDataShip();
                // ship capabilityPeople
                int capabilityPeople = 0;
                while (true) {
                    try {
                        System.out.println("please enter the capability People for mannedSpacecrasft -> (7)people:");
                        capabilityPeople = Integer.parseInt(scanner.next());
                        break;
                    } catch (NumberFormatException e) {
                    }
                }

                System.out.println("please enter the name fuel for mannedSpacecrasft");
                // insert data name fuel
                nameFuel = scanner.next();
                // manned spacecraft
                // an object of the vehicle class of manned spacecraft is created
                MannedSpacecrasft mannedSpacecrasft = new MannedSpacecrasft(name, weigh, height, tonsThrus, capabilityPeople,
                        nameFuel);
                System.out.println("***********************************************************");
                System.out.println("* Congratulations the manned spacecraft has been created. *");
                System.out.println("***********************************************************");
                // print date of Ship
                mannedSpacecrasft.printShip();
                listShip.add(mannedSpacecrasft);
                break;

            default:
                break;
        }

    }

    public static void insertDataShip() {

        // ship name
        System.out.println("Please enter spacecraft name");
        name = scanner.next();

        // ship weigh
        while (true) {
            try {
                System.out.println("Please enter spacecraft weigh in tons (2900.0)");
                weigh = Float.parseFloat(scanner.next());
                break;
            } catch (NumberFormatException e) {
            }
        }

        // ship height
        while (true) {
            try {
                System.out.println("please enter spacecraft height in meters (100)");
                height = Float.parseFloat(scanner.next());
                break;
            } catch (NumberFormatException e) {
            }
        }

        // ship tonsThrus
        while (true) {
            try {
                System.out.println("please enter spacecraft tonsThrus (3500.32)");
                tonsThrus = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
            }
        }

    }

    public static void insertDataShuttle() {
        // ship loadCapacity
        while (true) {
            try {
                System.out.println("please enter spacecraft loadCapacity (3500): ");
                loadCapacity = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
            }
        }

        // ship horsepower
        while (true) {
            try {
                System.out.println("please enter spacecraft horsepower (2900): ");
                horsepower = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
            }
        }

        // name fuel
        System.out.println("please enter spacecraft name Fuel");
        nameFuel = scanner.next();
    }

    public static Boolean close(Scanner scanner) {
        System.out.println("\nDo you wish to finish the program? Yes/No");
        String finish = scanner.next();
        finish = finish.toLowerCase();
        if (finish.equals("y") || finish.equals("yes")) {
            return true;
        }
        return false;
    }

}
