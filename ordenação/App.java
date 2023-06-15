package ordenação;

import java.util.Arrays;

public class App {
    public static void main(String[] args){
        int[] teste = {4,0,3,6};

       // BubbleSort bubbleSort = new BubbleSort();
       // bubbleSort.ordenar(teste);
      // System.out.println(Arrays.toString(teste));

       //InsertionShort insertionShort = new InsertionShort();
      // insertionShort.ordenar(teste);
       // System.out.println(Arrays.toString(teste));

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.ordenar(teste);
        System.out.println(Arrays.toString((teste)));

        //MergeSort mergeSort = new MergeSort();
       // mergeSort.ordenar(teste);
       // System.out.println(Arrays.toString(teste));

       // QuickSort quickSort = new QuickSort();
       // quickSort.ordenar(teste);
       // System.out.println(Arrays.toString(teste));


    }

}
