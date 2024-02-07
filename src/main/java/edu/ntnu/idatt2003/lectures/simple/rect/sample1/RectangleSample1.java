//https://www.tutorialspoint.com/explain-javafx-scene-graph
package edu.ntnu.idatt2003.lectures.simple.rect.sample1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RectangleSample1 extends Application {
    @Override
    public void start(Stage stage) {
        Group group = new Group();
        Scene scene = new Scene(group, 500, 500);
        stage.setTitle("JavaFX Scene Graph Demo");
        stage.setScene(scene);
        stage.show();
    }
  
    public static void main(String[] args) {
        launch(args);
    }
 }