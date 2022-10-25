package StudentlistJavaFX;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class StudentListController {
    public TextField Name;
    public TextField Email;
    public TextField Score;
    public boolean nameFlg = false;

    public boolean isNameFlg() {
        return nameFlg;
    }

    public void setNameFlg() {
        this.nameFlg = !this.nameFlg;
    }
    public ListView<Student> lvS;
    private ObservableList<Student> ls = FXCollections.observableArrayList();

    public void submit(javafx.event.ActionEvent actionEvent){
        String name = Name.getText();
        String email = Email.getText();
        String score = Score.getText();
        Student s = new Student(name,email,score);
        ls.add(s);
        print();
     }

    public void sortByName(ActionEvent actionEvent) {
        Comparator<Student> studentComparator = Comparator.comparing(Student::);
        if (this.isNameFlg()) {
            ls.sort(studentComparator);
        } else {

            ls.sort(studentComparator.reversed());
        }
        this.setNameFlg();
    }

     public void print(){lvS.setItems(ls);}

}
