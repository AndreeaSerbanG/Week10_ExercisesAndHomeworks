public class SelectionSort {
    public static void selectionSort( String [] arr){
        int swapsCnt = 0;
        int checksCnt = 0;

        for( int i = 0; i < arr.length-1; i++){
            int posMin = i;
            for ( int j = i+1; j < arr.length; j++){
                checksCnt++;
                if ( arr[j].length() < arr[posMin].length()){
                    posMin = j;
                }
            }
            if(posMin != i){
                BubbleSort.swap(arr, i, posMin);
                swapsCnt++;
            }
        }
        System.out.println("SelectionSort: Swaps = " + swapsCnt
                + "  Checks = " + checksCnt);
    }
}
