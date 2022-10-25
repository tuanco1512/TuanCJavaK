package javafxStudentForm;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.awt.*;

public class StudentFormController {
    public TextField txtName;
//    public Text strName;
    public TextField txtEmail;
//    public Text strEmail;
    public TextField txtAddress;
//    public Text strAddress;
    public TextField txtAge;
//    public Text strAge;
    public TextField txtPhone;
//    public Text strPhone;
    public ListView<Student> lvS;

    private ObservableList<Student> ls = FXCollections.observableArrayList();

    public void submit(ActionEvent actionEvent){
        String name = txtName.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        String age = txtAge.getText();
        String phone = txtPhone.getText();
        Student s = new Student(name,email,address,age,phone);
        ls.add(s);
        print();
    }

    public void print(){
        lvS.setItems(ls);
    }
}
