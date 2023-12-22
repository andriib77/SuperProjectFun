package Jenia.airtraffic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер рейса: ");
        String flightNumber = scanner.nextLine();

        System.out.print("Введите город отправления: ");
        String departureCity = scanner.nextLine();

        System.out.print("Введите город назначения: ");
        String destinationCity = scanner.nextLine();

        System.out.print("Был ли рейс задержан? (true/false): ");
        boolean delayed = scanner.nextBoolean();

        System.out.print("Был ли рейс отменен? (true/false): ");
        boolean cancelled = scanner.nextBoolean();

        Aircraft boeing747 = new Aircraft("747", "Пассажирский", 416, 987000, 913, 7240, 18000, 200000, 0.2);
        Flight flight = new Flight(flightNumber, departureCity, destinationCity, delayed, cancelled, boeing747);

        System.out.println("Информация о рейсе:\n" + flight);
    }
}