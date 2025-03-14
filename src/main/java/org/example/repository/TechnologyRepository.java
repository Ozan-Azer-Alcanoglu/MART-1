package org.example.repository;

import org.example.entity.Technology;

import java.util.ArrayList;
import java.util.List;

public class TechnologyRepository {
    private final List<Technology> technologies = new ArrayList<>();

    public void add(Technology technology) {
        technologies.add(technology);
    }

    public List<Technology> getAll() {
        return technologies;
    }
}
