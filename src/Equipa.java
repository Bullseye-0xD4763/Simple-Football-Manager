package proj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Equipa {

    private String nome;
    private List<Jogador> jogadores;

    public Equipa(String nomeE) {
        nome=nomeE;
        jogadores = new ArrayList<Jogador>();
    }

    public static Equipa parse(String input){
        String[] campos = input.split(",");
        return new Equipa(campos[0]);
    }

    public void insereJogador(Jogador j) {
        jogadores.add(j.clone());
    }

    public String getNome(){
        return nome;
    }

    public String toString(){
        String r =  "Equipa:" + nome + "\n";
        for (Jogador j : jogadores){
            r += j.toString();
        }
        return r;
    }

    public static Equipa defineTeam(Equipa e){
        Scanner in = new Scanner(System.in); Equipa r = e; int n, counter = 0;
        r.jogadores = new ArrayList<Jogador>();

        System.out.println();
        for (Jogador j : e.jogadores){
            System.out.println(j.toStringWithStats());

        }
        while (counter != 11){
            n = in.nextInt();
            for (Jogador j: e.jogadores){
                if (j.getNumeroJogador() == n){ r.insereJogador(j); counter++;}
            }
            System.out.println("A tua Equipa: "+r.toString());
        }

        return r;
    }


}


