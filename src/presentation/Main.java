package presentation;


import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {

        ProgrammingLangProcess programmingLangProcess = new ProgrammingLangProcess();
        TechnologiesProcess technologiesProcess = new TechnologiesProcess();


        int userChoice;
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("Lütfen bir seçenek seçin\n1 - Teknoloji işlemleri\n2 - Programlama Dili İşlemleri\n3 - Çıkış\n");
            userChoice = scanner.nextInt();
            scanner.nextLine();
            switch (userChoice)
            {
                case 1:
                    technologiesProcess.Cases();
                    break;
                case 2:
                    programmingLangProcess.Cases();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Yanlış Seçim Yaptınız.");
            }
        }

    }
}