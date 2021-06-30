package controller;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import database.*;

import java.io.IOException;

public class LoginController{

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField passwordPasswordField;

    @FXML
    private TextField usernameTextField;

    @FXML
    private Button registrenButton;

    @FXML
    private Label error_labbel;


    @FXML
    void login(MouseEvent event) throws IOException {
        String username = usernameTextField.getText();
        String pasword = passwordPasswordField.getText();
        //if statement
        try {
            if (username.equals("next")){
                AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/HomeScreen.fxml"));
                rootPane.getChildren().setAll(pane);
            }
            if ((userbase.searchonUsername(username).login(pasword))) {
                observer.setIngelogtuser(userbase.searchonUsername(username));
                AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/HomeScreen.fxml"));
                rootPane.getChildren().setAll(pane);
            }
            else {
                error_labbel.setText("password or username is wrong");
            }
        }catch (Exception e){
            error_labbel.setText("username is wrong");
        }

    }

    @FXML
    void registren(MouseEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/registrerenScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

}



