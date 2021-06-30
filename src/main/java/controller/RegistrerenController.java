package controller;

import database.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;


import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class RegistrerenController implements Initializable {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Button RegisterButton;

    @FXML
    private TextField Username;

    @FXML
    private Button Login;

    @FXML
    private TextField firstName;


    @FXML
    private TextField Birthday;

    @FXML
    private TextField Email;

    @FXML
    private Label passworderror;

    @FXML
    private PasswordField Password;

    @FXML
    private PasswordField Password2;

    @FXML
    private Label errortekst;

    @FXML
    private TextField lastname;

    @FXML
    private Text description;

    @FXML
    private DatePicker datum;

    @FXML
    void Login(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/LoginScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @FXML
    void Register(ActionEvent event) throws IOException {
        if (Password.getText().equals(Password2.getText())) {
            System.out.println("1");
            if (userbase.create(Username.getText(), firstName.getText(), lastname.getText(), Password.getText(), Email.getText(), datum.getValue())){
                System.out.println("2");
                observer.setIngelogtuser(userbase.searchonUsername(Username.getText()));
                    AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/homeScreen.fxml"));
                    rootPane.getChildren().setAll(pane);
            }



        } else {
            passworderror.setText("password not the same");
        }
    }


    @FXML
    void login(MouseEvent event) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        description.setText("");
    }
}
















