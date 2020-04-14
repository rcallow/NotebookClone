package rjc;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;


public class FileManager
{
    private static Stage stageLocal;
    private static FileChooser fileChooser;
    private static FileChooser.ExtensionFilter extensionFilter;
    private static File file;

    public static void FileManager(Stage stage){
        stageLocal = stage;
        fileChooser = new FileChooser();
        extensionFilter = new FileChooser.ExtensionFilter("Text files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extensionFilter);
        file = null;
    }

    public static String fileOpenDialog() throws IOException {
        // Check if existing file needs saving
        String text = "";
        file = fileChooser.showOpenDialog(stageLocal);
        if (file != null){
            text = Files.readString(file.toPath());
            System.out.println(file.toPath());
        }
        return text;

    }

    public static void fileSaveAsDialog(CharSequence text) throws IOException {
        file = fileChooser.showSaveDialog(stageLocal);
        if (file != null){
            Files.writeString(file.toPath(), text);
        }
    }
}




