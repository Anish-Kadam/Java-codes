// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class longestSubsequence {
    public static void main(String[] args) {
     String s1= "BABABA";
     String s2= "ABCABC";
     
     int lens1= s1.length() + 1;
     int lens2 = s2.length() + 1;
     int [][] dp = new int[lens1][lens2];
     
     for (int i=0; i < lens1;i++){
         dp[i][0]=0;
     }
     for (int i=0; i < lens2;i++){
         dp[0][i]=0;
     }
     for(int i = 1;i<lens1;i++){
         for(int j = 1; j<lens2;j++){
             if(s1.charAt(i-1)==s2.charAt(j-1)){
                 dp[i][j] = dp[i-1][j-1]+1;
             }
             else{
                 dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
             }
         }
     }
     
     
     for(int i = 0;i<lens1;i++){
         for (int j = 0;j<lens2;j++){
             System.out.print(dp[i][j] + " ");
             
         }
         System.out.println();
     }
     System.out.println("Max possible Substring - "+ dp[lens1-1][lens2-1]);
    }
    
    
}
