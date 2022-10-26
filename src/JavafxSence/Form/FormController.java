package JavafxSence.Form;


import JavafxSence.Main;
import JavafxSence.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.awt.*;

public class FormController {
    public TextField Name;
    public TextField Score;
    public ListView<Student> lv;

    public static ObservableList<Student> ls = FXCollections.observableArrayList();

    public void backToList(ActionEvent actionEvent) throws Exception {
        Parent listScene = FXMLLoader.load(getClass().getResource("../list/list.fxml"));
        Scene sc = new Scene(listScene,800,600);
        Main.rootStage.setScene(sc);
    }

    public void submit(ActionEvent actionEvent) throws Exception {
        try {
            String name = Name.getText();
            Integer score = Integer.parseInt(Score.getText());
            if(score < 0 || score > 10)
                throw new Exception("Vui long nhap diem trong khoang tu 0 -> 10");
            ls.add(new JavafxSence.Student(name,score));
            lv.setItems(ls);
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
        backToList(null);
    }
}
