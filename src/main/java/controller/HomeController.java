package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;


public class HomeController {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Button Logout;

    @FXML
    private Button receptenbase;

    @FXML
    private Button addrecept;

    @FXML
    void Logout(ActionEvent event) throws IOException {
        observer.setIngelogtuser(null);
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/registrerenScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @FXML
    void addrecept(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/addreceptScreen.fxml"));
        rootPane.getChildren().setAll(pane);

    }

    @FXML
    void back(MouseEvent event) {

    }

    @FXML
    void receptenbase(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/Databaserecept.fxml"));
        rootPane.getChildren().setAll(pane);

    }

}


