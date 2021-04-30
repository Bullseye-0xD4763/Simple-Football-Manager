public class MidFielders extends Players{
    public int getball;
    public int creativity;
    public int longshot;
    public int pass;


    //construtor de criar as variaveis vazias
    public MidFielders(){
        super();
        this.getball = 0;
        this.creativity = 0;
        this.longshot = 0;
        this.pass = 0;
    }

    //Pega nos argumentos
    public MidFielders(String PlrName, int PlrNumber, int Atc, int Def, int Drb, int getball, int creativity, int longshot){
        super(PlrName, PlrNumber, Atc, Def, Drb, getball, creativity, longshot);
        this.getball = getball;
        this.creativity = creativity;
        this.longshot = longshot;
        this.pass = pass;
    }

    //criar duas instancias de jogador || Pedro.MidFielders(Ze)
    public MidFielders(MidFielders placeholder){
        super(placeholder);
        this.getball = placeholder.getball;
        this.creativity = placeholder.creativity;
        this.longshot = placeholder.longshot;
        this.pass = placeholder.pass;
    }

    //getters e setters
    public int getLongShot(){
        return this.longshot;
    }
    public int getCreativity(){
        return this.creativity;
    }
    public int getGetBall(){
        return this.getball;
    }
    public int getPass(){
        return this.pass;
    }


    public void setLongShot(){
        this.longshot = longshot;
    }
    public void setCreativity(){
        this.creativity = creativity;
    }
    public void setGetBall(){
        this.getball = getball;
    }
    public void setPass() {
        this.pass = pass;
    }
}
