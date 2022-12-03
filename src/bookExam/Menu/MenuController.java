package bookExam.Menu;

import javaBookLibary.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.util.Objects;

public class MenuController {
    public void add(ActionEvent actionEvent)throws Exception {
        Parent addBook = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Add/Add.fxml")));
        Scene sc = new Scene(addBook,600,400);
        bookExam.Main.rootStage.setScene(sc);
    }

    public void display(ActionEvent actionEvent)throws Exception{
        Parent displayBook = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Display/Display.fxml")));
        Scene sc = new Scene(displayBook,600,400);
        bookExam.Main.rootStage.setScene(sc);
    }

    public void exit(ActionEvent actionEvent){

    }
}
