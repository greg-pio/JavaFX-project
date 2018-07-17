import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {
	
	
	@FXML
	private void onButtonClick() {
		createGameWindow();
	}
	
	private void createGameWindow() {
		Parent root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("GameWindow.fxml"));            
            Stage stage = new Stage();
            stage.setTitle("Game");
            stage.setScene(new Scene(root, 800, 600));
            stage.show();
            }
        catch (IOException e) {
            e.printStackTrace();
        }  
	}       
}