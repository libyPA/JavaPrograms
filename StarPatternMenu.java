import java.util.*;
public class StarPatternMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, choice;

        do {
            System.out.println("\n--- Star Pattern Menu ---");
            System.out.println("1. Right Triangle Star Pattern");
            System.out.println("2. Inverted Right Triangle Star Pattern");
            System.out.println("3. Right Pascal's Triangle Star Pattern");
            System.out.println("4. Left Triangle Star Pattern");
            System.out.println("5. Inverted Left Triangle Star Pattern");
            System.out.println("6. Left Pascal's Triangle Star Pattern");
            System.out.println("7. Pyramid Star Pattern");
            System.out.println("8. Inverted Pyramid Star Pattern");
            System.out.println("9. Diamond Star Pattern");
            System.out.println("10. Sandglass Star Pattern");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 10) {
                System.out.print("Enter number of rows: ");
                rows = sc.nextInt();
            } else {
                rows = 0;
            }

            switch (choice) {
                case 1 -> rightTriangle(rows);
                case 2 -> invertedRightTriangle(rows);
                case 3 -> rightPascal(rows);
                case 4 -> leftTriangle(rows);
                case 5 -> invertedLeftTriangle(rows);
                case 6 -> leftPascal(rows);
                case 7 -> pyramid(rows);
                case 8 -> invertedPyramid(rows);
                case 9 -> diamond(rows);
                case 10 -> sandglass(rows);
                case 0 -> System.out.println("Exiting program. Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }

    static void rightTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    static void invertedRightTriangle(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    static void rightPascal(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    static void leftTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int s = i; s < rows; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    static void invertedLeftTriangle(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int s = i; s < rows; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    static void leftPascal(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int s = i; s < rows; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--) {
            for (int s = i; s < rows; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    static void pyramid(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int s = i; s < rows - 1; s++) System.out.print(" ");
            for (int j = 0; j < (2 * i + 1); j++) System.out.print("*");
            System.out.println();
        }
    }

    static void invertedPyramid(int rows) {
        for (int i = rows - 1; i >= 0; i--) {
            for (int s = i; s < rows - 1; s++) System.out.print(" ");
            for (int j = 0; j < (2 * i + 1); j++) System.out.print("*");
            System.out.println();
        }
    }

    static void diamond(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int s = i; s < rows - 1; s++) System.out.print(" ");
            for (int j = 0; j < (2 * i + 1); j++) System.out.print("*");
            System.out.println();
        }
        for (int i = rows - 2; i >= 0; i--) {
            for (int s = i; s < rows - 1; s++) System.out.print(" ");
            for (int j = 0; j < (2 * i + 1); j++) System.out.print("*");
            System.out.println();
        }
    }

    static void sandglass(int rows) {
        for (int i = rows - 1; i >= 0; i--) {
            for (int s = i; s < rows - 1; s++) System.out.print(" ");
            for (int j = 0; j < (2 * i + 1); j++) System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i < rows; i++) {
            for (int s = i; s < rows - 1; s++) System.out.print(" ");
            for (int j = 0; j < (2 * i + 1); j++) System.out.print("*");
            System.out.println();
        }
    }
}

