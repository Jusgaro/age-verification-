import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your birth date (day:month:year) : ");
    String input = scanner.nextLine();

    try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");
            LocalDate birthDate = LocalDate.parse(input, formatter);
            LocalDate today = LocalDate.now();

    if (birthDate.isAfter(today)) {
        System.out.println("Date cant be in the future!");
        }

    Period vek = Period.between(birthDate, today);

    if (vek.getYears() >=18) {
        System.out.println("You can enter because your age is: " + vek.getYears());
    }

    else {
        System.out.println("You cant enter because your age is: " + vek.getYears());
    }
    } catch (Exception e) {
        System.out.println("Wrong format please use format dd:mm:yyyy like (31.02.2000)");
    }
    }
}