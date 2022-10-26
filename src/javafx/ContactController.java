package javafx;

import StudentlistJavaFX.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;

public class ContactController implements Initializable {
    public TextField txtName;
//    public Text strName;
    public TextField txtEmail;
    public ListView<Contact> lv;
//    public Text strEmail;

    private ObservableList<Contact> ls = FXCollections.observableArrayList();

    public void submit(ActionEvent actionEvent) {
        String name = txtName.getText();
        String email = txtEmail.getText();
        // System.out.println("Submitted..."+name);
        Contact ct = new Contact(name,email);
        ls.add(ct);
        print();
    }

    public void print(){
        lv.setItems(ls);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ls.add(new Contact("Nguyen Truong Giang","Giang@gmail.com"));
        ls.add(new Contact("Nguyen Hoang Long","Long@gmail.com"));
        print();
    }

}
