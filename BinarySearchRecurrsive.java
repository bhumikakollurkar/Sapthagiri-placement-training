public class BinarySearchRecurrsive {

    static int binarySearch(int arr[], int low, int high, int key) {
        if (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                return binarySearch(arr, low, mid - 1, key);
            else
                return binarySearch(arr, mid + 1, high, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        int key = 7;

        System.out.println(binarySearch(arr,0,arr.length-1,key));
    }
}