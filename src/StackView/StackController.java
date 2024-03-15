package StackView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import java.net.URL;
import java.util.ResourceBundle;

public class StackController implements Initializable {

    public Button openTableWindow;
    @FXML
    private Button mainButton;
    @FXML
    private Label title;
    @FXML
    private StackPane editPane;
    private final  String initialTitle = "Main Layout";
    private final String changedTitle = "Changed from the change Title button";

    @FXML
    private void changeTitle(ActionEvent event) {
        if(this.title.getText().equals(initialTitle)){
            this.title.setText(changedTitle);
        } else if(this.title.getText().equals(changedTitle)){
      this.title.setText(initialTitle);
        }




      this.openTableWindow.setOnAction(this::setOpenEditWindow);
    }



    private void setOpenEditWindow(ActionEvent event){
        this.editPane.setVisible(true);
    }

    @FXML
    private void closeWindow(ActionEvent event) {
      this.editPane.setVisible(false);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.title.setText(initialTitle);
         this.mainButton.setText("Change title");
         this.editPane.setVisible(false);
        this.openTableWindow.setText("OpenTable");
    }
}
