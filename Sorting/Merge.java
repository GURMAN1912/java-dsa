public class Merge {
    public int[] merge(int[] a,int [] b ,int n1,int n2){
        int[] result =new int[n1+n2];
        int i=0;
        int j=0;
        int k=0;
        while(i<n1 &&j<n2){
            if(a[i]<b[j]){
                result[k]=a[i];
                i++;
                
            }
            else{
                result[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            result[k]=a[i];
            k++;
            i++;
        }
        while(j<n2){
            result[k]=b[j];
            k++;
            j++;
        }
        return result;
    }
    public void printArray(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        } 
        System.out.println();
    }
    public static void main(String[] args) {
        Merge ob=new Merge();
        int[] arr1={1,3,5,7};
        int[] arr2={2,4,6,8};
        int[] result=ob.merge(arr1, arr2,arr1.length,arr2.length);
        ob.printArray(arr1);
        ob.printArray(arr2);
        ob.printArray(result);
    }
    
    
}
