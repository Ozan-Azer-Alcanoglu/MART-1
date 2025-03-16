package service.abstracts;

import entity.ProgrammingLanguage;
import entity.Technology;

import java.util.List;

public interface ProgramminLanguageService {
    ProgrammingLanguage getProgrammingLanguage(int id);
    List<ProgrammingLanguage> getProgrammingLanguages();
    void add(ProgrammingLanguage programmingLanguage);
    void delete(ProgrammingLanguage programmingLanguage);
    void update(ProgrammingLanguage programmingLanguage);
}
