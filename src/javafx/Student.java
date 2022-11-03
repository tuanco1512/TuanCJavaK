package javafx;

import javafx.edit.EditController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class Student {
    private Integer id;
    private String name;
    private String email;
    private Integer mark;
    private String gender;

    private Button edit;

    public Student(Integer id,String name, String email, Integer mark,String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mark = mark;
        this.gender = gender;
        this.edit = new Button("Edit");
        this.edit.setOnAction(event -> {
            try {
                EditController.editedStudent = this;
                Parent editForm = FXMLLoader.load(getClass().getResource("edit/edit.fxml"));
                Scene sc = new Scene(editForm,800,600);
                Main.rootStage.setScene(sc);
            }catch (Exception e){

            }
        });
    }

    public Button getEdit() {
        return edit;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.getName()+"\n"+this.getMark();
    }
}
