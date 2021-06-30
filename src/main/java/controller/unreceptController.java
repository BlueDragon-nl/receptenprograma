package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import objecten.*;

public class unreceptController implements Initializable {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private ScrollPane scrol;

    @FXML
    private VBox vbox;

    @FXML
    private Text descript;

    @FXML
    private Label recept_name;

    @FXML
    private Button back;

    @FXML
    private Label plus;

    @FXML
    private Label min;

    @FXML
    private Label aantal;


    @FXML
    private Label price;

    private ArrayList<makeIngredient> makeIngredientArrayList = new ArrayList<makeIngredient>();


    @FXML
    void back(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/addreceptScreen.fxml"));
        rootPane.getChildren().setAll(pane);

    }

    @FXML
    void min(MouseEvent event) {
        if (Double.parseDouble(aantal.getText()) - 1 > 0) {
            for (makeIngredient A:makeIngredientArrayList
            ) {
                A.min();

            }
            aantal.setText(String.valueOf(Integer.parseInt(aantal.getText()) - 1));
            price.setText("€ " + Double.parseDouble( aantal.getText()) * observer.getRecept().getPrice());

        }

    }

    @FXML
    void plus(MouseEvent event) {
        for (makeIngredient A:makeIngredientArrayList
             ) {
            A.plus();

        }
        aantal.setText(String.valueOf((Integer.parseInt(aantal.getText()) + 1)));
        price.setText("€ " + Double.parseDouble( aantal.getText()) * observer.getRecept().getPrice());

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addingredient(observer.getRecept().getIngredienten());
        descript.setText(observer.getRecept().getBereiding());
        recept_name.setText(observer.getRecept().getName());
        price.setText("€ " + observer.getRecept().getPrice());
    }


    private void addingredient(ArrayList<ingredient> ingredients) {
        for (ingredient Ingredient : ingredients) {
            makeIngredient i = new makeIngredient(Ingredient);
            makeIngredientArrayList.add(i);
            vbox.getChildren().add(i.getPane());
        }

    }
    class makeIngredient {
        private Pane pane;
        private Label name, price, aantal;
        private double priceCounter;
        private double aantalCounter;
        private ingredient Ingredient;

        public makeIngredient(ingredient ingredient) {
            Ingredient = ingredient;
            addcomponets();
        }

        private void addcomponets() {
            pane = new Pane();
            name = Labelmaker(0, Ingredient.getName());

            priceCounter = Ingredient.getPrice();
            aantalCounter =Ingredient.getAantal();

            price = Labelmaker(358, "€ " + String.valueOf(priceCounter));
            aantal = Labelmaker(150,  String.valueOf(aantalCounter));

            pane.getChildren().addAll(name, price, aantal);
        }

        private void update_label(){
            price.setText(String.valueOf(priceCounter));
            aantal.setText(String.valueOf(aantalCounter));
        }

        private Label Labelmaker(int x, String text) {
            Label label = new Label(text);
            label.setLayoutX(x);
            return label;
        }

        public void plus() {
            priceCounter += Ingredient.getPrice();
            aantalCounter +=Ingredient.getAantal();
            update_label();
        }

        public void min() {
            priceCounter -= Ingredient.getPrice();
            aantalCounter -=Ingredient.getAantal();
            update_label();
        }

        public Pane getPane() {
            return pane;
        }
    }
}
