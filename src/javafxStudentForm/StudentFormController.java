package javafxStudentForm;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.awt.*;

public class StudentFormController {
    public TextField txtName;
    public Text strName;
    public TextField txtEmail;
    public Text strEmail;
    public TextField txtAddress;
    public Text strAddress;
    public TextField txtAge;
    public Text strAge;
    public TextField txtPhone;
    public Text strPhone;

    public void submit(ActionEvent actionEvent){
        String name = txtName.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        String age = txtAge.getText();
        String phone = txtPhone.getText();
        strName.setText(name);
        strEmail.setText(email);
        strAddress.setText(address);
        strAge.setText(age);
        strPhone.setText(phone);
    }
}
