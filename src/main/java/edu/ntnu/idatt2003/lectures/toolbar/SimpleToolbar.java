/* Online help: https://openjfx.io/openjfx-docs/#maven
 * Non-modular from IDE
 * Run argument: --module-path "C:\git\javafx\javafx-sdk-11.0.2\lib" --add-modules javafx.controls,javafx.fxml
 */

package edu.ntnu.idatt2003.lectures.toolbar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleToolbar extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws FileNotFoundException {
    primaryStage.setTitle("My first stage with scene");
    BorderPane borderRoot = new BorderPane();

    VBox topContainer = new VBox();
    ToolBar mainToolbar = createToolbars();
    MenuBar mainMenu = createMenus();

    topContainer.getChildren().add(mainToolbar);
    topContainer.getChildren().add(mainMenu);
    borderRoot.setTop(topContainer);
    Scene scene = new Scene(borderRoot, 300, 250);

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
    menu.getItems().addAll(fileOpen);
    menu.getItems().addAll(filePrint);
    menu.getItems().add(new SeparatorMenuItem());
    menu.getItems().add(fileExit);

    // The Edit-menu
    Menu menuEdit = new Menu("Edit");

    // The View-menu
    Menu menuView = new Menu("View");

    menuBar.getMenus().addAll(menu, menuEdit, menuView);

    return menuBar;
  }

  /**
   * Creates the menus to be displayed.
   * 
   * @throws FileNotFoundException
   */
  private ToolBar createToolbars() throws FileNotFoundException {
    // Create the Tool Bar to hold all toolbars
    ToolBar toolBar = new ToolBar();

    // Save
    Image saveImg = new Image(new FileInputStream(getClass().getClassLoader().getResource("icon/save.jpg").getFile()),16,16,true,true);
    Button btn = new Button("Save", new ImageView(saveImg));
    
    btn.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        System.out.println("Hello World!");
      }
    });

    toolBar.getItems().addAll(btn);
    return toolBar;
  }
}