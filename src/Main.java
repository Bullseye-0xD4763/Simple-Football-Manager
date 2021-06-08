package proj;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class Main{

    public static boolean keepAlive;
    private static Scanner in;




    public static void main(String[] args) throws LinhaIncorretaException {
        //Iniciar objetos
        Parser p  = new Parser();
        in = new Scanner(System.in);


        //Menu
        System.out.println("Enter one of the following options: "+"\n1. Start game"+"\n2. Load Save"+"\n3. Manage Team"+"\n4. Create Team"+"\n5. Create Player"+"\n6. Credits\n7. Exit\n");
        keepAlive = true;
        while (keepAlive == true) {
            // string name é a capturada
            String stdName = in.nextLine();
            switch (stdName) { 
                case "1":
                    System.out.println("Start");
                    Parser.parse();
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
                    createPlayer();
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



    public static Jogador createPlayer(){
        System.out.println("Nome do jogador:"); String name = in.nextLine();
        System.out.println("Nº Jogador: "); int number = in.nextInt();
        System.out.println("Velocidade: "); int velocidade = in.nextInt();
        System.out.println("Resistência: "); int resistencia = in.nextInt();
        System.out.println("Destreza: "); int destreza = in.nextInt();
        System.out.println("Impulsao: "); int impulsao = in.nextInt();
        System.out.println("Cabeça: "); int cabeca = in.nextInt();
        System.out.println("Remate: "); int remate = in.nextInt();
        System.out.println("Passe: ");  int passe = in.nextInt();

        Jogador j = new Jogador(name,number,velocidade,resistencia,destreza,impulsao,cabeca,remate,passe);
        return j;
    }
}



