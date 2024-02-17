/* Online help: https://openjfx.io/openjfx-docs/#maven
 * Non-modular from IDE
 */

package edu.ntnu.idatt2003.lectures.basic;

import javafx.application.Application;
import javafx.stage.Stage;
 
public class SimpleExampleStage extends Application {

	public static void main(String[] args) {
        launch(args);
    } 
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("My first stage!");
        primaryStage.show();
    }
}	