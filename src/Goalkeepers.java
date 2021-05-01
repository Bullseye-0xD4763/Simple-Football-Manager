public class Goalkeepers extends Players{
    public int speed;
    public int endurance;
    public int dexterity;
    public int propulsion;
    public int airgame;
    public int kick;
    public int pass;
    public int elasticity;


    //construtor de criar as variaveis vazias
    public Goalkeepers(){
        super();
        this.speed = 0;
        this.endurance = 0;
        this.dexterity = 0;
        this.propulsion = 0;
        this.airgame = 0;
        this.kick = 0;
        this.pass = 0;
        this.elasticity = 0;
    }

    //Pega nos argumentos
    public Goalkeepers(String PlrName, int PlrNumber, int center, int Atc, int Def, int Drb, int speed, int endurance,
                       int dexterity, int propulsion, int airgame, int kick, int pass, int elasticity){
        super(PlrName, PlrNumber, Atc, Def, Drb, speed, endurance, dexterity);
        this.speed = speed;
        this.endurance = endurance;
        this.dexterity = dexterity;
        this.propulsion = propulsion;
        this.airgame = airgame;
        this.kick = kick;
        this.pass = pass;
        this.elasticity = elasticity;
    }

    //criar duas instancias de jogador || Pedro.Goalkeepers(Ze)
    public Goalkeepers(Goalkeepers placeholder){
        super(placeholder);
        this.speed = placeholder.speed;
        this.endurance = placeholder.endurance;
        this.dexterity = placeholder.dexterity;
        this.propulsion = placeholder.propulsion;
        this.airgame = placeholder.airgame;
        this.kick = placeholder.kick;
        this.pass = placeholder.pass;
        this.elasticity = placeholder.elasticity;
    }

    //getters e setters
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
    public int getElasticity(){
        return this.elasticity;
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
    public int setElasticity(){
        return this.elasticity;
    }
}
