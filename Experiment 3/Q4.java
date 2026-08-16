import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "12345";
        boolean correct = false;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (password.equals(correctPassword)) {
                System.out.println("Password is correct!");
                correct = true;
                break;
            } else {
                System.out.println("Wrong password!");
            }
        }

        if (!correct) {
            System.out.println("You have used all 3 attempts.");
        }

        sc.close();
    }
}
