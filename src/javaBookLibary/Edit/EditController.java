package javaBookLibary.Edit;

import javaBookLibary.Book;
import javaBookLibary.List.ListController;
import javaBookLibary.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;

public class EditController implements Initializable {
    public TextField txtCode;
    public TextField txtQty;
    public TextField txtPrice;
    public TextField txtAuthor;
    public TextField txtName;
    public ComboBox cbPublisher;
    public ComboBox cbType;

    public static Book editedBook;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtCode.setText(editedBook.getbCode());
        txtName.setText(editedBook.getbName());
        txtAuthor.setText(editedBook.getbAuthor());
        ObservableList<String> publisher = FXCollections.observableArrayList();
        publisher.add("Kim Dong");
        publisher.add("Tong hop");
        publisher.add("Lao Dong");
        cbPublisher.setItems(publisher);
        cbPublisher.setValue(editedBook.getbPh());
        ObservableList<String> type = FXCollections.observableArrayList();
        type.add("Chinh tri - Phap Luat");
        type.add("Khoa hoc - Cong nghe");
        type.add("Truyen - Tieu thuyet");
        cbType.setItems(type);
        cbPublisher.setValue(editedBook.getbType());
        txtPrice.setText(editedBook.getbPrice().toString());
        txtQty.setText(editedBook.getbQty().toString());
    }

    public void saveChanges(ActionEvent actionEvent) {
        try {
            Integer q = Integer.parseInt(txtQty.getText());
            Integer p = Integer.parseInt(txtPrice.getText());
            if (q < 0 || p < 0)
                throw new Exception("So luong hoac gia nhap vao khong hop le");
            editedBook.setbCode(txtCode.getText());
            editedBook.setbName(txtName.getText());
            editedBook.setbAuthor(txtAuthor.getText());
            editedBook.setbPh(cbPublisher.getValue().toString());
            editedBook.setbType(cbType.getValue().toString());
            editedBook.setbPrice(p);
            editedBook.setbQty(q);
            backToGallery(null);
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
    }

    public void backToGallery(ActionEvent actionEvent)throws Exception {
        Parent listScene = FXMLLoader.load(getClass().getResource("../List/List.fxml"));
        Scene sc = new Scene(listScene,600,400);
        Main.rootStage.setScene(sc);
    }
}
