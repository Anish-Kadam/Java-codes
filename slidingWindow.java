import java.util.*;
public class slidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int max = 0;
        for(int i1=2;i1<=n-1;i1++){
            if(arr[i1-2]+arr[i1-1]+arr[i1]>max)
            max = arr[i1-2]+arr[i1-1]+arr[i1];
        }
        System.out.println(max);
        sc.close();

    }
}
