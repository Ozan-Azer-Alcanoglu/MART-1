package repository.abstracts;
import  entity.Technology;

import java.util.List;

public interface TechnologyRepository {
    void add(Technology technology);
    void delete(Technology technology);
    void update(Technology technology);
    Technology getById(int id);
    List<Technology> getAll();
}
