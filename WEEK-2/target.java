import java.util.*;
public class target{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10,20,40,30,50,60,70};
        System.out.print("Enter element you want to find : ");
        int target = sc.nextInt();
        boolean found = false;
        for (int number :  numbers){
            if (number == target){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("The target element is found");
        }
    }
}
