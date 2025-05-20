// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

//
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (count < 20) {
            System.out.println("Naciśnij Enter, aby kontynuować...");
            scanner.nextLine(); // Czekaj na naciśnięcie Enter
            count++;
            System.out.println(count);
        }

        System.out.println("Koniec liczenia.");
        scanner.close();
    }
}