public class Min{
public static void main(String[]args){
        int[] numbers = {10,20,30,40,50,60};
        int lowest = numbers[0];
        for (int number : numbers){
            if (number < lowest){
                lowest = number;
            }
        }
        System.out.println("The lowest is " + lowest);
    }
}
