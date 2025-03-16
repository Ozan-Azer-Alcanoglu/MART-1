package repository.abstracts;

import entity.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
    void add(ProgrammingLanguage programmingLanguage);
    void delete(ProgrammingLanguage programmingLanguage);
    void update(ProgrammingLanguage programmingLanguage);
    ProgrammingLanguage getById(int id);
    List<ProgrammingLanguage> getAll();
}
