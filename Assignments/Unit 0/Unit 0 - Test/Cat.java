public class Cat { //1 made public lowercase
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
	public Cat(String name, String breed) { // 1.99 added another parameter for breed
		this.name = name;//2 added this.
		this.breed = breed; 
		this.isHungry = true; // 4. changed yes to true
		livesRemaining = 9;
	}

	public String getName() { // 5. changed void to string
		return name;
	}

	public String getBreed() { //5.99 added getters for all instance variables
		return breed;
	} 

	public int getLivesRemaining() {
		return livesRemaining;
	}

	public boolean getIsHungry(){ //6. added boolean instead of void, camelcased name
		return isHungry;
	}

	public void setName(String name) { // 6.99 added setters for all instance variables
		this.name = name;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setIsHungry(boolean isHungry) {
		this.isHungry = isHungry; 
	}

	public void setLivesRemaining(int livesRemaining) {
		this.livesRemaining = livesRemaining;
	}

	public void feed() {
		 if (this.isHungry = false) { //7. changed to if statement. feeds cat if hungry and doesnt feed if not hungry
			System.out.println("I need to feed the cat.");
		 } else {
			System.out.println("I don't need to feed the cat.");;
		 }
	}

	public boolean equals(Cat other) {
		return this.name.equals(other.name) && this.breed.equals(other.breed) // 8. changed == to .equals(other.name)
			&& this.livesRemaining == other.livesRemaining; // 9. changed to == from =
	}

	public String toString() {  // 10. changed sout to return
		return name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining.";
	}
}