package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class infoController {
    @FXML
    private Button last;

    public void lastt(ActionEvent e) throws IOException {
        FXMLLoader menu = new FXMLLoader(this.getClass().getResource("../view/menu.fxml"));
        menu.load();
        Stage primaryStage = (Stage) last.getScene().getWindow();
        primaryStage.setScene(new Scene(menu.getRoot()));
        primaryStage.show();
    }
}
