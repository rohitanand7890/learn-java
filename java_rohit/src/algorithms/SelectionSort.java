package algorithms;


public class SelectionSort {
    public static void selectionSort(int[] ar){
        for (int i = 0; i < ar.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < ar.length; j++){
                if (ar[j] < ar[index]){
                    index = j;
                }
            }
            int smallerNumber = ar[index];
            ar[index] = ar[i];
            ar[i] = smallerNumber;
        }
    }

    public static void main(String a[]){
        int[] ar = {9,14,3,2,43,11,58,22};
        selectionSort(ar);
        for(int i=0; i < ar.length; i++){
            System.out.print(ar[i] + " ");
        }
    }
}