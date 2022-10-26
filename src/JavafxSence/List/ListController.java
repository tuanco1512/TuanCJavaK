package JavafxSence.List;

import JavafxSence.Student;
import JavafxSence.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ListController {
    public TextField Name;
    public TextField Score;
    public boolean sortName = true;
    public ListView<Student> lv;
    public static ObservableList<Student> ls = FXCollections.observableArrayList();
    public void add(ActionEvent event) throws Exception{
        Parent createForm = FXMLLoader.load(getClass().getResource("../Form/Form.fxml"));
        Scene sc = new Scene(createForm,800,600);
        Main.rootStage.setScene(sc);
    }

    public void edit(ActionEvent actionEvent) {

    }

    public void sortByName(ActionEvent actionEvent) {
    }
}
