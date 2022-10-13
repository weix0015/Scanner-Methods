import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int year;
        double BMI;
        boolean Driver;
        String gender;

        System.out.print("Enter name: ");
        name = in.nextLine();
        System.out.print("Enter year of birth: ");
        year = in.nextInt();
        System.out.print("Enter BMI: ");
        BMI = in.nextDouble();
        System.out.print("Enter True of False for driver's license: ");
        Driver = in.nextBoolean();
        in.nextLine();
        System.out.print("Enter M for male, F for female: ");
        gender = in.nextLine();

        System.out.println("Name : " + name);
        System.out.println("Year of birth: " + year);
        System.out.println("BMI: " + BMI);
        System.out.println("Has driver's license: " + Driver);
        System.out.println("Gender: " + gender);

    }
}
