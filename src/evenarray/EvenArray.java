
package evenarray;

import java.util.Arrays;
import java.util.Random;

public class EvenArray {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        int counter = 0;
        while(counter < 10){
            int a = random.nextInt(50);
            if(a%2 == 0){
               numbers[counter] = a;
               counter++;
            }
        }
        System.out.print(Arrays.toString(numbers));
    }
    
}
