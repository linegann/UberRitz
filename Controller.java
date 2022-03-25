package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {
	private Stage stage;
	private Scene scene;
	private Parent root;

	@FXML	
	public void switchToMidiSoir(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("MidiSoir.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);;
		stage.show();
	}
	
	public void switchToAccueil(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("UberRitzTest.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);;
		stage.show();
		
	}
		
		public void switchToChoix(ActionEvent event) throws IOException {
			root = FXMLLoader.load(getClass().getResource("Choix.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);;
			stage.show();
		
	}
		public void switchToConnexion(ActionEvent event) throws IOException {
			root = FXMLLoader.load(getClass().getResource("Connexion.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);;
			stage.show();
		}
		
		public void switchToAjout(ActionEvent event) throws IOException {
			root = FXMLLoader.load(getClass().getResource("AjouterAliment.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);;
			stage.show();
		}
		public void switchToFile(ActionEvent event) throws IOException {
			root = FXMLLoader.load(getClass().getResource("File.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);;
			stage.show();
		}
	

}
