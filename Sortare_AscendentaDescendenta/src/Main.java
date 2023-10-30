public class Main {
    /* Programul realizeaza prin cele doua metode de sortare(bubble sort si selection sort)
   sortarea unui array de tipul double si a unuia de tipul string, atat in ordine crescatoare, cat si descrescatoare
    */
    private static void printIntArray(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    private static void printDoubleArray(double [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    private static void printStringArray(String [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        //sortare double crescatoare
        double [] arrAsc = { 5.4, 1.2, 4.1, 6.5, 2.4, 8.7, 5.5, 7.9, 1.0, 4.5, 2.3, 7.7, 8.5, 9.3};

        System.out.println( " Ex 1.1 Sortare Double crescator");
        printDoubleArray(arrAsc);
        BubbleSort.bubbleSortAsc(arrAsc);
        printDoubleArray(arrAsc);

        System.out.println();

        //sortare int descrescatoare
        int [] arrDesc = { 5, 1, 4, 6, 24, 87, 55, 7, 1, 45, 23, 77, 8, 9};

        System.out.println( " -> Ex 2.1 Sortare Int descrescator");
        printIntArray(arrDesc);
        BubbleSort.bubbleSortDesc(arrDesc);
        printIntArray(arrDesc);

        System.out.println();

        //sortare string alfabetic
        String [] arrStringAsc = { "Andreea", "Gigi", "Roxana", "Bogdan", "Mirela", "Liviu", "Anastasia", "Matei"};

        System.out.println( " -> Ex 1.2 Sortare String crescator alfabetic");
        printStringArray(arrStringAsc);
        BubbleSort.bubbleSortAsc(arrStringAsc);
        printStringArray(arrStringAsc);

        System.out.println();

        //sortare String descrescatoare alfabetic
        String [] arrStringDesc = { "Andreea", "Gigi", "Roxana", "Bogdan", "Mirela", "Liviu", "Anastasia", "Matei"};

        System.out.println( " -> Ex 2.2 Sortare String descrescator alfabetic");
        printStringArray(arrStringDesc);
        BubbleSort.bubbleSortDesc(arrStringDesc);
        printStringArray(arrStringDesc);

        System.out.println();

        //sortare String crescatoare in fct de lungimea cuvintelor - BubbleSort
        String [] arrStringLen1 = { "Andreea", "Gigi", "Roxana", "Bogdan", "Mirela", "Liviu", "Anastasia", "Matei"};

        System.out.println( " -> Ex 3.1 Sortare prin metoda bulelor - ordonare crescatoare a stringurilot in fct de lungime");
        printStringArray(arrStringLen1);
        BubbleSort.bubbleSortAscLength(arrStringLen1);
        printStringArray(arrStringLen1);


        System.out.println();

        //sortare String crescatoare in fct de lungimea cuvintelor - SelectionSort
        String [] arrStringLen2 = { "Andreea", "Gigi", "Roxana", "Bogdan", "Mirela", "Liviu", "Anastasia", "Matei"};

        System.out.println( " -> Ex 3.2 Sortare prin selectie - ordonare crescatoare a stringurilot in fct de lungime");
        printStringArray(arrStringLen2);
        SelectionSort.selectionSort(arrStringLen2);
        printStringArray(arrStringLen2);

    }
}
