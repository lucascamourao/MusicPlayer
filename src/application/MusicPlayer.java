package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class MusicPlayer extends Application {
	@Override
	public void start(Stage stage) throws Exception {

		/* String musicDirectory = "C:/caminho/para/arquivo/musicas";
        	File directory = new File(musicDirectory);
        	mainController.loadSongsFromDirectory(directory); */

		Parent root = FXMLLoader.load(getClass().getResource("/view/MainView.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

		stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			@Override
			public void handle(WindowEvent arg0) {
				Platform.exit();
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
}
