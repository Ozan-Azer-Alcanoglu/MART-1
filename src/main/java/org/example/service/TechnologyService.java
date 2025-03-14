package org.example.service;


import org.example.entity.ProgrammingLanguage;
import org.example.entity.Technology;
import org.example.repository.TechnologyRepository;

import java.util.List;

public class TechnologyService {
    private final TechnologyRepository repository;

    public TechnologyService(TechnologyRepository repository) {
        this.repository = repository;
    }

    public void addTechnology(int id, String name, ProgrammingLanguage language) {
        repository.add(new Technology(id, name, language));
    }

    public List<Technology> getAllTechnologies() {
        return repository.getAll();
    }
}