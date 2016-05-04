import java.util.Random;
import java.util.Observer;

public abstract class Animal {

	public Animal() {
		setName(this.getClass().getSimpleName());
	}

	public static Animal getANewbornAnimal() {
		return AnimalFactory.returnANewbornAnimal();
	}

	public int getExpectedLifeTimeInYears() {
		return expectedLifeTimeInYears;
	}

	public void getOlder() {
		expectedLifeTimeInYears--;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	protected String name;
	protected int expectedLifeTimeInYears;

	@SuppressWarnings("unchecked")
	private static class AnimalFactory {
		public static Animal returnANewbornAnimal() {
			Random rand = new Random();
			Animal a = null;
			try {
				a = animals[rand.nextInt(animals.length)].newInstance();
			} catch (Exception e) {
			}
			return a;
		}

		private static Class<Animal>[] animals = new Class[] { Human.class, Dog.class, Cat.class, Elephant.class,
				Giraffe.class, Butterfly.class, Bacteria.class, Monkey.class, Cow.class, Lion.class, Tiger.class,
				Zebra.class, Bear.class, Dolphin.class, Fish.class, Duck.class, Swine.class, Plancton.class,
				Donkey.class, Frog.class, Penguin.class, Ant.class, Bee.class, Alligator.class, Spider.class, Bat.class,
				Camel.class, Cheetah.class, Coyote.class, Deer.class, Eagle.class, Fox.class, Goat.class, Horse.class,
				Hamster.class, Hyena.class, Koala.class, Mouse.class, Mule.class, Panther.class, Peacock.class,
				Puma.class, Rabbit.class, Rat.class, Scorpion.class, Snail.class, Snake.class, Squirrel.class,
				Swan.class, Vulture.class, Walrus.class, Wolf.class };
	}
}

// ----- derived classes

class Human extends Animal {
	Human() {
		expectedLifeTimeInYears = 100;
	}
}

class Dog extends Animal {
	Dog() {
		expectedLifeTimeInYears = 20;
	}
}

class Cat extends Animal {
	Cat() {
		expectedLifeTimeInYears = 18;
	}
}

class Elephant extends Animal {
	Elephant() {
		expectedLifeTimeInYears = 80;
	}
}

class Giraffe extends Animal {
	Giraffe() {
		expectedLifeTimeInYears = 50;
	}
}

class Butterfly extends Animal {
	Butterfly() {
		expectedLifeTimeInYears = 1;
	}
}

class Bacteria extends Animal {
	Bacteria() {
		expectedLifeTimeInYears = 1;
	}
}

class Monkey extends Animal {
	Monkey() {
		expectedLifeTimeInYears = 50;
	}
}

class Cow extends Animal {
	Cow() {
		expectedLifeTimeInYears = 20;
	}
}

class Lion extends Animal {
	Lion() {
		expectedLifeTimeInYears = 30;
	}
}

class Tiger extends Animal {
	Tiger() {
		expectedLifeTimeInYears = 30;
	}
}

class Zebra extends Animal {
	Zebra() {
		expectedLifeTimeInYears = 25;
	}
}

class Bear extends Animal {
	Bear() {
		expectedLifeTimeInYears = 30;
	}
}

class Dolphin extends Animal {
	Dolphin() {
		expectedLifeTimeInYears = 20;
	}
}

class Fish extends Animal {
	Fish() {
		expectedLifeTimeInYears = 3;
	}
}

class Duck extends Animal {
	Duck() {
		expectedLifeTimeInYears = 5;
	}
}

class Swine extends Animal {
	Swine() {
		expectedLifeTimeInYears = 20;
	}
}

class Plancton extends Animal {
	Plancton() {
		expectedLifeTimeInYears = 1;
	}
}

class Donkey extends Animal {
	Donkey() {
		expectedLifeTimeInYears = 20;
	}
}

class Frog extends Animal {
	Frog() {
		expectedLifeTimeInYears = 5;
	}
}

class Penguin extends Animal {
	Penguin() {
		expectedLifeTimeInYears = 1;
	}
}

class Ant extends Animal {
	Ant() {
		expectedLifeTimeInYears = 2;
	}
}

class Bee extends Animal {
	Bee() {
		expectedLifeTimeInYears = 2;
	}
}

class Alligator extends Animal {
	Alligator() {
		expectedLifeTimeInYears = 15;
	}
}

class Spider extends Animal {
	Spider() {
		expectedLifeTimeInYears = 2;
	}
}

class Bat extends Animal {
	Bat() {
		expectedLifeTimeInYears = 5;
	}
}

class Camel extends Animal {
	Camel() {
		expectedLifeTimeInYears = 20;
	}
}

class Cheetah extends Animal {
	Cheetah() {
		expectedLifeTimeInYears = 15;
	}
}

class Coyote extends Animal {
	Coyote() {
		expectedLifeTimeInYears = 15;
	}
}

class Deer extends Animal {
	Deer() {
		expectedLifeTimeInYears = 15;
	}
}

class Eagle extends Animal {
	Eagle() {
		expectedLifeTimeInYears = 15;
	}
}

class Fox extends Animal {
	Fox() {
		expectedLifeTimeInYears = 15;
	}
}

class Goat extends Animal {
	Goat() {
		expectedLifeTimeInYears = 15;
	}
}

class Horse extends Animal {
	Horse() {
		expectedLifeTimeInYears = 15;
	}
}

class Hamster extends Animal {
	Hamster() {
		expectedLifeTimeInYears = 10;
	}
}

class Hyena extends Animal {
	Hyena() {
		expectedLifeTimeInYears = 15;
	}
}

class Koala extends Animal {
	Koala() {
		expectedLifeTimeInYears = 15;
	}
}

class Mouse extends Animal {
	Mouse() {
		expectedLifeTimeInYears = 10;
	}
}

class Mule extends Animal {
	Mule() {
		expectedLifeTimeInYears = 15;
	}
}

class Panther extends Animal {
	Panther() {
		expectedLifeTimeInYears = 15;
	}
}

class Peacock extends Animal {
	Peacock() {
		expectedLifeTimeInYears = 12;
	}
}

class Puma extends Animal {
	Puma() {
		expectedLifeTimeInYears = 15;
	}
}

class Rabbit extends Animal {
	Rabbit() {
		expectedLifeTimeInYears = 15;
	}
}

class Rat extends Animal {
	Rat() {
		expectedLifeTimeInYears = 9;
	}
}

class Scorpion extends Animal {
	Scorpion() {
		expectedLifeTimeInYears = 10;
	}
}

class Snail extends Animal {
	Snail() {
		expectedLifeTimeInYears = 3;
	}
}

class Snake extends Animal {
	Snake() {
		expectedLifeTimeInYears = 13;
	}
}

class Squirrel extends Animal {
	Squirrel() {
		expectedLifeTimeInYears = 15;
	}
}

class Swan extends Animal {
	Swan() {
		expectedLifeTimeInYears = 7;
	}
}

class Vulture extends Animal {
	Vulture() {
		expectedLifeTimeInYears = 10;
	}
}

class Walrus extends Animal {
	Walrus() {
		expectedLifeTimeInYears = 15;
	}
}

class Wolf extends Animal {
	Wolf() {
		expectedLifeTimeInYears = 15;
	}
}
