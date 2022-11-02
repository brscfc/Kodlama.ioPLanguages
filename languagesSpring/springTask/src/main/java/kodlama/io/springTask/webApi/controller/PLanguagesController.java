package kodlama.io.springTask.webApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.springTask.business.abstracts.PLService;
import kodlama.io.springTask.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/planguage")

public class PLanguagesController {
	PLService pLService;
	
	 @Autowired
	public PLanguagesController(PLService pLService) {
		super();
		this.pLService = pLService;
	}

	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll() {
		return pLService.getAll();
	}

	@PostMapping
	public void add(@RequestBody ProgrammingLanguage pLanguage) throws Exception {
		pLService.add(pLanguage);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable(name = "id")int id) throws Exception {
		pLService.delete(id);
	}

	@PutMapping("/{id}")
	public void update(@PathVariable(name = "id")int id, @RequestBody ProgrammingLanguage pLanguage) throws Exception {
		pLService.update(pLanguage, id);
	}

	@GetMapping("/getbyid")
	public ProgrammingLanguage getById(int id) {
		return pLService.getById(id);

	}

}
