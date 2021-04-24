package Heap;

public class DeleteFromHeap {
    public static void main(String[] args) {
        int[] A = {15, 8, 4, 3, 22};//{33,8,9,10}
        int n = A.length;
        System.out.println("initial Length"+ n);
        creatMaxHeap(A, n);
       removeMax(A,n);
        for (int i = 0; i < A.length-1; i++) {
            System.out.println(A[i]);
        }

    }

    public static void removeMax(int A[], int n){
        A[0]=A[A.length-1];//take last element and assign to first element and perform max heapify
        n = A.length-1;
        System.out.println("final Length"+ n);
        maxHepify(A, n);

    }

    public static void maxHepify(int A[], int n){
        int i=0;
       int left = 2*i+1;
       int rigth = 2*i+2;
       int largest = i;
        if(left<n && A[left]>A[largest]){
            largest = left;
        }else{
            largest = i;
        }
        if(rigth<n && A[rigth]>A[largest]){
            largest = rigth;
        }
        if(largest!=i){//swap largest and i
            int temp = A[largest];
            A[largest]= A[i];
            A[i]= temp;
            maxHepify(A, largest);
        }
    }

    public static void creatMaxHeap(int [] A, int n){
        //A[1] assume as largest and start from 2 and insert data
        for(int i=1; i<n;i++){
            inserIntoHeap(A, i);//pass index and Array
        }

    }

    public static void inserIntoHeap(int []A, int i){
        int temp = A[i];
        while(i>0 && temp > A[(i-1)/2]){
            A[i] = A[(i-1)/2];
            i=(i-1)/2;
        }
        A[i]=temp;
    }
}
