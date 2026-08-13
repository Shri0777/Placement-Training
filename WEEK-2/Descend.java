public class Descend{
    public static void main(String[]args){
        int[] numbers = {10,30,20,35,40,50};
        for (int number : numbers){
            System.out.print(number + " ");
        }
        int temp;
        System.out.println();
        for (int i = 0 ; i < numbers.length-1 ; i++){
            for (int j = 0 ; j < numbers.length - 1 - i ; j++){
                if (numbers[j] < numbers[j+1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        for (int number : numbers){
            System.out.print(number + " ");
        }
    }   
}
