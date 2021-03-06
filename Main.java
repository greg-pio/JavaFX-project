import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("StartWindow.fxml"));
		Scene scene = new Scene(root, 400, 200);
		primaryStage.setTitle("PJATK Mars Solar Panel Sim");		
		primaryStage.setScene(scene);		
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}