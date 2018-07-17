import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class Game {
	
	@FXML 
	private HBox strip;
	
	@FXML
	private void initialize() {
		for (int i = 0; i < 9; i++) {
			createElement();
		}
		createMegaElement();
	}

	private void createElement() {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Solar.fxml"));
        Pane pane = null;
        try {
            pane = (Pane) loader.load();
            strip.getChildren().add(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }				
	}
	
private void createMegaElement() {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("MegaSolar.fxml"));
        Pane pane = null;
        try {
            pane = (Pane) loader.load();
            strip.getChildren().add(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }				
	}
	
	
	
}
