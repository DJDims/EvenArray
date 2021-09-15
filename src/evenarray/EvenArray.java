
package evenarray;

import java.util.Arrays;
import java.util.Random;

public class EvenArray {

    public static void main(String[] args) {
        Random random = new Random();
        
        int[] numbers = new int[10];
        int counter = 0;
        
        //Заполнить массив четными числами
        while(counter < 10){
            int a = random.nextInt(50);
            if(a%2 == 0){
               numbers[counter] = a;
               counter++;
            }
        }
        System.out.println("Массив = " + Arrays.toString(numbers));
        //Заполнить массив четными числами
        
        //----- Поиск максимального значения
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Максимальное значение = " + max);
        //----- Поиск максимального значения

        //----- Поиск минимального значения
        int min = max;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Минимальное значение = " + min);
        //----- Поиск минимального значения

        //----- Среднее
        
        int countofmax = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max) {
                countofmax++;
            }
            
        }
        System.out.println("Количество максимальных значений"+countofmax);
        
        int countofmin = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == min) {
                countofmin++;
            }
            
        }
        System.out.println("Количество минимальных значений"+countofmin);
        
        int[] newnumbers = new int[numbers.length-(countofmin+countofmax)];
                System.arraycopy(numbers, countofmin, newnumbers, 0, 6);
        System.out.println(Arrays.toString(newnumbers));
        
//        int mid = 0;
//        int count = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == max || numbers[i] == min) {
//                continue;
//            }
//            mid += numbers[i];
//            count++;
//        }
//        System.out.println("Среднее = " + mid / count);
    }
}
