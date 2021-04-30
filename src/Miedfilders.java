public class Midfielders extends Player{
    public int passe;
    public int creatividade;
    public int rematesdelonge;
    public int recuperarbolas;
    
    public Midfielders(){
        
    }
    public Midfielders(String PlrName, int PlrNumber, int Atc, int Def, int Drb, int passe, int creatividade, int rematesdelonge, int recuperarbolas)
    {
      super(String PlrName, int PlrNumber, int Atc, int Def, int Drb);
        this.passe=passe;
        this.creatividade=creatividade;
        this.rematesdelonge=rematesdelonge;
        this.recuperarbolas=recuperarbolas;
    }
  public int getCreatividade(){
        return this.creatividade;
    }
    public int getPasse(){
        return this.passe;
    }
    public int getRematesdelonge(){
        return this.rematesdelonge;
    }
  public int getRecuperarbolas(){
    return this.recuperarbolas;
  }
}
