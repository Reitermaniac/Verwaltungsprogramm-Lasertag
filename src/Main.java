import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    private static BorderPane root = new BorderPane();

    public static BorderPane getRoot() {
        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("LaserTag Verwaltungsprogramm");
        primaryStage.setScene(new Scene(root));
        primaryStage.setMaximized(true);
        primaryStage.show();

        URL menuLink = getClass().getResource("menu.fxml");
        Pane menu = FXMLLoader.load( menuLink );

        URL paneOneUrl = getClass().getResource("team.fxml");
        SplitPane paneOne = FXMLLoader.load( paneOneUrl );

        root.setLeft(menu);
        root.setCenter(paneOne);

    }

    public static void main(String[] args) {


        launch(args);
    }
}
