package kodlama.io.springTask.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.springTask.dataAccess.abstracts.PLRepository;
import kodlama.io.springTask.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryPLRepository implements PLRepository {

	List<ProgrammingLanguage> pLanguages;

	public InMemoryPLRepository() {

		super();

		pLanguages = new ArrayList<ProgrammingLanguage>();

		pLanguages.add(new ProgrammingLanguage(1, "C#"));
		pLanguages.add(new ProgrammingLanguage(2, "Java"));
		pLanguages.add(new ProgrammingLanguage(3, "Python"));
		pLanguages.add(new ProgrammingLanguage(4, "C++"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return pLanguages;
	}

	@Override
	public void add(ProgrammingLanguage pLanguage) {
		pLanguages.add(pLanguage);

	}

	@Override
	public void delete(int id) {
		pLanguages.remove(getById(id));
	}

	@Override
	public void update(ProgrammingLanguage pLanguage, int id) {
		ProgrammingLanguage pLanguage2 = getById(id);
		pLanguage2.setName(pLanguage.getName());
		
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		ProgrammingLanguage pLanguage = pLanguages.stream().filter( programmingLanguage->programmingLanguage.getId()==id).findFirst().get();
		pLanguage.getId();
		return pLanguage;

	}

}
