package javaBookLibary.Create;

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
import java.util.Objects;
import java.util.ResourceBundle;

public class CreateController implements Initializable {
    public TextField txtCode;
    public TextField txtName;
    public TextField txtAuthor;
    public TextField txtPrice;
    public ComboBox<String> cbPublisher;
    public TextField txtQty;
    public ComboBox<String> cbType;

    @Override
    public void initialize(URL location, ResourceBundle resource){
        ObservableList<String> publisher = FXCollections.observableArrayList();
        publisher.add("Kim Dong");
        publisher.add("Tong hop");
        publisher.add("Lao Dong");
        cbPublisher.setItems(publisher);
        ObservableList<String> type = FXCollections.observableArrayList();
        type.add("Chinh tri - Phap Luat");
        type.add("Khoa hoc - Cong nghe");
        type.add("Truyen - Tieu thuyet");
        cbType.setItems(type);
    }

    public void backToGallery(ActionEvent actionEvent)throws Exception {
        Parent listScene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../List/List.fxml")));
        Scene sc = new Scene(listScene,600,400);
        Main.rootStage.setScene(sc);
    }

    public void addToGallery(ActionEvent actionEvent) {
        try {
            Integer q = Integer.parseInt(txtQty.getText());
            Integer p = Integer.parseInt(txtPrice.getText());
            if (q <= 0 || p <= 0)
                throw new Exception("So luong hoac gia nhap vao khong hop le");
            Book b = new Book(txtCode.getText(),txtName.getText(),txtAuthor.getText(),cbPublisher.getValue(),cbType.getValue(),p,q);
            ListController.lb.add(b);
            backToGallery(null);
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
    }
}
