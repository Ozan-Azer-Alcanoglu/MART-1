package service.abstracts;

import entity.Technology;

import java.util.List;

public interface TechnologyService {
    Technology getTechnology(int id);
    List<Technology> getTechnologies();
    void add(Technology technology);
    void delete(Technology technology);
    void update(Technology technology);
}
