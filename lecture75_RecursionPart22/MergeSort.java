package dsa.com.lecture75_RecursionPart22;

public class MergeSort { //Divide & conquer method

    public static void merge(int[] arr, int l, int r, int mid){
        int leftArrLen = mid - l+1;
        int rightArrLen = r - mid;

        int[] leftArr = new int[leftArrLen];
        int[] rightArr = new int[rightArrLen];

        //copy the left haf content of arr into leftArr
        int k = l;
        for (int i = 0; i < leftArrLen; i++) {
            leftArr[i] = arr[k];
            k++;
        }

        //copy the right half of arr content into rightArr
        k = mid + 1;
        for (int j = 0; j < rightArrLen; j++) {
            rightArr[j] = arr[k];
            k++;
        }

        //merge exact logic
        int i = 0;
        int j = 0;
         k = l;
        while (i<leftArrLen && j<rightArrLen){
            if(leftArr[i] < rightArr[j]){
                arr[k] = leftArr[i];
                i++;
                k++;
            }
            else {
                arr[k] = rightArr[j];
                j++;
                k++;
            }
        }

        //if left array fully consumed and right not
        //then copy rem elements of right array into ans array
        while (j < rightArrLen){
            arr[k] = rightArr[j];
            j++;
            k++;
        }


        //if right array fully consumed and left not
        //then copy rem elements of left array into ans array
        while (i < leftArrLen){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
    }
    public static void mergeSort(int[] arr , int l , int r){

        //base case
        if(l >= r){

            //invalid array single element
            return;
        }

        //break into two halves
        int mid = (l+r)/2;
        //let's sort the left array - recursion
        mergeSort(arr,l,mid);

        //let's sort the right array
        mergeSort(arr,mid+1,r);

        //merge both the halves
        merge(arr,l,r,mid);
    }


    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int l = 0;
        int r = arr.length - 1;

        mergeSort(arr,l,r);
        System.out.println("After using Merge Sort : " );

        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}
