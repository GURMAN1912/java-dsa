public class RemoveEven {
    public int[] RemoveEvenNumber(int[] arr){
        int n=arr.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                c++;
            }
        }
        int[] result=new int[c];
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                result[index]=arr[i];
                index++;
            }
        }
        return result;
    }
    public void printArray(int[] arr){
        int n =arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int[] arr={3,5,7,2,6,7,46,61};
        RemoveEven obj=new RemoveEven();
        obj.printArray(arr);
        int[] result=obj.RemoveEvenNumber(arr);
        obj.printArray(result);
    }
}
