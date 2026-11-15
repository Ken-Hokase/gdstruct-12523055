//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int[] numbers = new int[10];

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


System.out.println("before bubble sort");
printArrayElements(numbers);

System.out.println("\nafter bubble sort");
selectionSort(numbers);
printArrayElements(numbers);



}
private static void printArrayElements (int[] arr)
{
    for (int j : arr) {
         System.out.print(j + " ");
    }
}
private static void bubbleSort (int[] arr)
{
    for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
    {
        for(int i = 0; i < lastSortedIndex; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
}

private static void selectionSort (int[] arr)
{

    for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
    {
        int largest = 0;
        for(int i = 0; i < lastSortedIndex; i++)
        {
            if (arr[i] > arr[largest])
            {
                largest = i;
            }
        }
        int temp = arr[lastSortedIndex];
        arr[lastSortedIndex] = arr[largest];
        arr[largest] = temp;


    }
}