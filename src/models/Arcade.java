package models;

public class Arcade {
	String name;
	int release;
	int difficultLevel;
	
	public Arcade(String name, int release, int difficultLevel) {
		super();
		this.name = name;
		this.release = release;
		this.difficultLevel = difficultLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRelease() {
		return release;
	}

	public void setRelease(int release) {
		this.release = release;
	}

	public int getDifficultLevel() {
		return difficultLevel;
	}

	public void setDifficultLevel(int difficultLevel) {
		this.difficultLevel = difficultLevel;
	}

	@Override
	public String toString() {
		return "Arcade [name=" + name + ", release=" + release + ", difficultLevel=" + difficultLevel + "]";
	}
	
	
	
	
}
