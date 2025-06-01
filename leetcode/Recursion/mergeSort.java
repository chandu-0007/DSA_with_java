/*
  recursion which understand the divde and conquie in recursion 
  exmaplw is merge sort 
*/
import java.util.Arrays;
public class mergeSort {
    public static int[] merge(int []arr1 ,int [] arr2) {
        int [] ans = new int[arr1.length +arr2.length];
        int i= 0 ,j=0 , k=0;
        while (i<arr1.length && j<arr2.length) {
            if(arr1[i] <=arr2[j]){
                ans[k++] = arr1[i];
                i++;
            }else{
                ans[k++] = arr2[j];
                j++; 
            }
        }
        while (i<arr1.length) {
            ans[k++] = arr1[i++];
        }
        while (j<arr2.length) {
            ans[k++] = arr2[j++];
        }
        return ans; 
    }
    public static int[] sort(int[] arr){
        if(arr.length <= 1) return arr ; 
        int l = 0 ,r = arr.length , mid = l+(r-l)/2 ; 
        System.out.println(Arrays.toString(arr));
        int arr1[] = sort(Arrays.copyOfRange(arr,l,mid));
        int arr2[] = sort(Arrays.copyOfRange(arr, mid, r));
        return merge(arr1,arr2);
    }
    public static void main(String [] args){
         int arr[] = {2,3,1,4,1,3,2,4};
         int res[] = sort(arr);
         for(int i :res){
        System.out.print(i+" ");}
    }
}