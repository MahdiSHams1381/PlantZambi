import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private Button Login;
    @FXML private TextField userName ;
    @FXML private TextField Password ;
    Main main = new Main();

    public void Log(ActionEvent e) throws IOException {
        if (main.bTestPerson(userName.getText(), Password.getText()) == true){
            FXMLLoader menu = new FXMLLoader(this.getClass().getResource("view/menu.fxml"));
            menu.load() ;
            Stage primaryStage = (Stage) Login.getScene().getWindow() ;
            primaryStage.setScene(new Scene(menu.getRoot()));
            primaryStage.show();
        }else {
            System.out.println("sssssss");
        }
    }
}
