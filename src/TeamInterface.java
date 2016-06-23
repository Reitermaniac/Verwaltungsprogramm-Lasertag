import javafx.scene.image.ImageView;

import java.awt.*;

/**
 * Created by Thomas Laptop on 13.05.2016.
 */

/**
 * @author Thomas
 */
interface TeamInterface {

    //Methoden
    int sumScore();
    //void addTeam();
    void removeTeam(Team team);
    void addToTeam(Spieler spieler);
    void removeFromTeam(Spieler spieler, Team team);
    int gamesPlayed(Team team);
    String toString();

    //Getter
    String getTeamName();
    int getTeamScore();
    int getGameCounter();
    int getTeamMember();
    Team getTeam();
    int getTeamCounter();

    //Setter
    void setTeamName(String teamName);
    void setTeam(Team team);
}
