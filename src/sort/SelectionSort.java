package sort;
// It maintains two subarray for the given array.
//The subarray is already sorted.
//And the second subarray is unsorted.
//With every iteration of selection sort, an element is picked from the unsorted subarray and moved to the sorted subarray.
//time complexity O(n^2) and space complexity O(1)
public class SelectionSort {

    public static void print(int[] listToSort){
        for(int el : listToSort){
           System.out.println(el+ " ");
        }
        System.out.println();
    }

    public static void swap(int[] listToSort, int iIndex, int jindex){
        int temp = listToSort[iIndex];
        listToSort[iIndex] = listToSort[jindex];
        listToSort[jindex] = temp;
    }

    public static void selectionSort(int[] listToSort){
        for(int i = 0; i<listToSort.length; i++) {
            for(int j = i+1; j<listToSort.length; j++){
                if(listToSort[i]>listToSort[j]){
                    swap(listToSort, i, j);
                    print(listToSort);
                }
            }
        }
    }

    public static void main (String[] args) {
        int[] listToSort = {1, 4 , 2 ,9, 3};
        selectionSort(listToSort);
    }
}

/*
public class SelectionSortExample {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String a[]){
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        selectionSort(arr1);//sorting array using selection sort

        System.out.println("After Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}  */
