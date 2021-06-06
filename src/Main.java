package proj;

import java.util.*;


public class Main{

    private static Scanner in;

    public static void main(String[] args) {
        //Iniciar objetos
        proj.Parser p  = new proj.Parser();
        in = new Scanner(System.in);



        //Menu
        System.out.println("Enter one of the following options: "+"\n1. Start game"+"\n2. Load Save"+"\n3. Manage Team"+"\n4. Create Team"+"\n5. Create Player"+"\n6. Credits\n7. Exit\n");
        boolean keepAlive = true;
        while (keepAlive == true) {
            // string name é a capturada
            //char name = in.next().charAt(0);
            String stdName = in.nextLine();
            switch (stdName) {
                case "1":
                    System.out.println("Start");
                    try {
                        Parser.parse();
                    } catch (LinhaIncorretaException e) {
                        e.printStackTrace();
                    }
                    keepAlive = false;
                    break;
                case "2":
                    // load save
                    keepAlive = false;
                    break;
                case "3":
                    // Manage Team
                    keepAlive = false;
                    break;
                case "4":
                    // Create Team
                    keepAlive = false;
                    break;
                case "5":
                    // Create Player
                    keepAlive = false;
                    break;
                case "6":
                    // Créditos
                    keepAlive = false;
                    break;
                case "7":
                    // Leave Game
                    keepAlive = false;
                    break;
                default:
                    // it will end the program
                    System.out.println("Invalid option");
                    keepAlive = false;
                    in.close();
            }
        }
    }
}


