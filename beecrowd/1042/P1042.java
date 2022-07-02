import java.util.Scanner;

public class P1042 {
    /**
     * 
     * @param arr array to be sorted;
     * @return sorted array;
     */
    private static int[] boobleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr.length - i - 1; j++) {
                
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
  
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        int[] sorted = new int[3];
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        s.close();

        sorted[0] = a;
        sorted[1] = b;
        sorted[2] = c;

        boobleSort(sorted);

        for(int i : sorted){
            System.out.println(i);
        }
        
        System.out.println();
        
        System.out.printf("%d\n%d\n%d\n",a,b,c);
        
    }
    
}
