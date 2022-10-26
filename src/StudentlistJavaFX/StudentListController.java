package StudentlistJavaFX;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.*;

public class StudentListController {
    public TextField Name;
    public TextField Email;
    public TextField Score;
    public boolean sortName = true;
    public ListView<Student> lvS;
    private ObservableList<Student> ls = FXCollections.observableArrayList();

    public void submit(javafx.event.ActionEvent actionEvent){
        try {
            String name = Name.getText();
            String email = Email.getText();
            Integer score = Integer.parseInt(Score.getText());
            if(score < 0 || score > 10)
                throw new Exception("Vui long nhap diem trong khoang tu 0 -> 10");
            ls.add(new Student(name,email,score));
            lvS.setItems(ls);
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }

     }

    public void sortByName(ActionEvent event) {
        Collections.sort(ls, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return sortName?o1.getName().compareTo(o2.getName()):o2.getName().compareTo(o1.getName());
            }
        });
        sortName = !sortName;
        lvS.refresh();
    }

    public void goToContact(ActionEvent event) throws Exception{
        Parent contactPage = FXMLLoader.load(getClass().getResource("contact.fxml"));
        Scene sc = new Scene(contactPage,800,600);
        StudentlistJavaFX.Main.rootStage.setTitle("Contact JavaFx");
        Main.rootStage.setScene(sc);
    }
     public void print(){lvS.setItems(ls);}

}
