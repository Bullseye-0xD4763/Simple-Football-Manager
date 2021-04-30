public class Forwards extends Players{
    public int finalization;
    public int dribble;
    public int posture;
    public int pass;


    //construtor de criar as variaveis vazias
    public Forwards(){
        super();
        this.finalization = 0;
        this.dribble = 0;
        this.posture = 0;
        this.pass = 0;
    }

    //Pega nos argumentos
    public Forwards(String PlrName, int PlrNumber, int Atc, int Def, int Drb, int finalization, int dribble, int posture){
        super(PlrName, PlrNumber, Atc, Def, Drb, finalization, dribble, posture);
        this.finalization = finalization;
        this.dribble = dribble;
        this.posture = posture;
        this.pass = pass;
    }

    //criar duas instancias de jogador || Pedro.Forwards(Ze)
    public Forwards(Forwards placeholder){
        super(placeholder);
        this.finalization = placeholder.finalization;
        this.dribble = placeholder.dribble;
        this.posture = placeholder.posture;
        this.pass = placeholder.pass;
    }

    //getters e setters
    public int getPosture(){
        return this.posture;
    }
    public int getDribble(){
        return this.dribble;
    }
    public int getFinalization(){
        return this.finalization;
    }
    public int getPass(){
        return this.pass;
    }


    public void setPosture(){
        this.posture = posture;
    }
    public void setDribble(){
        this.dribble = dribble;
    }
    public void setFinalization(){
        this.finalization = finalization;
    }
    public void setPass() {
        this.pass = pass;
    }
}
