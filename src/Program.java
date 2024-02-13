import java.util.Scanner;

public class Program {

    public static String inserareSubsirDupaCaracter(String text, char caracter, String subsir) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            result.append(text.charAt(i));

            if (text.charAt(i) == caracter) {
                result.append(subsir);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu textul initial: ");
        String textInitial = scanner.nextLine();

        System.out.print("Introdu subsirul specificat: ");
        String subsirDeInserat = scanner.nextLine();

        System.out.print("Introdu caracterul dupa care sa se insereze subsirul: ");
        char caracterDeInserat = scanner.next().charAt(0);

        String rezultat = inserareSubsirDupaCaracter(textInitial, caracterDeInserat, subsirDeInserat);

        System.out.println("Textul initial: " + textInitial);
        System.out.println("Rezultatul: " + rezultat);
    }
}
