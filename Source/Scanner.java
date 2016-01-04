import java.util.Scanner;

public class Scanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ricardo:\t");
        String sentence = scanner.nextLine();

        System.out.print("Chaviano:\t");
        int index = scanner.nextInt();

        System.out.println("\nFreshman:\t" + sentence);
        System.out.println("Your index:\t" + index);
    }
}
