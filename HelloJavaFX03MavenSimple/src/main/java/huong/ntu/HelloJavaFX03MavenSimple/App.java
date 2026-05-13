package huong.ntu.HelloJavaFX03MavenSimple;

import java.awt.Button;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    public void start(Stage primaryStage) {
    	 
	    Button btn = new Button();
         btn.setLabel("Say 'Hello World'");

         StackPane root = new StackPane();
         root.getChildren().add(btn);

         Scene scene = new Scene(root, 300, 250);

         primaryStage.setTitle("Hello World!");
         primaryStage.setScene(scene);
         primaryStage.show();
     }

    public static void main(String[] args) {
        launch();
    }

}