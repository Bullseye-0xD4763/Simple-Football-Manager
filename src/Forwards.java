public class Forwards extends Player{
    public int finalization;
    public int composture;
    public int drible;
    
    public Forwards(){
      public Forwards(String PlrName, int PlrNumber, int Atc, int Def, int Drb, int finalization, int composture, int drible){
        super(String PlrName, int PlrNumber, int Atc, int Def, int Drb);
        this.finalization=finalization;
        this.composture=composture;
        this.drible=drible;
    }
    
    public int getFinalization(){
        return this.finalization;
    }
    
    public int getComposture(){
        return this.composture;
    }
    
    public int getDrible(){
        return this.drible;
    }
    
    
}
