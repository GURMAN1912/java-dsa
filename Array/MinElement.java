public class MinElement {
    public int minimum(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        MinElement obj=new MinElement();
        int[] arr={4,72,80,5,54,3,9};
        int min=obj.minimum(arr);
        System.out.println("Minimin element in the given array: "+min);
    }
}
