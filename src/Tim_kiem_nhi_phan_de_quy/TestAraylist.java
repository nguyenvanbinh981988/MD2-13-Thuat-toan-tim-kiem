package Tim_kiem_nhi_phan_de_quy;

public class TestAraylist {
    public static void main(String[] args) {
        int[] array = {25, 28, 81, 15, 10, 26, 59, 24, 35, 66, 49, 35, 18, 92, 56};
        bubbleSort(array);
        for (int i:array) {
            System.out.print(i+ " ");
        }
        System.out.println("\nphan tu can tim co index sau sap xep la: " +binarySearch(array,0,array.length,66));
    }

    public static int[] bubbleSort (int[] array){
        boolean needNextPass = true;
        for (int k = 1; k < array.length && needNextPass; k++) {
                needNextPass = false;
                for (int i = 0; i < array.length - k; i++) {
                    if (array[i] > array[i + 1]) {
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        needNextPass = true;
                    }
                }
            }
        return array;
        }


        public static int binarySearch ( int[] array, int left, int right, int value){
            if (right >= left) {
                int mid = (left + right) / 2;
                if (value == array[mid]) {
                    return mid;
                } else if (value < array[mid]) {
                    return binarySearch(array, left, mid - 1, value);
                } else {
                    return binarySearch(array, mid + 1, right, value);
                }
            }
            return -1;
        }
    }
