package edu.ntnu.idatt2003.lectures.basic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BorderPaneExample2 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane boorderPane = new BorderPane();

        boorderPane.setBorder(new Border(
                new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");

        BorderPane.setAlignment(button1, Pos.CENTER);
        BorderPane.setAlignment(button2, Pos.CENTER);
        BorderPane.setAlignment(button3, Pos.CENTER);
        BorderPane.setAlignment(button4, Pos.CENTER);
        
        FlowPane flowGroup = new FlowPane();        
        flowGroup.getChildren().add(new Button("Button A"));
        flowGroup.getChildren().add(new Button("Button B"));
        flowGroup.getChildren().add(new Button("Button C"));
        flowGroup.getChildren().add(new Button("Button D"));
        flowGroup.getChildren().add(new Button("Button E"));

        boorderPane.setTop(flowGroup);
        boorderPane.setLeft(button1);
        boorderPane.setRight(button2);
        boorderPane.setBottom(button3);
        boorderPane.setCenter(button4);

        Scene scene = new Scene(boorderPane, 500, 500);
        primaryStage.setTitle("JavaFX Scene");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
