package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/*
 * Goal is to have current information visible at top always 
 * Buttons/actions are stacked on the left,
 * 		Action buttons will be worked with by showing textfields at the bottom
 *      and then clicking save or cancel.
 *      
 *      So --> Add
 *         --> Show editable text fields
 *         --> User enters data
 *         --> User clicks save
 *            --> Add data to arraylist, update listview
 *         OR
 *         
 *         --> User clicks cancel
 *            --> Hide editable text fields again
 *            
 *      For --> Edit
 *          ** Same as add except **
 *          --> pre-fill song information in text fields
 *          --> User clicks save
 *             --> find song in array list, change song data and update
 *          --> User clicks cancel
 *             --> Clear text fields and hide them
 *             
 *      For --> Delete
 *          --> Simple operation, will delete currently selected song
 *          --> Adjust array list accordingly, update list view
 *          ** No editable text fields should be necessary for this **
 * The List of songs are located on the right where we can click on them etc.
 * 
 * 
 * 
 * 
 */


public class SongLib extends Application {

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		FXMLLoader gui = new FXMLLoader();
		gui.setLocation(getClass().getResource("../gui/layout.fxml"));
		
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
