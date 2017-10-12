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

public class ProductController extends Controller<Product> {
	
	@FXML private TextField amountTf;

	public final Product getProduct() { return model; }
	private int getAmount() { return Integer.parseInt(amountTf.getText()); }
	private void setAmount(int amount) { amountTf.setText("" + amount); }

	@FXML private void handleSell(ActionEvent event) {
		int amount = getAmount();
		if (getProduct().has(amount)) {
			getProduct().sell(getAmount());
			setAmount(0);
		}
	}
}
