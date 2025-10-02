package Lesson_5;
import java.util.Scanner;

public class homework_1 {
    public static void main(String[] args) {

//        Task 1:
//        İstifadəçidən N ədədi istəyin və həmin uzunluqda massiv yaradın.
//        Sonra istifadəçidən N sayda ədəd istəyin və bu ədədləri array-a əlavə edin.


        Scanner input = new Scanner(System.in);

        System.out.println("Eded daxil edin: ");
        int eded = input.nextInt();  //5
        int[] massiv = new int[eded];

        //massiv[0] = 1;
        //massiv[0] = eded;

        for(int i=0; i<eded; i++){
            System.out.println("Eded daxil edin: ");
            int elementler = input.nextInt();

            massiv[i] = elementler;

            //System.out.println("[" + i + "]" + " = " + elementler);
            //[0] = 1
        }

        for(int i=0; i<eded; i++){
            System.out.println(massiv[i]);
        }

        //Task 1-də yaradılmış massiv içində ən kiçik və ən böyük ədədi tapın.







    }
}
