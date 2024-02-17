/* Online help: https://openjfx.io/openjfx-docs/#maven
 * Non-modular from IDE
 */

package edu.ntnu.idatt2003.lectures.basic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * This class represents a simple example of a JavaFX application that displays a text on a stage.
 */
public class SimpleExampleText extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("My first stage with scene");

    Text text = new Text("Hellow World!");
    text.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

    StackPane root = new StackPane();
    root.getChildren().add(text);

    primaryStage.setScene(new Scene(root, 300, 250));
    primaryStage.show();
  }

}