import java.util.*;
public class crossstar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char arr[] = new char[n];
        for(int i = 0;i<n;i++){
            for(int j = n-1;j==i;j--){
                arr[i] = '*';
                arr[j] = '*';
                System.out.println(arr[i]);
                System.out.println(arr[j]);

                
            }
        }
    }
}
