package kodlama.io.springTask.entities.concretes;

public class ProgrammingLanguage {

	int id;
	String name;

	public ProgrammingLanguage() {
		super();
	}

	public ProgrammingLanguage(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
