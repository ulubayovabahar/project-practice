package Lesson_5;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//        int[] numbers = {10, 20, 30, 40, 50};
//        System.out.println(numbers[4]);

//        //Massiv elan et (DECLARATION)
//        int[] numbers; //Burada sadəcə deyirik ki, “numbers” adlı massiv olacaq, hələ yaddaş ayırmadıq.
//
//        //Yaddas ayir(INSTANTIATION)
//        numbers = new int[5];
//
//        //Deyerleri yaz (INITIALIZATION)
//        numbers[0] = 10;
//        numbers[1] = 20;
//        numbers[2] = 30;
//        numbers[3] = 40;
//        numbers[4] = 50;


//        int[] numbers;
//        numbers = new int[5];
//        numbers[0] = 10;
//        System.out.println(numbers[0]);


//        int[] numbers = new int[5];
//
//        for(int i=0; i<numbers.length; i++){
//            numbers[i]= (i + 1)*10;
//            System.out.println("numbers [" + i + "] = " + numbers[i]);
//        }

        //int[] numbers = {10, 20, 30, 40, 50};

//        for(int i=0; i<numbers.length; i++){
//            numbers[i] = numbers[i] + 5;
//            System.out.println(numbers[i]);
//        }

//        for(int i=0; i<numbers.length; i++){
//            int yeni = numbers[i];
//            yeni = yeni +5;
//            System.out.println(yeni);
//        }


        // f


//        Scanner input = new Scanner(System.in);
//        int arraySize = input.nextInt();
//        int[] newArray =  new int[arraySize];

//        Bir int massivi yaradın: {5, 10, 15, 20, 25}
//        Massivin bütün elementlərini for döngüsü ilə ekrana çıxarın.

//        int[] ededler = {5, 10, 15, 20, 25};
//
//        for(int i=0; i< ededler.length; i++){
//            System.out.println(ededler[i]);
//        }

//        int[] ededler = {5, 10, 15, 20, 25};
//        for(int eded : ededler){
//            System.out.println(eded);
//        }

//        Tapşırıq:
//        Massivdəki bütün ədədləri toplayın və cəmini ekrana çap edin.
//        Məsələn, {2, 4, 6, 8} → cəmi = 20

//        int[] ededler = {2, 4, 6, 8};
//        int cem = 0 ;
//
//        for(int i=0; i< ededler.length; i++){
//            cem += ededler[i];
//        }
//        System.out.println(cem);
//
//        for(int eded : ededler){
//            cem+=eded;
//        }
//        System.out.println(cem);

//        Tapşırıq:
//        int[] numbers = {1,2,3,4,5}
//        Hər elementi 2 ilə vurub ekrana çıxarın. (for və ya for-each ilə)


//        int[] ededler = {1, 2, 3, 4, 5};
//
//        for(int eded : ededler){
//            eded*=2;
//            System.out.println(eded);
//        }

//        Tapşırıq:
//        int[] numbers = {12, 7, 22, 5, 18}
//        Massivin ən böyük və ən kiçik elementini tapıb çap edin.

//        int[] ededler = {12, 7, 22, 5, 18};



//        Tapşırıq:
//        int[] numbers = {10, 20, 30, 40}
//        Hər elementin üzərinə 5 gələcək və nəticəni çap edin.

//        String[] fruits = {"mango", "apple", "orange", "cherry", "banana"};
//        //System.out.println(fruits[0]);
//
//        for(int i=0 ; i< fruits.length; i++){
//            System.out.println(fruits[i]);
//        }
//
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }

//        String[] fruits = {"banana", "mango"};
//
//        for(String meyveler : fruits){
//            System.out.println(meyveler + " - " + meyveler.length());
//        }

        int[] numbers = {2, 4, 6, 8, 10};  // numbers[0] + numbers[n]
        int cem =0;

        for(int ededler : numbers){
            cem += ededler;
        }
        System.out.println(cem);


























    }
}
