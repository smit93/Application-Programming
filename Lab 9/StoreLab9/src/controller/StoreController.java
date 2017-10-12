package controller;

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

public class StoreController extends Controller<Store> {
    //private Store store = new Store();
    @FXML private ListView<Product> productLv;
    @FXML private Text cashTxt;
    @FXML private void initialize(){
     
    }
    @FXML private void handleView(ActionEvent event) throws Exception {
    ViewLoader.showStage(getProduct(), "/view/product.fxml", "Product", new Stage());
}
    public final Store getStore() { return model; } 
    private Product getProduct(){return productLv.getSelectionModel().getSelectedItem();}
}
