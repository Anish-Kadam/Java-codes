import java.util.*;
public class charSum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int l = str.length();
        int sum = 0;
        for(int i =0;i<l-1;i++){
            switch (str.charAt(i)) {
                case 'A':
                sum += 1;
                case 'B':
                sum+=10;
                case 'C':
                sum+=100;
                case 'D':
                sum+=1000;
                case 'E':
                sum+=10000;
                case 'F':
                sum+=100000;
                case 'G':
                sum+= 1000000;

                    
                    break;
            
                default:
                    break;
            }
        }
        System.out.println(sum);
    }
}
