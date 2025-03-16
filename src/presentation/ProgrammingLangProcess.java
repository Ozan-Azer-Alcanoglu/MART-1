package presentation;

import entity.ProgrammingLanguage;
import repository.concrete.inmemory.InMemoryProgrammingLanguageRepository;
import service.abstracts.ProgramminLanguageService;
import service.concrete.ProgrammingLanguageServiceImpl;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public  class  ProgrammingLangProcess {

    ProgramminLanguageService programminLanguageService;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public ProgrammingLangProcess() {
        this.programminLanguageService = new ProgrammingLanguageServiceImpl(new InMemoryProgrammingLanguageRepository());
    }


    public void writeAll()
    {
        List<ProgrammingLanguage> list = programminLanguageService.getProgrammingLanguages();
        System.out.println("************************");
        for(int i = 0;i < list.size();i++)
        {
            System.out.println("Id: "+ list.get(i).getId() + "  Name: " + list.get(i).getName());
        }
        System.out.println("************************");
    }

    public  void Cases()
    {

        int userChoice;

        while (true)
        {
            System.out.println("Proramlama Dili\n1 - Ekle\n2 - Sil\n3 - Hepsini Getir\n4 - Güncelle\n5 - Çıkış");
            userChoice = scanner.nextInt();
            scanner.nextLine();
            switch (userChoice)
            {
                case 1:
                    System.out.print("Programlama Dili Adı: ");
                    programminLanguageService.add(new ProgrammingLanguage(random.nextInt(1,500),scanner.nextLine()));
                    System.out.println("Programlama Dili Eklendi");
                    break;
                case 2:
                    writeAll();
                    System.out.println("Silmek istediğiniz Id yi seçin: ");
                    userChoice = scanner.nextInt();
                    scanner.nextLine();
                    programminLanguageService.delete(programminLanguageService.getProgrammingLanguage(userChoice));
                    System.out.println(userChoice  +"Id ye ait dil silindi.");
                    break;
                case 3:
                    writeAll();
                    break;
                case 4:
                    writeAll();
                    System.out.print("Güncellemek istediğiniz Id yi seçin: ");
                    userChoice = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Yeni Programlama Dili: ");
                    programminLanguageService.update(new ProgrammingLanguage(userChoice,scanner.nextLine()));
                    System.out.println(userChoice  + " Id ye ait dil Güncellendi.");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Yanlış Seçim Yaptınız.");
            }
        }
    }
}
