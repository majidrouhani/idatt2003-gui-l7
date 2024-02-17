package edu.ntnu.idatt2003.lectures.basic;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane rootNode = new FlowPane();
        
        rootNode.getChildren().add(new Button("Button 1"));
        rootNode.getChildren().add(new Button("Button 2"));
        rootNode.getChildren().add(new Button("Button 3"));
        rootNode.getChildren().add(new Button("Button 4"));
        rootNode.getChildren().add(new Button("Button 5"));

        Scene scene = new Scene(rootNode, 500, 500);
        primaryStage.setTitle("JavaFX Scene");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }    
}
