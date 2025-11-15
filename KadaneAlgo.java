import java.util.*;
public class KadaneAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }


        int max_end_here=0;
        int max_so_far=0;
        for(int i=1; i< n;i++){
            max_end_here = Math.max(arr[i],max_end_here+ arr[i]);
            max_so_far=Math.max()
        }


        for (int i=0;i<n;i++){
            System.out.println(arr[i]);

        }
    }
    
    
}
