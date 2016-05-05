import java.util.Observable;
import java.util.Observer;

public class Soul implements Observer {

	public Soul() {
		reincarnations = 0;
		humanReincarnations = 0;
		currentReincarnation = Animal.getANewbornAnimal();
		if (currentReincarnation.getClass() == Human.class) {
			humanReincarnations++;
			System.out.print(". ");
		}
	}

	private Animal currentReincarnation;
	private int reincarnations;
	private int humanReincarnations;
	private final int LIVES_TO_NIRVANA = 7;

	@Override
	public void update(Observable obs, Object obj) {
		if (Start.ts.getKillingOmen() % currentReincarnation.getExpectedLifeTimeInYears() == 0) {
			currentReincarnation = Animal.getANewbornAnimal();
			reincarnations++;
			if (currentReincarnation.getClass() == Human.class) {
				humanReincarnations++;
				System.out.print(". ");
			}
		} else {
			currentReincarnation.getOlder();
		}
		if (humanReincarnations == LIVES_TO_NIRVANA) {
			Start.ts.breakFromMainLoop();
			System.out.println("We lived " + reincarnations + " animal lives, 7 human, and we reached nirvana in year "
					+ Start.ts.getYear());
		}

	}

}
