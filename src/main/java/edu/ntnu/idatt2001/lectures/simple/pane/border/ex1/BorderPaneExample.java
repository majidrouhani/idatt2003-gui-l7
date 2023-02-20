package edu.ntnu.idatt2001.lectures.simple.pane.border.ex1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane rootNode = new BorderPane();

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");

        BorderPane.setAlignment(button1, Pos.CENTER);
        BorderPane.setAlignment(button2, Pos.CENTER);
        BorderPane.setAlignment(button3, Pos.CENTER);
        BorderPane.setAlignment(button4, Pos.CENTER);

        rootNode.setTop(button1);
        rootNode.setLeft(button2);
        rootNode.setRight(button3);
        rootNode.setBottom(button4);
        rootNode.setCenter(button5);

        Scene scene = new Scene(rootNode, 500, 500);
        primaryStage.setTitle("JavaFX Scene");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
