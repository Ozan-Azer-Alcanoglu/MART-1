package org.example.presentation;


import org.example.entity.ProgrammingLanguage;
import org.example.entity.Technology;
import org.example.repository.ProgrammingLanguageRepository;
import org.example.repository.TechnologyRepository;
import org.example.service.ProgrammingLanguageService;
import org.example.service.TechnologyService;

import java.util.Scanner;

public class ConsoleApp {
    private final ProgrammingLanguageService languageService;
    private final TechnologyService technologyService;
    private final Scanner scanner;

    public ConsoleApp() {

        ProgrammingLanguageRepository programmingLanguageRepository = new ProgrammingLanguageRepository();
        TechnologyRepository technologyRepository = new TechnologyRepository();


        this.languageService = new ProgrammingLanguageService(programmingLanguageRepository);
        this.technologyService = new TechnologyService(technologyRepository);
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n1- Programlama Dili Ekle");
            System.out.println("2- Teknoloji Ekle");
            System.out.println("3- Tüm Programlama Dillerini Listele");
            System.out.println("4- Tüm Teknolojileri Listele");
            System.out.println("0- Çıkış");
            System.out.print("Seçiminiz: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Boşluğu temizle

            switch (choice) {
                case 1 -> addProgrammingLanguage();
                case 2 -> addTechnology();
                case 3 -> listProgrammingLanguages();
                case 4 -> listTechnologies();
                case 0 -> {
                    System.out.println("Çıkış yapılıyor...");
                    return;
                }
                default -> System.out.println("Geçersiz seçim!");
            }
        }
    }

    private void addProgrammingLanguage() {
        System.out.print("Programlama Dili Adı: ");
        String name = scanner.nextLine();
        int id = languageService.getAllLanguages().size() + 1;
        languageService.addProgrammingLanguage(id, name);
        System.out.println("Eklendi!");
    }

    private void addTechnology() {
        System.out.print("Teknoloji Adı: ");
        String name = scanner.nextLine();

        System.out.println("Hangi programlama dili ile ilgili? (ID giriniz)");
        listProgrammingLanguages();
        int langId = scanner.nextInt();
        scanner.nextLine();

        ProgrammingLanguage lang = languageService.getById(langId);
        if (lang != null) {
            int id = technologyService.getAllTechnologies().size() + 1;
            technologyService.addTechnology(id, name, lang);
            System.out.println("Eklendi!");
        } else {
            System.out.println("Geçersiz ID!");
        }
    }

    private void listProgrammingLanguages() {
        for (ProgrammingLanguage lang : languageService.getAllLanguages()) {
            System.out.println(lang.getId() + "- " + lang.getName());
        }
    }

    private void listTechnologies() {
        for (Technology tech : technologyService.getAllTechnologies()) {
            System.out.println(tech.getId() + "- " + tech.getName() + " (Dil: " + tech.getProgrammingLanguage().getName() + ")");
        }
    }
}
