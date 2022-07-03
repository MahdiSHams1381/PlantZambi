package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class giftController {
    @FXML
    private Button last;
    @FXML
    private Button enter;
    @FXML
    private Label number;

    public void lastt(ActionEvent e) throws IOException {
        FXMLLoader menu = new FXMLLoader(this.getClass().getResource("../view/menu.fxml"));
        menu.load();
        Stage primaryStage = (Stage) last.getScene().getWindow();
        primaryStage.setScene(new Scene(menu.getRoot()));
        primaryStage.show();
    }

    public void enterr(ActionEvent e) throws IOException {
        number.setText("nothing");
    }
}
