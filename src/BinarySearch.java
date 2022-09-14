
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    static  int binarySearch(int []arr,int x,int low,int high)
     {
         if(high>=low){
             int mid=low+(high-1)/2;
             if (arr[mid]==x) {
                 return mid;
             }
             if(arr[mid]>x){
                 return  binarySearch(arr,x,low,mid-1);
             }
             else {
                 return binarySearch(arr,x,mid+1,high);
             }
         }
         return -1;
     }

    public static int[] addX(int n, int []arr, int x)
    {
        int i;

        // create a new array of size n+1
        int []newarr = new int[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;

        return newarr;
    }
    static void Sort(int [] array){
        System.out.println("Original Array: "
                + Arrays.toString(array));
         Arrays.sort(array);
         System.out.println();
        System.out.println("Sorted Array: "
                + Arrays.toString(array));
     }
     static  int []delete(int[]array,int pos){
       if(array== null || pos<0 || pos>=array.length)
          return array;
       int []arr = new int [array.length-1];
       for(int i=0,k=0;i< array.length;i++){
           if(i==pos)
               continue;
           arr[k++]=array[i];
       }
       return arr;
      }
    public static void main(String[] args) {

        int[] array = {1, 23, 4, 5, 67, 89, 10, 20, 50, 12};
        int n = array.length-1;
        Sort(array);
        Scanner sc =new Scanner(System.in);
        int c= sc.nextInt();
        int result = binarySearch(array,c,0,n-1);
        if (result == -1){
            System.out.println("Element not present");
        }
        else
            System.out.println("Element found at index "
                    + result);

        System.out.println("Adding an element");
        array=addX(n+1,array,c);
        Sort(array);
        System.out.println("Enter the index to be deleted");
        int k= sc.nextInt();
        array=delete(array,k);
        System.out.println("Element Deleted at index: "
                + k);
        System.out.println("deleted Array: "
                + Arrays.toString(array));



    }


}


