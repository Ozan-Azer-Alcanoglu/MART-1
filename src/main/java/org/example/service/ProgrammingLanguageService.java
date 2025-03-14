package org.example.service;


import org.example.entity.ProgrammingLanguage;
import org.example.repository.ProgrammingLanguageRepository;

import java.util.List;

public class ProgrammingLanguageService {
    private final ProgrammingLanguageRepository repository;

    public ProgrammingLanguageService(ProgrammingLanguageRepository repository) {
        this.repository = repository;
    }

    public void addProgrammingLanguage(int id, String name) {
        repository.add(new ProgrammingLanguage(id, name));
    }

    public List<ProgrammingLanguage> getAllLanguages() {
        return repository.getAll();
    }

    public ProgrammingLanguage getById(int id) {
        return repository.getById(id);
    }
}
