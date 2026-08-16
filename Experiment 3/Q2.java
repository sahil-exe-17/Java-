import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int characters = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                characters++;
            }
            else if (ch >= '0' && ch <= '9') {
                digits++;
            }
            else if (ch != ' ') {
                special++;
            }
        }

        System.out.println("Number of characters = " + characters);
        System.out.println("Number of digits = " + digits);
        System.out.println("Number of special symbols = " + special);

        sc.close();
    }
}
