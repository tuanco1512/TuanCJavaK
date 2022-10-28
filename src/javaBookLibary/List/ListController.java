package javaBookLibary.List;

import javaBookLibary.Book;
import javaBookLibary.Edit.EditController;
import javaBookLibary.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class ListController implements Initializable {
    public ListView<Book> lvB;
    public static ObservableList<Book> lb = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lvB.setItems(lb);
    }
    public void create(ActionEvent actionEvent)throws Exception {
        Parent createForm = FXMLLoader.load(getClass().getResource("../Create/Create.fxml"));
        Scene sc = new Scene(createForm,600,400);
        Main.rootStage.setScene(sc);
    }

    public void edit(ActionEvent actionEvent)throws Exception {
        try {
            if (lvB.getSelectionModel().getSelectedItems() == null){
                throw new Exception("Vui long chon sach muon chinh sua!");
            }
            EditController.editedBook = lvB.getSelectionModel().getSelectedItem();
            Parent editForm = FXMLLoader.load(getClass().getResource("../Edit/Edit.fxml"));
            Scene sc = new Scene(editForm);
            Main.rootStage.setScene(sc);
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
    }

    public void remove(ActionEvent actionEvent) {
    }

    public void sortByQty(ActionEvent actionEvent) {
    }

    public void sortByPrice(ActionEvent actionEvent) {
    }
}
