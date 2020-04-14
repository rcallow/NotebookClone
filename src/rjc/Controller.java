package rjc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class Controller {
    @FXML private TextArea textArea;

    @FXML protected void handleNewButtonAction(ActionEvent event) {textArea.setText("");}
    @FXML protected void handleOpenButtonAction(ActionEvent event) throws IOException {FileManager.fileOpenDialog();}
    @FXML protected void handleSaveButtonAction(ActionEvent event) {}
    @FXML protected void handleSaveAsButtonAction(ActionEvent event) {}
    @FXML protected void handlePageSetupButtonAction(ActionEvent event) {}
    @FXML protected void handlePrintButtonAction(ActionEvent event) {}
    @FXML protected void handleExitButtonAction(ActionEvent event) {}

    @FXML protected void handleUndoButtonAction(ActionEvent event) {}
    @FXML protected void handleCutButtonAction(ActionEvent event) {}
    @FXML protected void handleCopyButtonAction(ActionEvent event) {}
    @FXML protected void handlePasteButtonAction(ActionEvent event) {}
}