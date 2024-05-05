public class RowColumnSorted {
    public void search(int[][] arr,int n,int x){
        int i=0,j=n-1;
        while (i<n&& j>=0) {
            if(arr[i][j]==x){
                System.out.println("found at index "+i+" "+j);
                return;
            }  
            if(arr[i][j]>x){
                j--;
            }
            else
            {
                i++;
            }
        }
        System.out.println("not found");
    }
    public void spiral(int[][] arr,int r,int c){
        int k=0;//row
        int j=0;//colunm
        while(k<r&&j<c){

            for(int i=j;i<c;i++){
                System.out.print(arr[k][i] +" ");
            }
            k++;
            for(int i=k;i<r;i++){
                System.out.print(arr[i][c-1]+ " ");
            }
            c--;
            if(k<r){
                for(int i=c-1;i>=j;i--){
                    System.out.print(arr[r-1][i]+ " ");
                }
                r--;
            }
            if(j<c){
                for(int i=r-1;i>=k;i--){
                    System.out.print(arr[i][j]+" ");
                }

                j++;
            }

        }

    }
    public static void main(String[] args) {
        int[][] arr={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,51},
        };
        RowColumnSorted mat=new RowColumnSorted();
        mat.search(arr, 4, 32);
        mat.spiral(arr, 4, 04);
    }
    
}
