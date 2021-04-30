import java.util.ArrayList;

public class Defenders extends Players{
    public int pass;
    public int cut;
    public int getball;
    public int dribble;

    //construtor de criar as variaveis vazias
    public Defenders() {
        super();
        this.pass = 0;
        this.cut = 0;
        this.dribble = 0;
        this.getball = 0;

    }

    //getters e setters
    public Defenders(String PlrName, int PlrNumber, int Atc, int Def, int Drb, int pass, int cut, int drible, int getball)
    {
        super(String PlrName, int PlrNumber, int Atc, int Def, int Drb);
        this.pass=pass;
        this.cut=cut;
        this.dribble=drible;
        this.getball=getball;
    }
    public int getCut(){
        return this.cut;
    }
    public int getPass(){
        return this.pass;
    }
    public int getDrible(){
        return this.dribble;
    }
    public int getGetBall(){
        return this.getball;
    }


    public void setPass(int pass) {
        this.pass = pass;
    }
    public void setCut(int cut) {
        this.cut = cut;
    }

    public void setDrible(int drible) {
        this.dribble = drible;
    }

    public void setGetball(int getball) {
        this.getball = getball;
    }
}





