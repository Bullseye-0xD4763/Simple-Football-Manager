package proj;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.SQLOutput;
import java.util.*;


public class Main {

    public static boolean keepAlive;
    private static Scanner in;


    public static void main(String[] args) throws LinhaIncorretaException, IOException {
        //Iniciar objetos
        Parser p = new Parser();
        in = new Scanner(System.in);


        keepAlive = true;
        while (keepAlive == true) {
            System.out.println("\nEnter one of the following options: " + "\n1. Start game" + "\n2. Load Save" + "\n3. Manage Team" + "\n4. Create Team" + "\n5. Create Player" + "\n6. Credits\n7. Exit\n");
            // string name é a capturada
            String stdName = in.nextLine();
            switch (stdName) {
                case "1":
                    System.out.println("Start");
                    Parser.parse();
                    //keepAlive = false;
                    break;
                case "2":

                    // load save
                    keepAlive = false;
                    break;
                case "3":
                    associatePlayer();
                    keepAlive = false;
                    break;
                case "4":
                    createTeam();
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
    //3. Manage team
    private static void associatePlayer() {
        //print jogadores em equipa TEMP
        /*System.out.println("Nome do jogador a transferir");String nome = in.nextLine();
        System.out.println("Nome de equipa de destino"); String destino = in.nextLine();*/

        String a = "Equipa: Temp", b = "Equipa: Temp\nAvancado:Jose-56,23,123,123,23,";


        //Print equipas
    }


    //4. Create team
    private static void createTeam() {
        System.out.println("Nome da equipa:");
        String name = in.nextLine();
        try {
            String content = "\nEquipa: " + name;
            Files.write(Paths.get("src/proj/Jogadores.txt"), content.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //5. Create Player
    private static Jogador createPlayer() throws IOException {
        //Recebe estatísticas
        System.out.println("Nome do jogador:");
        String name = in.nextLine();
        System.out.println("Nº Jogador: ");
        int number = in.nextInt();
        System.out.println("Velocidade: ");
        int velocidade = in.nextInt();
        System.out.println("Resistência: ");
        int resistencia = in.nextInt();
        System.out.println("Destreza: ");
        int destreza = in.nextInt();
        System.out.println("Impulsao: ");
        int impulsao = in.nextInt();
        System.out.println("Cabeça: ");
        int cabeca = in.nextInt();
        System.out.println("Remate: ");
        int remate = in.nextInt();
        System.out.println("Passe: ");
        int passe = in.nextInt();

        //Recebe posição
        System.out.println("Posição: \n1. Avançado\n2. Defesa\n3. Medio\n4.Lateraln\n5. Guarda-Redes \n");
        int posicao = in.nextInt();

        //Procurar a linha onde está a equipa temp
        List<String> lines;
        Path mypath = Paths.get("src/proj/Jogadores.txt");
        try {
            lines = Files.readAllLines(mypath, StandardCharsets.UTF_8);
        } catch (IOException exc) {
            lines = new ArrayList<>();
        }

        for (String linha : lines){
            if (linha == "Equipa: Temp"); System.out.println("DEU");


        }


            //Dependendo da posição escrever "Posição: Nome,vel,res,destr, etc..
            switch (posicao) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Recuperação: ");
                    int rec = in.nextInt();

                    break;
                case 4:
                    System.out.println("Cruzamento: ");
                    int cruz = in.nextInt();
                    break;
                case 5:
                    System.out.println("Elasticidade");
                    break;
            }

        Jogador j = new Jogador(name, number, velocidade, resistencia, destreza, impulsao, cabeca, remate, passe);

        return j;
    }


}


