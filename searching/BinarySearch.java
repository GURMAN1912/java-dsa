public class BinarySearch {
    public int binarySearch(int[] arr,int n,int x){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(x<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }   
    public static void main(String[] args) {
        BinarySearch ob=new BinarySearch();
        int[] arr={1,2,5,9,11,23,40,43};
        System.out.println(ob.binarySearch(arr, arr.length, 40));
    } 
}
