public class Midfielders extends Player{
    public int pass;
    public int creativity;
    public int longshot;
    public int getball;
    
    public Midfielders(){
        
    }
    public Midfielders(String PlrName, int PlrNumber, int Atc, int Def, int Drb, int pass, int creativity, int longshot, int getball)
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
    public int getLongShot(){
        return this.longshot;
    }
  public int getGetBall(){
    return this.getball;
  }
}
