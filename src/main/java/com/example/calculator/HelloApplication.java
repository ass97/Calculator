package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Scene scene;
    private FlowPane mainPane;
    private HBox txtTop;
    private VBox buttons;


    public void start(Stage window){

        Button btn1 = new Button("1");
        btn1.setPrefSize(50,50);
        Button btn2 = new Button("2");
        btn2.setPrefSize(50,50);
        Button btn3 = new Button("3");
        btn3.setPrefSize(50,50);
        Button btn4 = new Button("4");
        btn4.setPrefSize(50,50);
        Button btn5 = new Button("5");
        btn5.setPrefSize(50,50);
        Button btn6 = new Button("6");
        btn6.setPrefSize(50,50);
        Button btn7 = new Button("7");
        btn7.setPrefSize(50,50);
        Button btn8 = new Button("8");
        btn8.setPrefSize(50,50);
        Button btn9 = new Button("9");
        btn9.setPrefSize(50,50);
        Button btn0 = new Button("0");
        btn0.setPrefSize(50,50);
        Button btnMult = new Button("*");
        btnMult.setPrefSize(50,50);
        Button btnDiv = new Button("/");
        btnDiv.setPrefSize(50,50);
        Button btnDot = new Button(".");
        btnDot.setPrefSize(50,50);
        Button btnMin = new Button("-");
        btnMin.setPrefSize(50,50);
        Button btnPlus = new Button("+");
        btnPlus.setPrefSize(50,50);
        Button btnEqua = new Button("=");
        btnEqua.setPrefSize(50,50);

        FlowPane pane = new FlowPane(400,400);
        TextField text = new TextField();
        text.setPrefSize(200,20);
        VBox box = new VBox();
        HBox zero = new HBox();
        HBox box1 = new HBox();
        HBox box2 = new HBox();
        HBox box3 = new HBox();
        HBox box4 = new HBox();


        pane.getChildren().add(box);
        zero.getChildren().add(text);

        box.getChildren().add(zero);
        box.getChildren().add(box1);
        box.getChildren().add(box2);
        box.getChildren().add(box3);
        box.getChildren().add(box4);


        box1.getChildren().add(btn1);
        box1.getChildren().add(btn2);
        box1.getChildren().add(btn3);
        box1.getChildren().add(btnEqua);


        box2.getChildren().add(btn4);
        box2.getChildren().add(btn5);
        box2.getChildren().add(btn6);
        box2.getChildren().add(btnPlus);

        box3.getChildren().add(btn7);
        box3.getChildren().add(btn8);
        box3.getChildren().add(btn9);
        box3.getChildren().add(btnMult);

        box4.getChildren().add(btn0);
        box4.getChildren().add(btnDot);
        box4.getChildren().add(btnMin);
        box4.getChildren().add(btnDiv);


        scene = new Scene(pane,200,225);
        window.setTitle("ELO");
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch();
    }
}