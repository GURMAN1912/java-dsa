// package searching;

public class SearchInsertPosition {
    public int searchInsertPosition(int[] arr,int n,int x){
        int low=0;
        int high=n-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(x==arr[mid]){
                return mid;
            }            
            if(x>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;//only difference
    }
    public static void main(String[] args) {
        SearchInsertPosition ob=new SearchInsertPosition();
        int[] arr={1,3,5,7};
        System.out.println(
            ob.searchInsertPosition(arr, arr.length, 2)
        );
    }
}
