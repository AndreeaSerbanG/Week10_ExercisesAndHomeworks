public class BubbleSort {
    private static void swap ( int [] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static void swap ( double [] arr, int i, int j){
        double tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void swap ( String [] arr, int i, int j){
        String tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

    }

    public static void bubbleSortAsc( double [] arr){
        int iterCnt = 0;
        int checkCnt = 0;
        int swapsCnt = 0;

        int n = arr.length;

        while( n > 1 ){
            int newN = 0;
            iterCnt++;
            for ( int i = 1; i < n; i++){
                checkCnt++;
                if( arr[i-1] > arr[i]){
                    swap(arr, i-1, i);
                    newN = i;
                    swapsCnt++;
                }
            }
            n = newN;
        }
        System.out.println("BubbleSort: Iterations = " + iterCnt
                + "  Swaps = " + swapsCnt
                + "  Checks = " + checkCnt);
    }

    public static void bubbleSortDesc( int [] arr){
        int iterCnt = 0;
        int checkCnt = 0;
        int swapsCnt = 0;

        int n = arr.length;

        while( n > 1 ){
            int newN = 0;
            iterCnt++;
            for ( int i = 1; i < n ; i++){
                checkCnt++;
                if( arr[i-1] < arr[i]){
                    swap(arr, i-1, i);
                    newN = i;
                    swapsCnt++;
                }

            }
            n = newN;
        }
        System.out.println("BubbleSort: Iterations = " + iterCnt
                + "  Swaps = " + swapsCnt
                + "  Checks = " + checkCnt);
    }

    public static void bubbleSortAsc( String [] arr){
        int iterCnt = 0;
        int checkCnt = 0;
        int swapsCnt = 0;

        int n = arr.length;

        while( n > 1 ){
            int newN = 0;
            iterCnt++;
            for ( int i = 1; i < n ; i++){
                checkCnt++;
                if( arr[i-1].compareTo(arr[i]) > 0) {
                    swap(arr, i-1, i);
                    newN = i;
                    swapsCnt++;
                }
            }
            n = newN;
        }
        System.out.println("BubbleSort: Iterations = " + iterCnt
                + "  Swaps = " + swapsCnt
                + "  Checks = " + checkCnt);
    }

    public static void bubbleSortDesc( String [] arr){
        int iterCnt = 0;
        int checkCnt = 0;
        int swapsCnt = 0;

        int n = arr.length;

        while( n > 1 ){
            int newN = 0;
            iterCnt++;
            for ( int i = 1; i < n; i++){
                checkCnt++;
                if( arr[i-1].compareTo(arr[i]) < 0) {
                    swap(arr, i-1, i);
                    newN = i;
                    swapsCnt++;
                }

            }

            n = newN;
        }
        System.out.println("BubbleSort: Iterations = " + iterCnt
                + "  Swaps = " + swapsCnt
                + "  Checks = " + checkCnt);
    }
    public static void bubbleSortAscLength( String [] arr){
        int iterCnt = 0;
        int checkCnt = 0;
        int swapsCnt = 0;

        int n = arr.length;

        while( n > 1 ){
            int newN = 0;
            iterCnt++;
            for ( int i = 1; i < n; i++){
                checkCnt++;
                if( arr[i-1].length() > arr[i].length()) {
                    swap(arr, i-1, i);
                    newN = i;
                    swapsCnt++;
                }

            }
            n = newN;
        }
        System.out.println("BubbleSort: Iterations = " + iterCnt
                + "  Swaps = " + swapsCnt
                + "  Checks = " + checkCnt);
    }
}
