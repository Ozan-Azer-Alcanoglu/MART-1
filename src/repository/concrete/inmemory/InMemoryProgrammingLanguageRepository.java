package repository.concrete.inmemory;

import entity.ProgrammingLanguage;
import repository.abstracts.ProgrammingLanguageRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

    List<ProgrammingLanguage> programmingLanguages;
    public InMemoryProgrammingLanguageRepository() {
        this.programmingLanguages = new ArrayList<>();
    }


    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);
    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.remove(programmingLanguage);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage programmingLanguage1 = this.getById(programmingLanguage.getId());
        programmingLanguage1.setName(programmingLanguage.getName());
        programmingLanguage1.setId(programmingLanguage.getId());
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return programmingLanguages.stream()
                .filter(x -> x.getId() == id)
                .findFirst().orElse(null);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }


}
