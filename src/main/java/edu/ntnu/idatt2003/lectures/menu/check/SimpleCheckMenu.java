/* https://www.tutorialspoint.com/how-to-create-radiomenuitem-in-javafx
 * 
 * */

package edu.ntnu.idatt2003.lectures.menu.check;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleCheckMenu extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("My first stage with scene");
    BorderPane root  = new BorderPane();

    VBox vbox = new VBox();
    MenuBar mainMenu = createMenus();

    vbox.getChildren().add(mainMenu);
    root.setTop(vbox);
    
    Scene scene = new Scene(root, 300, 250);

    primaryStage.setScene(scene);

    primaryStage.show();
  }

  /**
   * Creates the menus to be displayed.
   */
  private MenuBar createMenus() {
    // Create the Menu Bar to hold all the menus
    MenuBar menuBar = new MenuBar();

    // The File-menu
    Menu menu = new Menu("File");
    CheckMenuItem fileOpen = new CheckMenuItem("Open");
    CheckMenuItem filePrint = new CheckMenuItem("Print");
    MenuItem fileExit = new MenuItem("Exit");

    menu.getItems().addAll(fileOpen,filePrint,new SeparatorMenuItem(),fileExit);
    
    // The Edit-menu
    Menu menuEdit = new Menu("Edit");

    // The View-menu
    Menu menuView = new Menu("View");

    menuBar.getMenus().addAll(menu, menuEdit, menuView);

    return menuBar;
  }

}