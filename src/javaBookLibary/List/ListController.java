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
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.ResourceBundle;

public class ListController implements Initializable {
    public boolean sortQty = true;
    public boolean sortPrice = true;
    public static Book selectBook;
    public ListView<Book> lvB;
    public static ObservableList<Book> lb = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lvB.setItems(lb);
    }
    public void create(ActionEvent actionEvent)throws Exception {
        Parent createForm = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Create/Create.fxml")));
        Scene sc = new Scene(createForm,600,400);
        Main.rootStage.setScene(sc);
    }

    public void edit(ActionEvent actionEvent) {
        try {
            if (lvB.getSelectionModel().getSelectedItems() == null)
                throw new Exception("Vui long chon sach muon chinh sua!");
            EditController.editedBook = lvB.getSelectionModel().getSelectedItem();
            Parent editForm = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Edit/Edit.fxml")));
            Scene sc = new Scene(editForm,600,400);
            Main.rootStage.setScene(sc);
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
    }

    public void remove(ActionEvent actionEvent) {
        try{
            if(lvB.getSelectionModel().getSelectedItems() == null)
                throw new Exception("Vui long chon sach muon loai bo!");
            selectBook = lvB.getSelectionModel().getSelectedItem();
            lvB.getItems().remove(selectBook);
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
    }

    public void sortByQty(ActionEvent actionEvent) {
        Collections.sort(lb, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return sortQty?o1.getbQty().compareTo(o2.getbQty()):o2.getbQty().compareTo(o1.getbQty());
            }
        });
        sortQty = !sortQty;
        lvB.refresh();
    }

    public void sortByPrice(ActionEvent actionEvent) {
        Collections.sort(lb, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return sortPrice?o1.getbPrice().compareTo(o2.getbPrice()):o2.getbPrice().compareTo(o1.getbPrice());
            }
        });
        sortPrice = !sortPrice;
        lvB.refresh();
    }
}
