public class Wings extends Players{
    public int center;
    public int speed;
    public int endurance;
    public int dexterity;
    public int propulsion;
    public int airgame;
    public int kick;
    public int pass;
    public int longpass;


    //construtor de criar as variaveis vazias
    public Wings(){
        super();
        this.center = 0;
        this.speed = 0;
        this.endurance = 0;
        this.dexterity = 0;
        this.propulsion = 0;
        this.airgame = 0;
        this.kick = 0;
        this.pass = 0;
        this.longpass = 0;
    }

    //Pega nos argumentos
    public Wings(String PlrName, int PlrNumber, int center, int Atc, int Def, int Drb, int speed, int endurance,
                       int dexterity, int propulsion, int airgame, int kick, int pass, int longpass){
        super(PlrName, PlrNumber, Atc, Def, Drb, speed, endurance, dexterity);
        this.center = center;
        this.speed = speed;
        this.endurance = endurance;
        this.dexterity = dexterity;
        this.propulsion = propulsion;
        this.airgame = airgame;
        this.kick = kick;
        this.pass = pass;
        this.longpass = longpass;
    }

    //criar duas instancias de jogador || Pedro.Wings(Ze)
    public Wings(Wings placeholder){
        super(placeholder);
        this.center = placeholder.center;
        this.speed = placeholder.speed;
        this.endurance = placeholder.endurance;
        this.dexterity = placeholder.dexterity;
        this.propulsion = placeholder.propulsion;
        this.airgame = placeholder.airgame;
        this.kick = placeholder.kick;
        this.pass = placeholder.pass;
        this.longpass = placeholder.longpass;
    }

    //getters e setters
    public int getCenter(){
        return this.center;
    }
    public int getSpeed(){
        return this.speed;
    }
    public int getEndurance(){
        return this.endurance;
    }
    public int getDexterity(){
        return this.dexterity;
    }
    public int getPropulsion(){
        return this.propulsion;
    }
    public int getAirGame(){
        return this.airgame;
    }
    public int getKick(){
        return this.kick;
    }
    public int getPass(){
        return this.pass;
    }
    public int getLongpass(){
        return this.longpass;
    }

    public int setCenter(){
        return this.center;
    }
    public int setSpeed(){
        return this.speed;
    }
    public int setEndurance(){
        return this.endurance;
    }
    public int setDexterity(){
        return this.dexterity;
    }
    public int setPropulsion(){
        return this.propulsion;
    }
    public int setAirGame(){
        return this.airgame;
    }
    public int setKick(){
        return this.kick;
    }
    public int setPass(){
        return this.pass;
    }
    public int setLongpass(){
        return this.longpass;
    }
}
{
}
