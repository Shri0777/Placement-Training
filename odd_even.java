public class odd_even{
    public static void main(String[]args){
        int[] numbers = {10,5,6,8,9,20};
        int odd = 0;
        int even = 0;
        for (int number : numbers){
            if (number % 2 == 0){
                even++;
            }
            else {
                odd++ ;
            }
        }
        System.out.println("The number of even numbers is " + even);
        System.out.println("The number of odd numbers is " + odd);
    }
}
