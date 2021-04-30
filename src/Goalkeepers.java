public class Goalkeepers extends Players{
    public int reflexes;
    public int duel;
    public int airgame;
    public int pass;

    //construtor
    public Goalkeepers(String PlrName, int PlrNumber, int Atc, int Def, int Drb, int reflexes, int duel, int airgame){
        super();
        this.reflexes = reflexes;
        this.duel = duel;
        this.airgame = airgame;
        this.pass = pass;
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
