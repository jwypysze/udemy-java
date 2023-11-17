package instrukcje.warunkowe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tasks {

    private static final double PERCENTAGE_FOR_JUNIOR = 0.17;
    private static final double PERCENTAGE_FOR_SENIOR = 0.32;
    private static final double BORDER_SALARY = 85528;
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        // Task 1

        int number = 6;

        if (number % 2 == 0) {
            System.out.println("Liczba " + number + " jest parzysta.");
        } else {
            System.out.println("Liczba " + number + " nie jest parzysta.");
        }

        // Task 2

        // Ile podatku zapłaci początkujący programista?

        double salaryForJunior = 55321.89;
        if (salaryForJunior > 0 ) {
            double taxForJunior = salaryForJunior * PERCENTAGE_FOR_JUNIOR;
            System.out.println("Programista zarabiający " + salaryForJunior + " zł rocznie zapłaci " + taxForJunior + " zł podatku.");
        } else {
            System.out.println("Programista nic nie zarobił :(");
        }

        // Ile podatku zapłaci dobrze zarabiający programista?

        double salaryForSenior = 102999.89;
        double differenceBetweenFirstStageAndSecondStageTax = salaryForSenior - BORDER_SALARY;
        if (salaryForSenior > 0) {
            double taxForSenior =
                    BORDER_SALARY * PERCENTAGE_FOR_JUNIOR + PERCENTAGE_FOR_SENIOR * differenceBetweenFirstStageAndSecondStageTax;
            System.out.println("Programista zarabiający " + salaryForSenior + " zł rocznie zapłaci " + taxForSenior + " zł podatku.");
        } else {
            System.out.println("Programista nic nie zarobił :(");
        }

        // Task 3

        try {
            System.out.println("Podaj pierwszą liczbę");
            double firstNumber = SCANNER.nextDouble();
            SCANNER.nextLine();
            System.out.println("Podaj drugą liczbę");
            double secondNumber = SCANNER.nextDouble();
            SCANNER.nextLine();
            System.out.println("Jakie działanie wykonać: + - / * ?");
            String userChoice = SCANNER.nextLine();
            switch (userChoice) {
                case "+":
                    System.out.println(firstNumber + secondNumber);
                    break;
                case "-":
                    System.out.println(firstNumber - secondNumber);
                    break;
                case "/":
                    System.out.println(firstNumber / secondNumber);
                    break;
                case "*":
                    System.out.println(firstNumber * secondNumber);
                    break;
                default:
                    System.out.println("Nie wprowadzono odpowiedniego znaku!");;
            }
        } catch (InputMismatchException e) {
            System.err.println("Musisz wprowadzić liczbę!");
        }
    }
}
