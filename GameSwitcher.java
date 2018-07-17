import java.util.HashMap;
import java.util.Map;
import javafx.scene.layout.HBox;  

public class GameSwitcher {

	private static GameSwitcher instance;
    private Map<Integer, HBox> scenes;
    
    private GameSwitcher() {
        scenes = new HashMap<>();
    }
    
    public static GameSwitcher getInstance() {
        if (instance == null) {
            instance = new GameSwitcher();
        }
        return instance;
    }
    
    public void addSwitch(Integer numer, HBox content) {
    	scenes.put(numer, content);
    }
    
    public HBox getSwitch(Integer numer) {
    	return scenes.get(numer);
    }
    	
}
