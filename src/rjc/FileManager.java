package rjc;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URI;



public class FileManager
{
    private static Stage stage2;

    public static void FileManager(Stage stage){
        stage2 = stage;
    }

    public static void fileOpenDialog() throws IOException {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Text files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);

        fileChooser.showOpenDialog(stage2);
        }
    }


