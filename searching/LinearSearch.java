public class LinearSearch {
    public int linearSearch(int[] arr,int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        LinearSearch ob=new LinearSearch();
        int[] arr={1,5,2,10,45,33,11,53};
        int index=ob.linearSearch(arr,arr.length, 10);
        System.out.println(index);
    }    
}
