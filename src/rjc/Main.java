package rjc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Notebook Clone");
        Parent root = FXMLLoader.load(getClass().getResource("notebook.fxml"));

        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        scene.getStylesheets().add(Main.class.getResource("Main.css").toExternalForm());

        stage.show();
    }


}
