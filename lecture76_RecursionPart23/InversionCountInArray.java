package dsa.com.lecture76_RecursionPart23;

public class InversionCountInArray {

        public static int merge(int[] arr, int l, int r, int mid){
            int leftArrLen = mid - l+1;
            int rightArrLen = r - mid;
            int inversionCount = 0;


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
                if(leftArr[i] <= rightArr[j]){
                    arr[k] = leftArr[i];
                    i++;
                    k++;
                }
                else {
                    arr[k] = rightArr[j];
                    j++;
                    k++;

                    inversionCount += (leftArrLen-i);
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
            return inversionCount;
        }

    static int mergeSort(int[] arr , int s, int e){

        //base case
        if(s>e)
            return 0;

        if(s==e)
            return 0;
        //Break in 2 part
        int mid = (s+e)/2;

        //Sort Left Array
        int leftInversions = mergeSort(arr,s,mid);

        //sort right side

       int rightInversions =  mergeSort(arr,mid+1,e);

        //merge both sorted array
        int intermediateInversions =  merge(arr,s,e,mid);

        return leftInversions + rightInversions + intermediateInversions;
    }

    public static int inversionCount(int[] arr){

        //Brute force approach ---- >> O(n^2) ---- >>TLE
//        int count = 0;
//        for(int i = 0 ;i<arr.length;i++){
//            for(int j = i+1;j< arr.length;j++){
//                if(i<j && arr[i] > arr[j]){
//                    count++;
//                }
//            }
//        }
//        return count;


        //Optimized approach using MergeSort

        int s= 0;
        int e = arr.length-1;

        return mergeSort(arr,s,e);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};
        int[] arr1 = {2,3,4,5,6};
        int[] arr2 = {10,10,10,10};
        System.out.println("Inversion Count of the array is : " + inversionCount(arr));
        System.out.println("Inversion Count of the 2ndArray is : " + inversionCount(arr1));
        System.out.println("Inversion Count of the 3rdArray is : " + inversionCount(arr2));

    }
}
