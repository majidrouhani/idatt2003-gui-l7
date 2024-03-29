/* Online help: https://openjfx.io/openjfx-docs/#maven
 * Non-modular from IDE
 * Run argument: --module-path "C:\git\javafx\javafx-sdk-11.0.2\lib" --add-modules javafx.controls,javafx.fxml
 */

package edu.ntnu.idatt2003.lectures.basic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class SimpleExampleButton extends Application {

	public static void main(String[] args) {
        launch(args);
    } 
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("My first stage with scene");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}	