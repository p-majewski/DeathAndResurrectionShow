import java.util.Observable;
import java.util.Random;

public class TimeServer extends Observable {

	private TimeServer() {
		year = 0;
		areWeBreaking = false;
	}

	public static TimeServer getTimeServer() {
		return ts;
	}

	private static TimeServer ts = new TimeServer();

	public void mainLoop() {
		for (;;) {
			year++;
			Random rand = new Random();
			killingOmen = rand.nextInt(100);
			setChanged();
			notifyObservers();
			if (areWeBreaking)
				break;
		}
	}

	private boolean areWeBreaking;

	public void breakFromMainLoop() {
		areWeBreaking = true;
	}

	private int killingOmen;

	public int getKillingOmen() {
		return killingOmen;
	}

	private int year;

	public int getYear() {
		return year;
	}

	public void reset() {
		year = 0;
		areWeBreaking = false;
	}
}
