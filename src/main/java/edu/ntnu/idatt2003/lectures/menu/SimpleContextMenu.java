/* https://docs.oracle.com/javase/8/javafx/user-interface-tutorial/menu_controls.htm
 * Online help: https://openjfx.io/openjfx-docs/#maven
 * Non-modular from IDE
 * Run argument: --module-path "C:\git\javafx\javafx-sdk-11.0.2\lib" --add-modules javafx.controls,javafx.fxml
 * 
 */

package edu.ntnu.idatt2003.lectures.menu;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SimpleContextMenu extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("My first stage with scene");
    BorderPane root = new BorderPane();

    Text text = new Text("Hellow World!");
    root.setCenter(text);

    VBox vbox = new VBox();
    MenuBar mainMenu = createMenus();

    vbox.getChildren().add(mainMenu);
    root.setTop(vbox);

    MenuItem copy = new MenuItem("Copy");
    copy.setOnAction((ActionEvent e) -> {
      Clipboard clipboard = Clipboard.getSystemClipboard();
      ClipboardContent content = new ClipboardContent();
      content.putString(text.getText());
      clipboard.setContent(content);
    });

    final ContextMenu cm = new ContextMenu();
    cm.getItems().add(copy);
    text.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
      if (e.getButton() == MouseButton.SECONDARY)
        cm.show(text, e.getScreenX(), e.getScreenY());
    });

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
    MenuItem fileOpen = new MenuItem("Open");
    MenuItem filePrint = new MenuItem("Print");
    MenuItem fileExit = new MenuItem("Exit");

    menu.getItems().add(fileOpen);
    menu.getItems().add(filePrint);
    menu.getItems().add(new SeparatorMenuItem());
    menu.getItems().add(fileExit);

    // The Edit-menu
    Menu menuEdit = new Menu("Edit");

    // The View-menu
    Menu menuView = new Menu("View");

    menuBar.getMenus().addAll(menu, menuEdit, menuView);

    return menuBar;
  }

}