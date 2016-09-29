package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SongLib extends Application {

	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		FXMLLoader gui = new FXMLLoader();
		gui.setLocation(getClass().getResource("../gui/layoutSongLib.fxml"));
		
		Parent root;
		try {
			root = gui.load();
		} catch (IOException e) {
			return;
		}
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false); 
		primaryStage.show();
	}
	

	
	public static void main(String[] args) {
		launch(args);
	}
	

}
