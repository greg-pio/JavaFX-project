import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class MegaSolar {

	@FXML
	private ImageView firstmega;
	
	@FXML
	private ImageView secondmega;
		
	@FXML private void newMegaSolar() { 
		buyNewMegaSolar(); 
	} 
	
	private void buyNewMegaSolar() { 
		if (ifEnergy()) {
			MenuStrip.totalenergy = MenuStrip.totalenergy - 10000;
			MenuStrip.energydelta += 500;	
			firstmega.setOpacity(0);	
			secondmega.setOpacity(100);
		}
	}
	
	private boolean ifEnergy(){
		if (MenuStrip.totalenergy >= 10000) {
			return true;
		} else return false;
	}
}