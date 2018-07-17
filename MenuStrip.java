import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class MenuStrip {

	@FXML
	private Text energyIndicator;
	@FXML
	private Text delta;
	@FXML
	private TextField loc;
	
	private Task<Integer> energy;
	private Task<Integer> energydelt;
	private Task<String> location;
	
	public static int energydelta = 0;
	public static int totalenergy;
	public static String locale;
	
	@FXML
	private void initialize() {
		
		energy = new Task<Integer>() {
			@Override
			protected Integer call() throws Exception {
				totalenergy = 500;
				while (!isCancelled()) {
					totalenergy = totalenergy + energydelta;
					updateMessage(""+totalenergy);
					Thread.sleep(500);					
					if (totalenergy >= 1000000)
						return totalenergy;
				}
				return totalenergy;
			}
		};
		
		energyIndicator.textProperty().bind(energy.messageProperty());
		
		Thread thread = new Thread(energy);
		thread.setDaemon(true);
		thread.start();
		
		energydelt = new Task<Integer>() {
			@Override
			protected Integer call() throws Exception {
				while (!isCancelled()) {
					updateMessage(""+energydelta);
					Thread.sleep(500);					
					if (energydelta >= 1000000)
						return energydelta;
				}
				return energydelta;
			}
		};	
		
		delta.textProperty().bind(energydelt.messageProperty());
		
		Thread thread2 = new Thread(energydelt);
		thread2.setDaemon(true);
		thread2.start();
		
		location = new Task<String>() {
			@Override
			protected String call() throws Exception {
				while (!isCancelled()) {
					updateMessage(""+locale);
					Thread.sleep(100);
					String ob = "";			
					if (ob != "")
						return locale;
				}
				return locale;
			}
		};
		
		loc.textProperty().bind(location.messageProperty());
		
		Thread thread3 = new Thread(location);
		thread3.setDaemon(true);
		thread3.start();
				
		}	
}
