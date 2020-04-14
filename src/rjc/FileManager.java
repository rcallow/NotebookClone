package rjc;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URI;



public class FileManager
{
    private static Stage stageLocal;

    public static void FileManager(Stage stage){
        stageLocal = stage;
    }

    public static void fileOpenDialog() throws IOException {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Text files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);

        fileChooser.showOpenDialog(stageLocal);
        }
    }


