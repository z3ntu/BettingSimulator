package vombokombo.BettingSimulator.view;


import vombokombo.BettingSimulator.Counter;
import vombokombo.BettingSimulator.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class LivetickerViewController {

	@FXML
	private TextArea teamA;
	@FXML
	private TextArea teamB;
	
	@FXML
	private Label time;
	
	@FXML
	private TableColumn<String, String> timeStamp;
	
	@FXML
	private TableColumn<String, String> event;

	private MainApp mainApp;
	
	public LivetickerViewController(){
	}
	
	@FXML
	private void initialize(){
		
	}
	
	public void setMainApp(MainApp mainApp){
		this.mainApp = mainApp;
	}
	
	@FXML
	public void closeButton(){
		System.exit(1);
	}
	
	@FXML
	public void skipButton(){
		time.setText("hi");
	}
	
	@FXML
	public void startButton(){
		System.out.println("start");
		Counter counter = new Counter(time);
		System.out.println("teststart");
		
	}
}
