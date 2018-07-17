import java.io.IOException;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GameController {

	GameSwitcher switcher = GameSwitcher.getInstance();
	
	@FXML
	private MenuItem info;
	@FXML
	private MenuItem close;
	@FXML
	private VBox game;
	@FXML
	private HBox menustrip;
	@FXML 
	private Button area1;
	@FXML
	private Button area2;
	@FXML
	private Button area3;
	@FXML
	private ImageView background1;
	@FXML
	private ImageView background2;
	@FXML
	private ImageView background3;
	
	@FXML
	private void initialize() throws IOException {
		createMenuStrip();
		for (int i = 0; i < 12; i++) {		
		switcher.addSwitch(i, FXMLLoader.load(getClass().getResource("Game.fxml")));
		background2.setOpacity(0);
		background3.setOpacity(0);
		}
	}
	
	@FXML
	private void onArea1Click() {
		game.getChildren().clear();
		for (int i = 0; i < 4; i++) {
		game.getChildren().add(switcher.getSwitch(i));
		MenuStrip.locale = "Area1";
		background1.setOpacity(70);
		background2.setOpacity(0);
		background3.setOpacity(0);
		}
	}
	
	@FXML
	private void onArea2Click() {
		game.getChildren().clear();
		for (int i = 4; i < 8; i++) {
		game.getChildren().add(switcher.getSwitch(i));
		MenuStrip.locale = "Area2";
		background1.setOpacity(0);
		background2.setOpacity(70);
		background3.setOpacity(0);
		}
	}
	
	@FXML
	private void onArea3Click() {
		game.getChildren().clear();
		for (int i = 8; i < 12; i++) {
		game.getChildren().add(switcher.getSwitch(i));
		MenuStrip.locale = "Area3";
		background1.setOpacity(0);
		background2.setOpacity(0);
		background3.setOpacity(70);
		}
	}
	
	@FXML
	private void menucloseAction() {
		Platform.exit();
	}
	
	@FXML
	private void menuinfoAction() {
		createInfo();
	}
	
	private void createInfo() {
		Parent root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("Info.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Info");
            stage.setScene(new Scene(root, 211, 176));
            stage.show();           
            }
        catch (IOException e) {
            e.printStackTrace();
        }
	
	}
		
	private void createMenuStrip() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuStrip.fxml"));
        MenuStrip controller = new MenuStrip();
        loader.setController(controller);
        Pane pane = null;
        
        try {
            pane = (Pane) loader.load();
            menustrip.getChildren().add(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
		
}
