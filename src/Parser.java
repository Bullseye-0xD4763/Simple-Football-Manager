package proj;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Parser {

    public static void startGame() throws LinhaIncorretaException{
        Scanner in = new Scanner(System.in);
        List<String> linhas = lerFicheiro("src/proj/Jogadores.txt");
        Map<String, Equipa> equipasTotal = new HashMap<>();
        Map<Integer, Jogador> jogadoresTotal = new HashMap<>();
       // List<Jogo> jogos = new ArrayList<>();
        Equipa ultima = null; Jogador j = null;
        String[] linhaPartida;


        for (String linha : linhas) {
            linhaPartida = linha.split(":", 2);
            switch(linhaPartida[0]){
                case "Equipa":
                    Equipa e = Equipa.parse(linhaPartida[1]);
                    equipasTotal.put(e.getNome(), e);
                    ultima = e;
                    break;
                case "Guarda-Redes":
                    j = GuardaRedes.parse(linhaPartida[1]);
                    jogadoresTotal.put(j.getNumeroJogador(), j);
                    if (ultima == null) throw new LinhaIncorretaException(); //we need to insert the player into the team
                    ultima.insereJogador(j.clone()); //if no team was parsed previously, file is not well-formed
                    break;
                case "Defesa":
                    j = Defesa.parse(linhaPartida[1]);
                    jogadoresTotal.put(j.getNumeroJogador(), j);
                    if (ultima == null) throw new LinhaIncorretaException(); //we need to insert the player into the team
                    ultima.insereJogador(j.clone()); //if no team was parsed previously, file is not well-formed
                    break;
                case "Medio":
                    j = Medio.parse(linhaPartida[1]);
                    jogadoresTotal.put(j.getNumeroJogador(), j);
                    if (ultima == null) throw new LinhaIncorretaException(); //we need to insert the player into the team
                    ultima.insereJogador(j.clone()); //if no team was parsed previously, file is not well-formed
                    break;
                case "Lateral":
                    j = Lateral.parse(linhaPartida[1]);
                    jogadoresTotal.put(j.getNumeroJogador(), j);
                    if (ultima == null) throw new LinhaIncorretaException(); //we need to insert the player into the team
                    ultima.insereJogador(j.clone()); //if no team was parsed previously, file is not well-formed
                    break;
                case "Avancado":
                    j = Avancado.parse(linhaPartida[1]);
                    jogadoresTotal.put(j.getNumeroJogador(), j); //.put coloca na
                    if (ultima == null) throw new LinhaIncorretaException(); //we need to insert the player into the team
                    ultima.insereJogador(j.clone()); //if no team was parsed previously, file is not well-formed
                    break;
                default:
                    break;
            }
        }


        //Escolher Equipas

        Equipa casa = null, fora = null;
       // System.out.println("Equipa a escolher:"); String equipaCasa = in.nextLine();
        //System.out.println("Equipa adversária: "); String equipaFora = in.nextLine();

        String a ="Vivaldi F. C.", b ="Mozart F. C.";

        for (Equipa e: equipasTotal.values()){
            if (e.getNome().equals(a)){ casa = e;}
            if (e.getNome().equals(b)){ fora = e;}
           // System.out.println(e.getNome());
        }

        //equipas nao podem ser null nem iguais
        if (casa != null && fora != null && casa != fora){
        System.out.println("\nEquipa escolhida------------\n ");System.out.println(casa.toString());
        System.out.println("\nEquipa adversária-----------\n"); System.out.println(fora.toString());
        }
        else if(casa == null){ System.out.println("Equipa que escolheste não existe."); }
        else if(fora == null){System.out.println("Equipa do oponente não existe."); }



        //Escolher Jogadores
        Equipa casaTitulares = null, casaSuplentes = null, foraTitulares = null, foraSuplentes = null;
        System.out.println("\n*\nMenu de escolha de Plantel------------------\nInsere o nº do jogador para o selecionar");
        casaTitulares = Equipa.defineTeam(casa);

        /*
        System.out.println("Teste teste equipa escolhida -> : ");
        casaTitulares.toString();
        */


        /**/
    }


    public static void parse() throws LinhaIncorretaException {
        List<String> linhas = lerFicheiro("src/proj/Jogadores.txt"); //Lista de Strings = informação ficheiro
        Map<String, Equipa> equipas = new HashMap<>(); //Novo hashmap <CLube do ze, Equipa>
        Map<Integer, Jogador> jogadores = new HashMap<>(); //Novo hashmap <23, Joao>
        List<Jogo> jogos = new ArrayList<>();           //Lista do tipo jogo, com o nome "jogos"
        Equipa ultima = null; Jogador j = null;         //Equipa ultima = null
        String[] linhaPartida;                          //Array de strings
        for (String linha : linhas) {
            linhaPartida = linha.split(":", 2);
            switch(linhaPartida[0]){
                case "Equipa":
                    System.out.println("\nTESTE\n linhaparatida[1] -> " + linhaPartida[1]);
                    Equipa e = Equipa.parse(linhaPartida[1]);
                    equipas.put(e.getNome(), e);
                    ultima = e;
                    break;
                case "Guarda-Redes":
                    j = GuardaRedes.parse(linhaPartida[1]);
                    jogadores.put(j.getNumeroJogador(), j);
                    if (ultima == null) throw new LinhaIncorretaException(); //we need to insert the player into the team
                    ultima.insereJogador(j.clone()); //if no team was parsed previously, file is not well-formed
                    break;
                case "Defesa":
                    j = Defesa.parse(linhaPartida[1]);
                    jogadores.put(j.getNumeroJogador(), j);
                    if (ultima == null) throw new LinhaIncorretaException(); //we need to insert the player into the team
                    ultima.insereJogador(j.clone()); //if no team was parsed previously, file is not well-formed
                    break;
                case "Medio":
                    j = Medio.parse(linhaPartida[1]);
                    jogadores.put(j.getNumeroJogador(), j);
                    if (ultima == null) throw new LinhaIncorretaException(); //we need to insert the player into the team
                    ultima.insereJogador(j.clone()); //if no team was parsed previously, file is not well-formed
                    break;
                case "Lateral":
                    j = Lateral.parse(linhaPartida[1]);
                    jogadores.put(j.getNumeroJogador(), j);
                    if (ultima == null) throw new LinhaIncorretaException(); //we need to insert the player into the team
                    ultima.insereJogador(j.clone()); //if no team was parsed previously, file is not well-formed
                    break;
                case "Avancado":
                    j = Avancado.parse(linhaPartida[1]);
                    jogadores.put(j.getNumeroJogador(), j); //.put coloca na
                    if (ultima == null) throw new LinhaIncorretaException(); //we need to insert the player into the team
                    ultima.insereJogador(j.clone()); //if no team was parsed previously, file is not well-formed
                    break;
                case "Jogo":
                    Jogo jo = Jogo.parse(linhaPartida[1]);
                    jogos.add(jo);
                    break;
                default:
                    throw new LinhaIncorretaException();

            }
        }

        //debug
        for (Equipa e: equipas.values()){
            System.out.println(e.toString());
        }
        for (Jogo jog: jogos){
            System.out.println(jog.toString());

        }

    }

    public static List<String> lerFicheiro(String nomeFich) {
        List<String> lines;
        Path mypath = Paths.get(nomeFich);
        try { lines = Files.readAllLines(mypath, StandardCharsets.UTF_8); }
        catch(IOException exc) { lines = new ArrayList<>(); }
        return lines;
    }

    //LOAD SAVEEEEEEE
    public static void loadSave()throws LinhaIncorretaException{
        List<String> linhas = lerFicheiro("src/proj/Jogadores.txt");
        Map<String, Equipa> equipas = new HashMap<>();
        Map<Integer, Jogador> jogadores = new HashMap<>();
        List<Jogo> jogos = new ArrayList<>();
        Equipa ultima = null; Jogador j = null;
        String[] linhaPartida;
        for (String linha : linhas) {
            linhaPartida = linha.split(":", 2);
            switch(linhaPartida[0]){
                case "Jogo":
                    Jogo jo = Jogo.parse(linhaPartida[1]);
                    jogos.add(jo);
                    break;
                default:
                    break;
            }
        }
        //Print saved games
        for (Jogo jog: jogos){
            System.out.println(jog.toString());
        }


    }


}
