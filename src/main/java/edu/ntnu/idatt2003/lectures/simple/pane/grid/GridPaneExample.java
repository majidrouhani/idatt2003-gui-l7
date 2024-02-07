package edu.ntnu.idatt2003.lectures.simple.pane.grid;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane rootNode = new GridPane();

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");

        rootNode.add(button1, 0,0);
        rootNode.add(button2, 1,0);
        rootNode.add(button3, 2,0);
        rootNode.add(button4, 1,1);
        rootNode.add(button5, 1,2);

        Scene scene = new Scene(rootNode, 500, 500);
        primaryStage.setTitle("JavaFX Scene");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
