package DailyTest;



import java.util.Scanner;

/**
 * Create by mr.wl on 2017/8/19
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0 ; i< n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){

            }
        }

    }
}
