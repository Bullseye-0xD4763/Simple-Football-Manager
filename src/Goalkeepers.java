public class Goalkeepers extends Players{
    public int reflexes;
    public int duel;
    public int airgame;
    public int pass;


    //construtor de criar as variaveis vazias
    public Goalkeepers(){
        super();
        this.reflexes = 0;
        this.duel = 0;
        this.airgame = 0;
        this.pass = 0;
    }

    //Pega nos argumentos
    public Goalkeepers(String PlrName, int PlrNumber, int Atc, int Def, int Drb, int reflexes, int duel, int airgame){
        super(PlrName, PlrNumber, Atc, Def, Drb, reflexes, duel, airgame);
        this.reflexes = reflexes;
        this.duel = duel;
        this.airgame = airgame;
        this.pass = pass;
    }

    //criar duas instancias de jogador || Pedro.Goalkeepers(Ze)
    public Goalkeepers(Goalkeepers placeholder){
        super(placeholder);
        this.reflexes = placeholder.reflexes;
        this.duel = placeholder.duel;
        this.airgame = placeholder.airgame;
        this.pass = placeholder.pass;
    }

    //getters e setters
    public int getAirGame(){
        return this.airgame;
    }
    public int getDuel(){
        return this.duel;
    }
    public int getReflexes(){
        return this.reflexes;
    }
    public int getPass(){
        return this.pass;
    }


    public void setAirGame(){
        this.airgame = airgame;
    }
    public void setDuel(){
        this.duel = duel;
    }
    public void setReflexes(){
        this.reflexes = reflexes;
    }
    public void setPass() {
        this.pass = pass;
    }
}
