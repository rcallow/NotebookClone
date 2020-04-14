package rjc;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URI;



public class FileManager
{
    private static Stage stageLocal;
    private static FileChooser fileChooser;
    private static FileChooser.ExtensionFilter extensionFilter;

    public static void FileManager(Stage stage){
        stageLocal = stage;
        fileChooser = new FileChooser();
        extensionFilter = new FileChooser.ExtensionFilter("Text files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extensionFilter);
    }

    public static void fileOpenDialog(){
        fileChooser.showOpenDialog(stageLocal);
    }

    public static void fileSaveAsDialog(){}
}




