package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.awt.*;

import static java.awt.Color.*;

public class Controller {
    public Label helloWorld;


    public void Submit(ActionEvent actionEvent) {
        helloWorld.setText("Hello World!");
        helloWorld.setStyle("-fx-background-color: pink");
    }
}
