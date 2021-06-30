package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import objecten.*;
import database.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.ArrayList;


public class addreceptController {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private VBox box;

    @FXML
    private ScrollPane scrolpane;


    @FXML
    private Label Plus;

    @FXML
    private TextField name;

    @FXML
    private TextField aantal;

    @FXML
    private TextField price;

    @FXML
    private Button back;

    @FXML
    private Button addrecept;

    @FXML
    private CheckBox openbaar;

    @FXML
    private TextField namerecept;

    @FXML
    private TextArea bereiding;

    private ArrayList<addIngredient> ingredients = new ArrayList<addIngredient>();
    private int ide = 1;

    @FXML
    void addrecept(ActionEvent event) throws IOException {
        recept Recept = addIngredienten(new recept(bereiding.getText(), namerecept.getText(), openbaar.isSelected()));
        receptbase.addKookboek(Recept);
        backtohomeScreen();
    }

    private recept addIngredienten(recept unrecept){
        for (addIngredient uningredient: ingredients)
        {
            unrecept.getIngredienten().add(uningredient.getIngredient());
        }
        return unrecept;
    }

    @FXML
    void back(ActionEvent event) throws IOException {
        backtohomeScreen();
    }

    private void backtohomeScreen()throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/homeScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @FXML
    void plusIngredient(MouseEvent event) {
        addIngredient uningredient = new addIngredient(ide);
        box.getChildren().add(uningredient.getpane());
        ingredients.add(uningredient);

        ide++;
            }

            class addIngredient{
                    private Pane pane;
                    private TextField name, price, aantal, ide;

                public addIngredient(int ide) {
                    pane = new Pane();
                    name = textfieldmaker(5,"name");
                    aantal = textfieldmaker(170, "Aantal");
                    price = textfieldmaker(260, "price");
                    this.ide =  textfieldmaker(0, String.valueOf(ide)+".");
                    rootPane.getChildren().addAll(name, aantal, price);
                }

                private TextField textfieldmaker(int x, String text){
                    TextField textField = new TextField();
                    textField.setPromptText(text);
                    textField.setLayoutX(x);
                    return textField;
                }

                public ingredient getIngredient(){
                    return new ingredient(name.getText(), Double.parseDouble(aantal.getText()), Double.parseDouble(price.getText()));
                }

                public Pane getpane() {
                    return pane;
                }
            }


}
