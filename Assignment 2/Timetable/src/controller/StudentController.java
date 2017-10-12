/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import au.edu.uts.ap.javafx.*;
import model.*;

/**
 *
 * @author 11819164
 */
public class StudentController extends Controller<Student> {

    @FXML
    private Button withdrawBtn;
    @FXML
    private Button enrolBtn;
    @FXML
    private Button logoutBtn;
    @FXML
    private ComboBox<Subject> subjectCmb;
    @FXML
    private TableView<Activity> subjectAtcTv;
    @FXML
    private TableView<Activity> studentActTv;

    @FXML
    private void initialize() {

        subjectCmb.getSelectionModel().selectedItemProperty().addListener(
                (obs, o, n) -> {
                    subjectAtcTv.setItems(n.getActivities());
                });
        subjectAtcTv.getSelectionModel().selectedItemProperty().addListener((obs, o, n) -> enrolBtn.setDisable(!n.canEnrol()));
        studentActTv.setItems(getStudent().getActivities());
        studentActTv.getSelectionModel().selectedItemProperty().addListener((obs, o, n) -> withdrawBtn.setDisable(false));

    }

    public final University getUniversity() {
        return getStudent().getUniversity();
    }

    public final Student getStudent() {
        return model;
    }

    private Activity getEActivity() {
        return subjectAtcTv.getSelectionModel().getSelectedItem();
    }

    private Activity getWActivity() {
        return studentActTv.getSelectionModel().getSelectedItem();
    }

    @FXML
    public void handleLogout(ActionEvent event) {
        stage.close();
    }

    @FXML
    public void handleEnrol(ActionEvent event) {
        getStudent().enrol(getEActivity());
        enrolBtn.setDisable(true);

    }

    @FXML
    public void handleWithdraw(ActionEvent event) {
        getStudent().withdraw(getWActivity());
        withdrawBtn.setDisable(true);
    }

}
