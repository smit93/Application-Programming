package controller;

/**
 *
 * @author 11819164
 */
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.stage.*;
import au.edu.uts.ap.javafx.*;
import model.*;

public class UniversityController extends Controller<University> {

    @FXML
    private ListView<Student> studentLv;
    @FXML
    private Button addStuBtn;
    @FXML
    private Button removeStuBtn;
    @FXML
    private Button loginBtn;

    @FXML
    private void initialize() {
        studentLv.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldSubject, newSubject) -> removeStuBtn.setDisable(newSubject == null)
        );
        studentLv.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldSubject, newSubject) -> loginBtn.setDisable(newSubject == null)
        );
    }

    public final University getUniversity() {
        return model;
    }

    @FXML
    private void handleAdd(ActionEvent event) throws Exception {
        ViewLoader.showStage(getUniversity(), "/view/add_student.fxml", "Add Student", new Stage());
    }

    @FXML
    private void handleRemove() {

        getUniversity().remove(getSelectedStudent());
    }

    private Student getSelectedStudent() {
        return studentLv.getSelectionModel().getSelectedItem();
    }

    @FXML
    private void handleLogin() throws Exception {
        ViewLoader.showStage(getSelectedStudent(), "/view/student.fxml", "Student", new Stage());
    }
}
