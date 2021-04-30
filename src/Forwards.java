
public class Forwards extends Players {
    public int pass;
    public int composture;
    public int finalization;
    public int getball;
    public int dribble;

    //construtor de criar as variaveis vazias
    public Forwards() {
        super();
        this.pass = 0;
        this.composture = 0;
        this.finalization = 0;
        this.getball = 0;
        this.dribble = 0;

    }

    //getters e setters
    public Forwards(String PlrName, int PlrNumber, int Atc, int Def, int Drb, int pass, int composture, int finalization, int getball) {
        super(String PlrName, int PlrNumber, int Atc, int Def, int Drb);
        this.pass = pass;
        this.composture = composture;
        this.finalization = finalization;
        this.getball = getball;
        this.dribble = dribble;
    }

    public int getComposture() {
        return this.composture;
    }

    public int getPass() {
        return this.pass;
    }

    public int getFinalization() {
        return this.finalization;
    }

    public int getGetBall() {
        return this.getball;
    }
    public int getDrible() {
        return this.dribble;
    }


    public void setPass(int pass) {
        this.pass = pass;
    }

    public void setCut(int composture) {
        this.composture = composture;
    }

    public void setDrible(int finalization) {
        this.finalization = finalization;
    }

    public void setGetball(int getball) {
        this.getball = getball;
    }

    public void setDribble(int dribble) {
        this.dribble = dribble;
    }
}