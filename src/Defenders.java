public class Defenders extends Players {
    public int speed;
    public int endurance;
    public int dexterity;
    public int propulsion;
    public int airgame;
    public int kick;
    public int pass;
    public int tackle;//extra stat
    public int center;

    //construtor de criar as variaveis vazias
    public Defenders() {
        super();
        this.speed = 0;
        this.endurance = 0;
        this.dexterity = 0;
        this.propulsion = 0;
        this.airgame = 0;
        this.kick = 0;
        this.pass = 0;
        this.tackle = 0;
    }

    //Pega nos argumentos
    public Defenders(String PlrName, int PlrNumber, int Atc, int Def, int Drb, int speed, int dexterity, int dribble) {
        super(PlrName, PlrNumber, Atc, Def, Drb, speed, dexterity, dribble);
        this.speed = speed;
        this.endurance = endurance;
        this.dexterity = dexterity;
        this.propulsion = propulsion;
        this.airgame = airgame;
        this.kick = kick;
        this.pass = pass;
        this.tackle = tackle;
    }

    //criar duas instancias de jogador || Pedro.Defenders(Ze)
    public Defenders(Defenders placeholder) {
        super(placeholder);
        this.speed = placeholder.speed;
        this.endurance = placeholder.endurance;
        this.dexterity = placeholder.dexterity;
        this.propulsion = placeholder.propulsion;
        this.airgame = placeholder.airgame;
        this.kick = placeholder.kick;
        this.pass = placeholder.pass;
        this.tackle = placeholder.tackle;
    }

    //getters
    public int getSpeed() {
        return this.speed;
    }
    public int getEndurance() {
        return this.endurance;
    }
    public int getDexterity() {
        return this.dexterity;
    }
    public int getPropulsion() {
        return this.propulsion;
    }
    public int getAirgame() {
        return this.airgame;
    }
    public int getKick() {
        return this.kick;
    }
    public int getPass() {
        return this.pass;
    }
    public int getTackle() {
        return this.tackle;
    }

    //setters
    public void setSpeed() {
        this.speed = speed;
    }
    public void setEndurance() {
        this.endurance = endurance;
    }
    public void setDexterity() {
        this.dexterity = dexterity;
    }
    public void setPropulsion() {
        this.propulsion = propulsion;
    }
    public void setAirgame() {
        this.airgame = airgame;
    }
    public void setKick() {
        this.kick = airgame;
    }
    public void setPass() {
        this.pass = pass;
    }
    public void setTackle() {
        this.tackle = tackle;
    }
}




