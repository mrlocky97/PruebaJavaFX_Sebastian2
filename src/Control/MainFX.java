package Control;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * 
 * A <b>PruebaJavaFX</b> interfas con un buen aspecto y una simple funcionalidad
 * 
 * @author juan sebastian
 * @version 1.0
 * @see ControlFX
 */

public class MainFX extends Application {

	private AnchorPane miPanel;

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Login.fxml"));
		miPanel = (AnchorPane) loader.load();
		Scene scene=new Scene(miPanel);
		primaryStage.setTitle("Login");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
