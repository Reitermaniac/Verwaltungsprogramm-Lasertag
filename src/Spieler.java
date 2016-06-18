import java.util.Scanner;

/**
 * Created by Tobi on 12.05.2016.
 */
public class Spieler implements SpielerInterface, Sortable{

        public String name;
        public int age;
        public String nickName;
        public Team team;
        public int gameCounter = 0;
        public String role;
        public String status;
        public long score;
        public int hits;
        public int hitsBy;
        public float ratio;
        public Spieler spieler;


    //Constructor
    public void Spieler(String name, int age, String nickName, Team team, String role, String status){
        this.name = name;
        this.age = age;
        this.nickName = nickName;
        this.team = team;
        this.role = role;
        this.status = status;
    }

    public void addSpieler() {
        Spieler spieler = new Spieler();
        Scanner scanner = new Scanner(System.in);
        spieler.name = scanner.nextLine();
    }

    public void updateScore(int H, int HB){    //Hits, HitsBy
        score = H * 5 - HB * 3;
        this.hits = hits + H;        //dealtHits are Hits overall, not just one game
        this.hitsBy = hitsBy + HB;  //same for receivedHits
        ratio = (float) this.hits / this.hitsBy;  //calculates new ratio
        gameCounter ++;
    }

    public long getScore(){return score;}
    public float getRatio(){return ratio;}
    public int getGames() {return gameCounter;}
    public String getRole() {return role;}
    public String getStatus(){return status;}
    public Spieler getSpieler(){return this.spieler;}
    public void setStatus(String status){this.status = status;}
    public void setRole(String role){this.role = role;}

}
