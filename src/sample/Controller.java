package sample;

import com.sun.rowset.internal.Row;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private javafx.scene.control.TextField TextField;

    @FXML
    private javafx.scene.control.TextArea TextArea;


    @FXML
    public void clickBtnSend(ActionEvent actionEvent) {
        TextArea.appendText(TextField.getText() + "\n");
        TextField.clear();
        TextField.requestFocus();

    }

    @FXML
    public void clickBtnSmile(ActionEvent actionEvent) {
        TextArea.appendText("٩(◕‿◕)۶\n");
    }
    @FXML
    public void clickBtnSmileSad(ActionEvent actionEvent) {
        TextArea.appendText("｡ﾟ･ (>﹏<) ･ﾟ｡\n");
    }
}
