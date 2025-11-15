

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        for(int i=m;i<=n;i++){
                if(n>=100)
                System.out.printf("%03d ",i);
                else if(n>=10)
                System.out.printf("%02d ", i);
                else
                System.out.printf("%d ", i);
        }


    }
}