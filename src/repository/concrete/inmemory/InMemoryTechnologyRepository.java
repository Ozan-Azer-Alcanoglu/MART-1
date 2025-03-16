package repository.concrete.inmemory;

import entity.Technology;
import repository.abstracts.TechnologyRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTechnologyRepository implements TechnologyRepository {

    private List<Technology> technologies;

    public InMemoryTechnologyRepository() {
        this.technologies = new ArrayList<>();
    }

    @Override
    public void add(Technology technology) {
        technologies.add(technology);
    }

    @Override
    public void delete(Technology technology) {
        technologies.remove(technology);
    }

    @Override
    public void update(Technology technology) {
        Technology technology1 = this.getById(technology.getId());
        technology1.setName(technology.getName());
        technology1.setProgrammingLanguage(technology.getProgrammingLanguage());
    }

    @Override
    public Technology getById(int id) {
        return technologies.stream().
                filter(x -> x.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Technology> getAll() {
        return technologies;
    }
}
