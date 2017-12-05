package Control;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * Esto es el controlador de la prueba
 * 
 * @author juansebastianquinayasguarin
 * 
 */
public class ControlFX {

	private AnchorPane miPanel;

	/**
	 * carga segunda ventana
	 */
	public void openStage() {
		showSendProfile();
	}

	private void showSendProfile() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(ControlFX.class.getResource("/view/FreeSolo.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			Stage sendStage = new Stage();
			sendStage.setTitle("FreeSolo");
			Scene scene = new Scene(page);
			sendStage.setScene(scene);
			sendStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
