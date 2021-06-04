



package proj;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {

        Parser.parse();
    }

}

class PrintAndScan {
    public static void printmenu() {

        System.out.print("Enter one of the following options: " + "\n1. Start game" + "\n2. Leave Game"
                + "\n3. Load Save" + "\n4. Manage Team" + "\n5. Create Team" + "\n6. Create Player" + "\n7. Credits\n");
    }

    public static void main(String args[]) {
        boolean startLoop = false;
        while (startLoop == false) {
            Scanner in = new Scanner(System.in);
            printmenu();
            // string name é a capturada
            char name = in.next().charAt(0);
            switch (name) {
                case '1':
                    System.out.println("Start");
                    // Start game
                    startLoop = true;
                case '2':
                    // Leave Game
                    startLoop = true;
                case '3':
                    // load save
                    startLoop = true;
                case '4':
                    // Manage Team
                    startLoop = true;
                default:
                    // it will end the program
                    System.out.println("Invalid option");
                    in.close();
            }
        }
    }
}
