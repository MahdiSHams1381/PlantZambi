package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Person;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class menuController {
    @FXML
    private Button game;
    @FXML
    private Button info;
    @FXML
    private Button gift;
    @FXML
    private Button help;
    public void gamee(ActionEvent e) throws IOException {
        FXMLLoader menu = new FXMLLoader(this.getClass().getResource("../view/gift.fxml"));
        menu.load() ;
        Stage primaryStage = (Stage) gift.getScene().getWindow() ;
        primaryStage.setScene(new Scene(menu.getRoot()));
        primaryStage.show();
    }
    public void infoo(ActionEvent e) throws IOException {
        FXMLLoader menu = new FXMLLoader(this.getClass().getResource("../view/info.fxml"));
        menu.load() ;
        Stage primaryStage = (Stage) info.getScene().getWindow() ;
        primaryStage.setScene(new Scene(menu.getRoot()));
        primaryStage.show();
    }
    public void giftt(ActionEvent e) throws IOException {
        FXMLLoader menu = new FXMLLoader(this.getClass().getResource("../view/gift.fxml"));
        menu.load() ;
        Stage primaryStage = (Stage) gift.getScene().getWindow() ;
        primaryStage.setScene(new Scene(menu.getRoot()));
        primaryStage.show();
    }
    public void helpp(ActionEvent e) throws IOException {
        FXMLLoader menu = new FXMLLoader(this.getClass().getResource("../view/help.fxml"));
        menu.load() ;
        Stage primaryStage = (Stage) help.getScene().getWindow() ;
        primaryStage.setScene(new Scene(menu.getRoot()));
        primaryStage.show();
    }
}
