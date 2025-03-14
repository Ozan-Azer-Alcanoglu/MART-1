package org.example.repository;



import org.example.entity.ProgrammingLanguage;

import java.util.ArrayList;
import java.util.List;

public class ProgrammingLanguageRepository {
    private final List<org.example.entity.ProgrammingLanguage> languages = new ArrayList<>();

    public void add(ProgrammingLanguage language) {
        languages.add(language);
    }

    public List<ProgrammingLanguage> getAll() {
        return languages;
    }

    public ProgrammingLanguage getById(int id) {
        return languages.stream().filter(lang -> lang.getId() == id).findFirst().orElse(null);
    }
}

