


class FlyodWarshall {
    final static int INF = 100000;
    public static void calculate(int[][] matrix, int V){
        for(int k=0;k<V;k++){
            for(int i=0;i<V;i++){
                for(int j=0;j<V;j++){
                    if(matrix[i][k]< INF && matrix[k][j]< INF)
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                    
                }
            }
        }
    }
    public static void main(String[] args) {
     int V = 4;
     int[][]matrix = {
         {0,3,INF,5},
         {2,0,INF,4},
         {INF,1,0,INF},
         {INF,INF,2,0}
         };
         calculate(matrix, V);
         
         for(int i=0;i<V;i++){
             for(int j=0;j<V;j++){
                 if(matrix[i][j]==INF){
                     System.out.print("INF"+" ");
                 }
                 else {
                     System.out.print(matrix[i][j]+ " ");
                 }
                
             }
             System.out.println();
         }
     }
    }
