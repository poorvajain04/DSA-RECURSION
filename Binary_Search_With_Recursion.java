import java.util.*;
public class Binary_Search_With_Recursion {
    public static int binarySearch(int[] arr,int start, int end,int target){
        Arrays.sort(arr);
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(target>arr[mid]){
            return binarySearch(arr,mid+1,end,target);
        }
        else if(target<arr[mid]){
            return binarySearch(arr,start,mid-1,target);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={7,3,6,4,2,1,-3};
        int start=0;
        int end=arr.length-1;
        int target=4;
        System.out.println(binarySearch(arr,start,end,target));
    }
}
