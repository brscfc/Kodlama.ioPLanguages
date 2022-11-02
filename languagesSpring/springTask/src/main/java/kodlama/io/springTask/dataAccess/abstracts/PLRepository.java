package kodlama.io.springTask.dataAccess.abstracts;

import java.util.List;
import kodlama.io.springTask.entities.concretes.ProgrammingLanguage;

public interface PLRepository {

	List<ProgrammingLanguage> getAll();

	void add(ProgrammingLanguage pLanguage);

	void delete(int id);

	void update(ProgrammingLanguage pLanguage, int id);

	ProgrammingLanguage getById(int id);

}
