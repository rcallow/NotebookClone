package rjc;

import javafx.print.PrinterJob;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.awt.Desktop;


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

    public static void fileSaveAsDialog() throws IOException {
        file = fileChooser.showSaveDialog(stageLocal);
    }

    public static void fileSave(CharSequence text) throws IOException {
        if (file != null){
            Files.writeString(file.toPath(), text);
        }
    }

    public static void printer(TextArea textArea){
        System.out.print(textArea.getText());
        PrinterJob printerJob = PrinterJob.createPrinterJob();
        boolean printable = printerJob.showPrintDialog(stageLocal);
        if (printable){
            boolean printed = printerJob.printPage(textArea);
            if(printed){
                printerJob.endJob();
            }
        }
    }
}




