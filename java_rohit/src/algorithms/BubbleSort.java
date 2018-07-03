package algorithms;

public class BubbleSort {
    static void bubbleSort(int[] ar) {
        int n = ar.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(ar[j-1] > ar[j]){
                    temp = ar[j-1];
                    ar[j-1] = ar[j];
                    ar[j] = temp;
                }

            }
        }

    }
    public static void main(String[] args) {
        int ar[] ={3,60,35,2,45,320,5};
        bubbleSort(ar);
        for(int i=0; i < ar.length; i++){
            System.out.print(ar[i] + " ");
        }

    }
}