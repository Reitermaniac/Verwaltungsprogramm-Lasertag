/**
 * Created by Thomas Laptop on 13.05.2016.
 */
interface InterfaceTeam {

    //Methoden
    double sumScore(Spieler spieler);
    int gamesPlayed(Team team);
    String toString();
    void teamImage();

    //Getter
    String getTeamName();
    int getTeamScore();
    int getGameCounter();

    //Setter
    void setTeamName(String teamName);
}

