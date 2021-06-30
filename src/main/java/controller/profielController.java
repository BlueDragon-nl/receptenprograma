package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class profielController {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Label name;

    @FXML
    private Label years;

    @FXML
    private Label years_month_day;

    @FXML
    private Label badges;

    @FXML
    private ImageView picture;

    @FXML
    private Label titelscreen;

    @FXML
    private Button back;

    @FXML
    private Button change;

    @FXML
    void back(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/homeScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @FXML
    void change(ActionEvent event) {

    }

}
