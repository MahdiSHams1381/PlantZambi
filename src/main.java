import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       FXMLLoader login = new FXMLLoader(this.getClass().getResource("view/Login.fxml"));
       login.load() ;
        primaryStage.setScene(new Scene(login.getRoot()));
        primaryStage.show();
    }
}
