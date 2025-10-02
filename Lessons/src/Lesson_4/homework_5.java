package Lesson_4;
import java.util.Scanner;

public class homework_5 {
    public static void main(String[] args) {

//        Task 5 - (sandıq kilidi oyunu, çətin):
//
//        Sandıq açarı 4 rəqəmli ədəd (kodda əllə təyin edin).
//        İstifadəçi üçün bu kodu tapmağa menyu ilə imkan verin.
//
//                Menyu aşağıdakı kimi olmalıdır:
//        Daxil etdiyiniz kod: (bu hissəyə istifadəçi rəqəmləri seçdikcə yeni rəqəm düşəcək).
//        Hazırki rəqəm: 1 (növbəti rəqəmi yığmağa keçdikdə bu ədəd bir vahid artmalıdır,
//        4 rəqəm var deyə bu ədəd 4-ə kimi (daxil olmaqla) getməlidir).
//        Aşağıdakılardan birinə basın:
//        1 (artır) - (seçilən ədədin bir vahid artırılması yerinə yetirilməlidir.
//        Əgər ədəd 9-a bərabərdirsə, 0 ilə əvəzlənməlidir)
//        2 (azalt) - (seçilən ədədin bir vahid azaldılması yerinə yetirilməlidir.
//        Əgər ədəd 0-a bərabərdirsə, 9 ilə əvəzlənməlidir)
//        3 (növbəti rəqəmə keç) - (sıradakı növbəti rəqəmi dəyişdirməyə keçməlidir proqram,
//        əgər son (4-cü) rəqəmdə idisə, ekrana müvafiq xəta mesajı çıxmalıdır və heç bir dəyişiklik baş verməməlidir)
//        4 (öncəki rəqəmə keç) - (sıradakı öncəki rəqəmi dəyişdirməyə keçməlidir proqram,
//        əgər ilk (1-ci) rəqəmdə idisə, ekrana müvafiq xəta mesajı çıxmalıdır və heç bir dəyişiklik baş verməməlidir)
//        0 (kodu yoxla) - İstifadçi tərəfindən seçilmiş rəqəmlərin yaratdığı ədədi kodla müqayisə etməlidir proqram və
//        düzdürsə, uğur mesajı ekrana çıxmalıdır. Səhvdirsə, xəta mesajı çıxmalıdır və proqram sonlanmalıdır.
//        Proqramın işləmə nümunəsi üçün aşağıdakı videonu izləyə bilərsiniz.

//            1 - reqemi artir
//            2 - reqemi azalt
//            3 - novbeti reqeme kec
//            4 - onceki reqeme kec
//            5 - kodu yoxla

        Scanner input = new Scanner(System.in);

//        System.out.println("Eded daxil edin: ");
//        String eded = input.next();;
//        boolean dogru = eded.equals("5");
//        System.out.println(dogru);

        String sifre = "1234";
        int n1 = 0, n2=0, n3=0, n4=0;
        String yeni_sifre = "" + n1 + n2 + n3 + n4;
        int hazirki_reqem = 0;
        boolean dogru = false;
        int secim;

        while(true){
            System.out.println("Seyfin hazirki veziyyeti: " + yeni_sifre);
            System.out.println("Seyf");
            secim = input.nextInt();
            switch(secim){
                case 1: //reqemi artir
                    if(hazirki_reqem == 0){
                        n1 = (n1+1) % 10;
                    }
                    else if(hazirki_reqem == 1){
                        n1 = (n1+1) % 10;
                    }
                    else if(hazirki_reqem == 2){
                        n1 = (n1+1) % 10;
                    }
                    else if(hazirki_reqem == 3){
                        n1 = (n1+1) % 10;
                    }
                    


            }
        }





    }
}
