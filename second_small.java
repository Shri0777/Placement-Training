public class second_small{
    public static void main(String[]args){
        int[] arr = {10,20,15,50,30,40};
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print(arr[1]);
    }
}
