
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String lastName;
        String identNumber;
        while (true) {
            System.out.println("First name: ");
            firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                break;
            }
            System.out.println("Last name: ");
            lastName = scanner.nextLine();
            System.out.println("Identification number: ");
            identNumber = scanner.nextLine();
            PersonalInformation pInformation = new PersonalInformation(firstName, lastName, identNumber);
            infoCollection.add(pInformation);
        }
        for (PersonalInformation information : infoCollection) {
            System.out.println(information.getFirstName() + " " + information.getLastName());
        }
    }
}
