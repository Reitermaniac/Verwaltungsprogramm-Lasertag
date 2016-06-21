/**
 * Created by Tobi on 17.05.2016.
 */
public interface SpielerInterface {


     void updateScore(int dH, int rH);
     long getScore();
     float getRatio();
     int getGames();
     String getRole();
     String getStatus();
     Spieler getSpieler();
     void setStatus(String status);
     void setRole(String role);
}
