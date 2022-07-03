import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;
import model.dataBase;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    model.dataBase dataBase = new dataBase();

    public Boolean bTestPerson(String name, String pass) {
        for (int q = 0; q < dataBase.users.size(); q++) {

            if (dataBase.users.get(q).getUserName().equals(name) && dataBase.users.get(q).getPassword().equals(pass)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader menu = new FXMLLoader(this.getClass().getResource("view/login.fxml"));
        menu.load();
        primaryStage.setScene(new Scene(menu.getRoot()));
        primaryStage.show();
    }
}
