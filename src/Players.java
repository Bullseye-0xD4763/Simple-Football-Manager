import java.util.ArrayList;

public class Players {
    //mudar aqui
    private String PlrName;
    private int PlrNumber;
    private int Atc;
    private int Def;
    private int Drb;
    private int Drc;


    //Ir buscar valores de variaveis e introduzir
    public Players(String PlrName, int PlrNumber, int Atc, int Def, int Drb) {
        this.PlrName = PlrName;
        this.PlrNumber = PlrNumber;
        this.Atc = Atc;
        this.Def = Def;
        this.Drb = Drb;
    }

    //Copiar valores de outro jogador
    public Players(Players p){
        this(p.PlrName, p.PlrNumber, p.Atc, p.Def, p.Drb);
    }

    //constructor
    public Players() {
        this.PlrName = "";
        this.PlrNumber = 0;
        this.Atc = 0;
        this.Def = 0;
        this.Drb = 0;
    }

    public Players(String plrName, int plrNumber, int atc, int def, int drb, int reflexes, int duel, int airgame) {
    }


    //Getters e Setters
    public void setPlrName(String PlrName) {
        this.PlrName = PlrName;
    }

    public String getPlrName() {
        return PlrName;
    }


    public void setPlrNumber(int PlrNumber) {
        this.PlrNumber = PlrNumber;
    }

    public int getPlrNumber() {
        return PlrNumber;
    }

    public void setAtc(int Atc) {
        this.Atc = Atc;
    }

    public int getAtc() {
        return Atc;
    }
    public void setDef() {
        this.Def = Def;
    }

    public int getDef() {
        return Def;
    }
    public void setDrc(int Drc) {
        this.Drc = Drc;
    }

    public int getDrc(){
        return Drc;
    }
    //clone
    public Players clone(){
        return new Players(this);
    }

    //equals
    public boolean equals(Object p) {
        if (p == this)
            return true;

        if (p == null || this.getClass() != p.getClass())
            return false;

       Players player = (Players) p;

        return this.PlrName.equals(player.PlrName) && this.PlrNumber == player.PlrNumber && this.Atc == player.Atc && this.Def == player.Def && this.Drb == player.Drb;
    }
}
