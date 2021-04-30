public class Forwards extends Player{
    public int finalizacao;
    public int compostura;
    public int drible;
    
    public Forwards(){
      public Forwards(String PlrName, int PlrNumber, int Atc, int Def, int Drb, int finalizacao, int compostura, int drible){
        super(String PlrName, int PlrNumber, int Atc, int Def, int Drb);
        this.finalizacao=finalizacao;
        this.compostura=compostura;
        this.drible=drible;
    }
    
    public int getFinalizacao(){
        return this.finalizacao;
    }
    
    public int getCompostura(){
        return this.compostura;
    }
    
    public int getDrible(){
        return this.drible;
    }
    
    
}
