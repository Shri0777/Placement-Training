public class Ascend{
    public static void main(String[]args){
        int[] numbers = {10,20,38,35,50,63,58,25};
        for (int number : numbers){
            System.out.print(number + " ");
        }
        int temp;
        int left = 0;
        int right = numbers.length-1;
        System.out.println();
        while (left < right){
            temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
        for (int number : numbers){
            System.out.print(number + " ");
        }
        
    }
}
