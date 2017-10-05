package triviaApp;

import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class Clock extends JLabel {
	private Timer timer = new Timer();
	private int mPeriod = 1;
	private int mDelay = 0;
	private int i = 0;
	private int mLong=0;
	private int mUnit=1;
	private int mX=0;
	private int mY=0;

	Clock() {
		mPeriod=1;
		mDelay=0;
		i=0;
		
		this.setText("0");
		this.setFont(new Font("MS Gothic",Font.PLAIN,48));
	}
	
	public void doStart() {
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				// Your database code here
				setText("" + i++);

				if (i > mLong) {
					this.cancel();
					i=0;
					
					setText("" + i);
				}
			}
		}, 0, mPeriod*mUnit* 1000);

	}

	public void setStopLong(int v) {
		mLong=v;
	}

	public void setDelay(int v) {
		mDelay=v;
	}

	public void setPeriot(int v) {
		mPeriod = v;
	}
	
	public void setUnit(int v) {
		mUnit = v;
	}

}
