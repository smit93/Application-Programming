import javafx.application.*;
import javafx.fxml.*;
import javafx.stage.*;
import javafx.scene.*;
import au.edu.uts.ap.javafx.*;
import model.*;

public class StoreApplication extends Application {
	public static void main(String[] args) { launch(args); }

	@Override
	public void start(Stage stage) throws Exception {
		// Insert one line of code here to load the store window:
		ViewLoader.showStage(new Store(),"/view/store.fxml","Store",stage);
                // - The Model: a new Store
		// - The View: /view/store.fxml
		// - The Title: "Store"
		// - The Stage: Use the primary stage supplied via the above parameter
	}
}
