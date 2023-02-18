import java.util.Scanner;

public class HeartRatesUsage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" What's your first name?: ");
        String firstName = scanner.nextLine();

        System.out.print("What's your last name?: ");
        String lastName = scanner.nextLine();

        System.out.print("What day where you born? (1-31): ");
        int birthDay = scanner.nextInt();

        System.out.print("What month were you born? (1-12): ");
        int birthMonth = scanner.nextInt();

        System.out.print("What year were you born? (4 digits): ");
        int birthYear = scanner.nextInt();

        HeartRates heartRates = new HeartRates(firstName, lastName, birthDay, birthMonth, birthYear);

        System.out.println("Name: " + heartRates.getFirstName() + " " + heartRates.getLastName());
        System.out.println("Date of Birth: " + heartRates.getBirthMonth() + "/" + heartRates.getBirthDay() + "/" + heartRates.getBirthYear());
        System.out.println("Age: " + heartRates.calculateAge() + " years");
        System.out.println("Your maximum Heart Rate is: " + heartRates.FindMaxHeartRate() + " beats per minute");
        System.out.println("Your target Heart Rate Range is: " + heartRates.FindTargetHeartRate() + " beats per minute");
    }
}
