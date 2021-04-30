public class Goalkeepers extends Player {
    public int reflexos;
    public int umparaum;
    public int jogoaereo;
    
    public Goalkeepers(){
        
    }
    
    public Goalkeepers(String PlrName, int PlrNumber, int Atc, int Def, int Drb, int reflexos, int umparaum, int jogoaereo){
        super(PlrName, PlrNumber, Atc, Def, Drb);
        this.reflexos = reflexos;
        this.umparaum = umparaum;
        this.jogoaereo = jogoaereo;
    }
    
    public int getJogoaereo(){
        return this.jogoaereo;
    }
    public int getUmparaum(){
        return this.umparaum;
    }
    public int getReflexos(){
        return this.reflexos;
    }

}
