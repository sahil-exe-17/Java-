import java.util.Scanner;

class Cube {
    int length, breadth, height;
    
    Cube() {
        length = 5;
        breadth = 5;
        height = 5;
    }

    Cube(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    Cube(Scanner sc) {
        System.out.print("Enter Length: ");
        length = sc.nextInt();

        System.out.print("Enter Breadth: ");
        breadth = sc.nextInt();

        System.out.print("Enter Height: ");
        height = sc.nextInt();
    }

    int volume() {
        return length * breadth * height;
    }
    
    void display() {
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Height = " + height);
        System.out.println("Volume = " + volume());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cube c1 = new Cube();
        Cube c2 = new Cube(4, 6, 8);
        Cube c3 = new Cube(sc);

        System.out.println("\nDefault Constructor Object:");
        c1.display();

        System.out.println("Parameterized Constructor Object:");
        c2.display();

        System.out.println("User-defined Constructor Object:");
        c3.display();

        sc.close();
    }
}
