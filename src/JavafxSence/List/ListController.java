package JavafxSence.List;

import JavafxSence.Student;
import JavafxSence.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.Collections;
import java.util.Comparator;

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
    @FXML
    protected void initialize(){
        lv.setItems(ls);
    }

    public void edit(ActionEvent actionEvent) {

    }

    public void sortByName(ActionEvent actionEvent) {
        Collections.sort(ls, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return sortName?o1.getName().compareTo(o2.getName()):o2.getName().compareTo(o1.getName());
            }
        });
        sortName = !sortName;
        lv.refresh();
    }
}
