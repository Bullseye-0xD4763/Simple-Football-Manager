import java.util.ArrayList;

public class MidFielders extends Players{
    public int pass;
    public int creativity;
    public int longshot;
    public int getball;
    public int dribble;

    //construtor de criar as variaveis vazias
    public MidFielders() {
        super();
        this.pass = 0;
        this.creativity = 0;
        this.longshot = 0;
        this.getball = 0;
        this.dribble = 0;

    }

    //getters e setters
    public MidFielders(String PlrName, int PlrNumber, int Atc, int Def, int Drb, int pass, int creativity, int longshot, int getball)
    {
        super(String PlrName, int PlrNumber, int Atc, int Def, int Drb);
        this.pass=pass;
        this.creativity=creativity;
        this.longshot=longshot;
        this.getball=getball;
    }
    public int getCreativity(){
        return this.creativity;
    }
    public int getPass(){
        return this.pass;
    }
    public int getLongshot(){
        return this.longshot;
    }
    public int getGetBall(){
        return this.getball;
    }
    public int getDrible() {
        return this.dribble;
    }


    public void setPass(int pass) {
        this.pass = pass;
    }
    public void setCut(int creativity) {
        this.creativity = creativity;
    }
    public void setDrible(int longshot) {
        this.longshot = longshot;
    }
    public void setGetball(int getball) {
        this.getball = getball;
    }
    public void setDribble(int dribble) {
        this.dribble = dribble;
    }
}





