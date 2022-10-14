package buscarYreemplazar;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

public class Vista implements Initializable {

	@FXML
	private BorderPane root;

	public Vista() throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/buscarYreemplazarPlantilla.fxml"));
		loader.setController(this);
		loader.load();
	}

	public BorderPane getView() {
		return root;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

}
