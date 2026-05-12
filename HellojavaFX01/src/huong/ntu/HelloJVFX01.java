package huong.ntu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloJVFX01 extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Xin chào JavaFX");

        Scene scene = new Scene(label, 400, 200);

        stage.setTitle("JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}