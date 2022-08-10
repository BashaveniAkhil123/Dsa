class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String>arr=new ArrayList<String>();
        String str="";
        helper(m,n,0,0,arr,str);
         return arr;
        
    }
    static void helper(int[][] m,int n,int i,int j,ArrayList<String>arr,String str){
        if(i==m.length || j==m[0].length  || i<0 || j<0 || m[i][j]!=1){
            return ;
        }
        
        
        if(i==n-1 && j==n-1 ){
           // System.out.println(i+" "+j);
            arr.add(str);
            return;
        }
        
       
        m[i][j] = 0;
        
        helper(m,n,i+1,j,arr,str+'D');
        helper(m,n,i,j-1,arr,str+'L');
        helper(m,n,i-1,j,arr,str+'U');
        helper(m,n,i,j+1,arr,str+'R');
        
        m[i][j] = 1;
    }
    
    
}
