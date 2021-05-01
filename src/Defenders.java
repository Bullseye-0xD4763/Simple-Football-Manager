public class Defenders extends Players{
    public int speed;
    public int duel;
    public int dribble;
    public int pass;


    //construtor de criar as variaveis vazias
    public Defenders(){
        super();
        this.speed = 0;
        this.duel = 0;
        this.dribble = 0;
        this.pass = 0;
    }

    //Pega nos argumentos
    public Defenders(String PlrName, int PlrNumber, int Atc, int Def, int Drb, int speed, int duel, int dribble){
        super(PlrName, PlrNumber, Atc, Def, Drb, speed, duel, dribble);
        this.speed = speed;
        this.duel = duel;
        this.dribble = dribble;
    }

    //criar duas instancias de jogador || Pedro.Defenders(Ze)
    public Defenders(Defenders placeholder){
        super(placeholder);
        this.speed = placeholder.speed;
        this.duel = placeholder.duel;
        this.dribble = placeholder.dribble;
        this.pass = placeholder.pass;
    }

    //getters e setters
    public int getDribble(){
        return this.dribble;
    }
    public int getDuel(){
        return this.duel;
    }
    public int getSpeed(){
        return this.speed;
    }
    public int getPass(){
        return this.pass;
    }


    public void setDribble(){
        this.dribble = dribble;
    }
    public void setDuel(){
        this.duel = duel;
    }
    public void setSpeed(){
        this.speed = speed;
    }
    public void setPass() {
        this.pass = pass;
    }
}
