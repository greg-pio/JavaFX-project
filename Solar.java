import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class Solar {
				
	@FXML
	private ImageView first;
	
	@FXML
	private ImageView second;
		
	@FXML private void newSolar() { 
		buyNewSolar(); 
	} 
	
	private void buyNewSolar() { 
		if (ifEnergy()) {
			MenuStrip.totalenergy = MenuStrip.totalenergy - 400;
			MenuStrip.energydelta += 50;	
			first.setOpacity(0);	
			second.setOpacity(100);
		}
	}
	
	private boolean ifEnergy(){
		if (MenuStrip.totalenergy >= 400) {
			return true;
		} else return false;
	}
}