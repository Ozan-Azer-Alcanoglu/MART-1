package service.concrete;

import entity.ProgrammingLanguage;
import repository.abstracts.ProgrammingLanguageRepository;
import service.abstracts.ProgramminLanguageService;

import java.util.List;

public class ProgrammingLanguageServiceImpl implements ProgramminLanguageService {


    private ProgrammingLanguageRepository programmingLanguageRepository;

    public ProgrammingLanguageServiceImpl(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguage(int id) {
        return programmingLanguageRepository.getById(id);
    }

    @Override
    public List<ProgrammingLanguage> getProgrammingLanguages() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguageRepository.add(programmingLanguage);
    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        programmingLanguageRepository.delete(programmingLanguage);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        programmingLanguageRepository.update(programmingLanguage);
    }
}
