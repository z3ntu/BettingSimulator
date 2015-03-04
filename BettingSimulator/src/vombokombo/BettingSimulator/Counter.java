package vombokombo.BettingSimulator;

import java.time.Duration;
import org.reactfx.util.Timer;
import org.reactfx.util.FxTimer;

import javafx.scene.control.Label;


public class Counter
{
	private boolean status; //false == stopped, true == running
	
	Timer timer;

	private int timeSeconds;
	
	private Label timeLabel;

	public Counter(Label timeLabelP)
	{
		
		this.timeLabel = timeLabelP;
		
		timer = FxTimer.runPeriodically(
		        Duration.ofMillis(1000),
		        () -> scheduledTask());
		status = true;
	}
	
	public void scheduledTask(){
		increaseSecond();
		timeLabel.setText(getTime(timeSeconds));
	}
	
	public void increaseSecond(){
		timeSeconds++;
	}
	
	public String getTime(int totalSeconds){
		
		final int MINUTES_IN_AN_HOUR = 60;
		final int SECONDS_IN_A_MINUTE = 60;
		int seconds = totalSeconds % SECONDS_IN_A_MINUTE;
		int totalMinutes = totalSeconds / SECONDS_IN_A_MINUTE;
		int minutes = totalMinutes % MINUTES_IN_AN_HOUR;
		int hours = totalMinutes / MINUTES_IN_AN_HOUR;
		
		return hours + ":" + minutes + ":" + seconds;
	}
	
	public void stopResume(){
		//timer.stop();
		/*
		if(status == false){
			System.out.println("Timer stopped, now started!");
			timer.restart();
		} else {
			System.out.println("Timer started, now stopped!");
			timer.stop();
			
		}
		*/
	}
	
}