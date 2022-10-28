package JavafxSence.Form;


import JavafxSence.List.ListController;
import JavafxSence.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class FormController {
    public TextField Name;
    public TextField Score;
    public ComboBox<String> cbGender;


    public void backToList() throws Exception {
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
            ListController.ls.add(new JavafxSence.Student(name,score));
            backToList();
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
    }
}
