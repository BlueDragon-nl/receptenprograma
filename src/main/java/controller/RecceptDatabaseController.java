package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import objecten.*;
import database.*;


public class RecceptDatabaseController implements Initializable {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private ScrollPane scrol;

    @FXML
    private VBox box;

    @FXML
    private Button back;

    @FXML
    private Button addreccept;

    @FXML
    void addreccept(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/addreceptScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @FXML
    void back(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/HomeScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addRecept(receptbase.getKookboek());
        addRecept(observer.getIngelogtuser().getYourRecept());
    }


    private void addRecept(ArrayList<recept> recepts){
        for (recept unRecept: recepts){
            receptitem i = new receptitem(unRecept);
            box.getChildren().add(i.getPane());
        }
    }
    class receptitem{
        private recept Recept;

        private Pane pane;
        private Label name, gotoreccept, price;


        public receptitem(recept recept) {
            Recept = recept;

            try {
                addcomponets();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        private void addcomponets()throws IOException{
            pane = new Pane();
            name  = Labelmaker(0, Recept.getName());
            price = Labelmaker(558,  "€ "+ String.valueOf(Recept.getPrice()));
            gotoreccept = Labelmaker(380, "go to reccept");

                gotoreccept.setOnMouseClicked((mouseEvent) -> {
                    try {
                        gotorecept();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                pane.getChildren().addAll(name, gotoreccept, price);
        }
        private Label Labelmaker(int x, String text){
            Label label = new Label(text);
            label.setLayoutX(x);
            return label;
        }
        private void gotorecept()throws IOException {
            observer.setRecept(Recept);
                AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/receptScreen.fxml"));
                rootPane.getChildren().setAll(pane);

        }

        public Pane getPane() {
            return pane;
        }
    }
}


