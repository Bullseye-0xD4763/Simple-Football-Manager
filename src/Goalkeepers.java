public class Goalkeepers extends Player {
    public int reflexes;
    public int duel;
    public int airgame;
    
    public Goalkeepers(){
        
    }
    
    public Goalkeepers(String PlrName, int PlrNumber, int Atc, int Def, int Drb, int reflexes, int duel, int airgame){
        super();
        this.reflexes = reflexes;
        this.duel = duel;
        this.airgame = airgame;
    }
    
    public int getAirGame(){
        return this.airgame;
    }
    public int getDuel(){
        return this.duel;
    }
    public int getReflexes(){
        return this.reflexes;
    }

}
