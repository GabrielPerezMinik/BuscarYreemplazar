package buscarYreemplazar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LanzadorFxml extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Vista control = new Vista();
		Scene scene = new Scene(control.getView());
		primaryStage.setTitle("Buscar Y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
