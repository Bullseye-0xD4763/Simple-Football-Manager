public class GameStart {
    
    public Defenders d1, d2, d3, d4, d5, d6, d7, d8;
    public Midfielders m1, m2, m3, m4, m5, m6, m7, m8;
    public Goalkeepers g1, g2;
    public Forwards f1, f2, f3, f4;
  
    public int team1goal = 0;
    public int team2goal = 0;
    public int time = 0;
    
    public MatchEngine(Goalkeeper g1, Defender d1, Defender d2, Defender d3, Defender d4, Midfielder m1, Midfielder m2, Midfielder m3, Midfielder m4, Forwards f1, Forwards f2,Goalkeeper g2, Defender d5, Defender d6, Defender d7, Defender d8, Midfielder m5, Midfielder m6, Midfielder m7, Midfielder m8, Forwards f3, Forwards f4){
        //Team 1
        this.g1=g1;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        this.d4=d4;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
        this.f1=f1;
        this.f2=f2;
        //Team 2
        this.g2=g2;
        this.d5=d5;
        this.d6=d6;
        this.d7=d7;
        this.d8=d8;
        this.m5=m5;
        this.m6=m6;
        this.m7=m7;
        this.m8=m8;
        this.f3=f3;
        this.f4=f4;
    }
  
  public int getTeam1goal (){
    return team1goal;
  }
  
  public int setTeam1goal(int team1goal){
    this.team1goal = team1goal;
  }
public int getTeam2goal (){
    return team2goal;
  }
  
  public int setTeam2goal(int team2goal){
    this.team2goal = team2goal;
  }
  public int getTime (){
    return time;
  }
  
  public int setTime(int time){
    this.time = time;
  }
 }
