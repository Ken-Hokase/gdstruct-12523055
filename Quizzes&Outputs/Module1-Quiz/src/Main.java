//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int[] numbers = new int[10];


    initializenumbers(numbers);

    System.out.println("before bubble sort");
    printArrayElements(numbers);

    System.out.println("\nafter bubble sort reversed");
    bubbleSortReversed(numbers);
    printArrayElements(numbers);

//reinitialize for selectionsort
    initializenumbers(numbers);
    System.out.println("\n\nnow we try with le selection sort :>");
    printArrayElements(numbers);
    System.out.println("\nafter Selection Sort Reversed");
    selectionSortReversed(numbers);
    printArrayElements(numbers);
}

private static void initializenumbers(int[] numbers)
{
    numbers[0] = 12;
    numbers[1] = -3;
    numbers[2] = 23;
    numbers[3] = -9;
    numbers[4] = 231;
    numbers[5] = 247;
    numbers[6] = 89;
    numbers[7] = 123;
    numbers[8] = 56;
    numbers[9] = 91 ;
}
private static void printArrayElements (int[] arr)
{
    for (int j : arr) {
        System.out.print(j + " ");
    }
}
private static void bubbleSortReversed (int[] arr)
{
    for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
    {
        for(int i = 0; i < lastSortedIndex; i++)
        {
            if (arr[i] < arr[i + 1])
            {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
}

private static void selectionSortReversed (int[] arr)
{

    for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
    {
        int smallest = 0;
        for(int i = 0; i <= lastSortedIndex; i++)
        {
            if (arr[i] < arr[smallest])
            {
                smallest = i;
            }
        }
        int temp = arr[lastSortedIndex];
        arr[lastSortedIndex] = arr[smallest];
        arr[smallest] = temp;


    }
}