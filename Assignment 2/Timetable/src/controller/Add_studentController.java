/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author 11819164
 */
import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.beans.property.*;
import java.io.*;
import java.text.*;
import au.edu.uts.ap.javafx.*;
import model.*;

public class Add_studentController extends Controller<University> {

    @FXML
    private TextField SnumberTf;
    @FXML
    private TextField SnameTf;
    @FXML
    private CheckBox scholarshipCb;
    @FXML
    private ToggleGroup attendenceTg;
    @FXML
    private Button addBtn;
    @FXML
    private Label error;

    public final University getUniversity() {
        return model;
    }

    private String getSnumber() {
        return SnumberTf.getText();
    }

    private String getSname() {
        return SnameTf.getText();
    }

    private String getAttendence() {

        return attendenceTg.getSelectedToggle().getUserData().toString();

    }

    private boolean getScholarship() {
        if (scholarshipCb.isSelected()) {
            return true;
        }
        return false;
    }

    @FXML
    private void initialize() {
        SnameTf.textProperty().addListener((o, oldText, newText) -> updateButtons());
        SnumberTf.textProperty().addListener((o, oldText, newText) -> updateButtons());
        attendenceTg.selectedToggleProperty().addListener((observable, oldSubject, newSubject) -> updateButtons());
    }

    private void updateButtons() {
        addBtn.setDisable(!(isTfValid() && isAttendanceValid()));

    }

    private boolean isTfValid() {
        return (getSnumber().length() > 0) && (getSname().length() > 0);
    }

    private boolean isAttendanceValid() {
        return attendenceTg.getSelectedToggle() != null;
    }

    @FXML
    public void handleAdd(ActionEvent event) throws Exception {

        try {
            getUniversity().addStudent(getSnumber(), getSname(), getAttendence(), getScholarship());
            stage.close();
        } catch (Exception e) {
            error.setText(e.getMessage());
        }

    }

    @FXML
    public void handleCancel(ActionEvent event) {
        stage.close();
    }

}
