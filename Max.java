public class Max{
    public static void main(String[]args){
        int[] numbers = {10,20,30,40,50,60};
        int highest = numbers[0];
        for (int number : numbers){
            if (highest < number){
                highest = number;
            }
        }
        System.out.print("The largest element is " + highest);
    }
}
