package javafx;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ContactController {
    public TextField txtName;
    public Text strName;
    public TextField txtEmail;
    public Text strEmail;

    public void submit(ActionEvent actionEvent) {
        String name = txtName.getText();
        String email = txtEmail.getText();
        // System.out.println("Submitted..."+name);
        strName.setText(name);
        strEmail.setText(email);
    }
}
