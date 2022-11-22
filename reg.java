import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> DataBase = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Email: ");

        String email = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Password: ");

        String password = scanner1.nextLine();

        DataBase.add(email);
        DataBase.add(password);





        System.out.println(DataBase);

    }
}
