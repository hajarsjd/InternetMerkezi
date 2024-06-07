import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
2. InternetMerkəzi adlı bir sinif yarat.Bu sinif müştərilərin hesab məlumatlarını və əməliyyatlarını idarə edir.
HashMap-da müştərilərin adları və balansları saxlanılır, ArrayList isə aktiv hesabların siyahısını saxlayır.
Əməliyyatlar arasında yeni hesab yaratmaq, balansı artırmaq və azaltmaq var.
-hesab yaradarken müştərini həm müstəri siyahisina həm də aktiv hesablara əlave etmək lazimdir.
-Balansi artirarken evvelce musterinin siyahda olub olmadini yoxlamaq,eger müsteri siyahi da varsa balansini artirib
yeni balansla birlikde yeniden müşterini siyahiya elave etmek lazimdir.
-balansi azlatdiqda da musterinin siyahda olub olmadini yoxlamaq ve eger musterinin cari balansi verilen
mebleqden coxdursa o zaman müşterinin balansı azaldılsın əks halda müştəriyə bildiriş mesajı verin.
 */
//
//        InternetMerkez internetMerkez = new InternetMerkez();
//
//        while(true){
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Create new account: -- 1 ");
//            System.out.println("Increase your account: -- 2 ");
//            System.out.println("Decrease your account: -- 3 ");
//            System.out.println("Exit: -- 0 ");
//
//            int choice = scanner.nextInt();
//            switch (choice){
//                case 1:
//                    internetMerkez.newAccount();
//                    break;
//                case 2:
//                    internetMerkez.increase();
//                    break;
//                case 3:
//                    internetMerkez.decrease();
//                    break;
//                case 0:
//                    return;
//                default:
//                    System.out.println("Error");
//            }
//        }

        /*
1. Film Collection
ArrayList, HashSet, və HashMap-dən istiafdə olunacaq.
Burada Online Film Managment sistemi simulasiya olunacaq.
-Burada bir Film class-miz var(hansi ki database-de bu class-in obyektleri saxlanacaq)
-Film class-da olan field-lar
--filmAdi
--janr
--il
-FilmCollection deye bir classimiz var.Və burada
--Filmləri ArrayList-də saxlayın
--Eyni adda olan filmləri təkrarlamamaq üçün HashSet istifadə edin.
--Filmləri janra görə qruplaşdırmaq üçün HashMap istifadə edin.
--Bu class-da yazacagiz metodlarin gorduyu isler:
Film əlavə et
Film sil
Janra görə filmləri göstər
Bütün filmləri göstər

         */


        FilmCollection film = new FilmCollection();
        while(true){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Add new films: -- 1 ");
            System.out.println("Remove films: -- 2 ");
            System.out.println("Show films by genre: -- 3 ");
            System.out.println("Show all films : -- 4 ");
            System.out.println("Exit: -- 0 ");

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    film.addFilm();
                    break;
                case 2:
                    film.removeFilm();
                    break;
                case 3:
                    film.searchFilm();
                    break;
                case 4:
                    film.allFilm();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Error");
            }
        }




    }
}