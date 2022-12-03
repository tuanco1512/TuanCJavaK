package bookExam.Display;

import javaBookLibary.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class DisplayController {
    public void backToMenu(ActionEvent actionEvent)throws Exception{
        Parent listScene = FXMLLoader.load(getClass().getResource("../Menu/MenuController"));
        Scene sc = new Scene(listScene,600,400);
        bookExam.Main.rootStage.setScene(sc);
    }
}
