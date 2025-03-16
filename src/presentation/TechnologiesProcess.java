package presentation;

import entity.ProgrammingLanguage;
import entity.Technology;
import repository.concrete.inmemory.InMemoryTechnologyRepository;
import service.abstracts.TechnologyService;
import service.concrete.TechnologyServiceImpl;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TechnologiesProcess {
    TechnologyService technologyService;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public TechnologiesProcess() {
        this.technologyService = new TechnologyServiceImpl(new InMemoryTechnologyRepository());
    }


    public void writeAll()
    {
        System.out.println("************************");
        List<Technology> list = technologyService.getTechnologies();
        for(int i = 0;i < list.size();i++)
        {
            System.out.println("Id: "+ list.get(i).getId() + "  Name: " + list.get(i).getName() +"   Programlama Dili: "  + list.get(i).getProgrammingLanguage());
        }
        System.out.println("************************");
    }



    public  void Cases()
    {
        int userChoice;
        String teknolojiAdı;
        String programlamaDili;

        while (true)
        {
            System.out.println("Teknolojiler\n1 - Ekle\n2 - Sil\n3 - Hepsini Getir\n4 - Güncelle\n5 - Çıkış");
            userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice)
            {
                case 1:
                    System.out.print("Teknoloji Adı: ");
                    teknolojiAdı = scanner.nextLine();
                    System.out.print("Programlama Dili: ");
                    programlamaDili = scanner.nextLine();
                    technologyService.add(new Technology(random.nextInt(500),teknolojiAdı,programlamaDili));
                    System.out.println("Teknoloji Eklendi");
                    break;
                case 2:
                    writeAll();
                    System.out.println("Silmek istediğiniz Id yi seçin: ");
                    userChoice = scanner.nextInt();
                    scanner.nextLine();
                    technologyService.delete(technologyService.getTechnology(userChoice));
                    System.out.println(userChoice  +" Id ye ait teknoloji silindi.");
                    break;
                case 3:
                    writeAll();
                    break;
                case 4:
                    writeAll();
                    System.out.print("Güncellemek istediğiniz Id yi seçin: ");
                    userChoice = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Yeni Teknoloji Adı: ");
                    teknolojiAdı = scanner.nextLine();
                    System.out.print("Programlama Dili: ");
                    programlamaDili = scanner.nextLine();
                    technologyService.update(new Technology(userChoice,teknolojiAdı,programlamaDili));
                    System.out.println(userChoice  +"Id ye ait teknoloji Güncellendi.");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Yanlış Seçim Yaptınız.");
            }
        }
    }









}
