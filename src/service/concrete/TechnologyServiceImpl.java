package service.concrete;

import entity.Technology;
import repository.abstracts.TechnologyRepository;
import service.abstracts.TechnologyService;

import java.util.List;

public class TechnologyServiceImpl implements TechnologyService {

    private TechnologyRepository technologyRepository;

    public TechnologyServiceImpl(TechnologyRepository technologyRepository) {
        this.technologyRepository = technologyRepository;
    }

    @Override
    public Technology getTechnology(int id) {
        return technologyRepository.getById(id);
    }

    @Override
    public List<Technology> getTechnologies() {
        return technologyRepository.getAll();
    }

    @Override
    public void add(Technology technology) {
        technologyRepository.add(technology);
    }

    @Override
    public void delete(Technology technology) {
        technologyRepository.delete(technology);
    }

    @Override
    public void update(Technology technology) {
        technologyRepository.update(technology);
    }
}
