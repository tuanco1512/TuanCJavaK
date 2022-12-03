package bookExam.Add;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.net.URL;
import java.util.ResourceBundle;

public class AddController implements Initializable {
    public void backToMenu(ActionEvent actionEvent)throws Exception{
        Parent listScene = FXMLLoader.load(getClass().getResource("../Menu/MenuController"));
        Scene sc = new Scene(listScene,600,400);
        bookExam.Main.rootStage.setScene(sc);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
