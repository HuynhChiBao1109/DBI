package Sort;


public class Main {

    public static void main(String[] args) {
        Answer ans = new Answer();
        Employee arr[];
        arr = new Employee[5];

        arr[0] = new Employee();
        arr[1] = new Employee();
        arr[2] = new Employee();
        arr[3] = new Employee();
        arr[4] = new Employee();

        arr[0].setData("A05", "Tran Quang", 7);
        arr[1].setData("A03", "Nguyen An", 7);
        arr[2].setData("A01", "Truong Phung", 5);
        arr[3].setData("A04", "Pham Thi Lam", 2);
        arr[4].setData("A02", "Do Trung Ton", 5);
        System.out.println("----part1----");

        System.out.println("\nSelection sort ASC:");
        ans.selectionSortASC(arr);
        ans.display(arr);
        System.out.println("\nSelection sort DESC:");
        ans.selectionSortDESC(arr);
        ans.display(arr);
        
        System.out.println("\nInsertion sort ASC:");
        ans.insertionSortASC(arr);
        ans.display(arr);
        System.out.println("\nInsertion sort DESC:");
        ans.insertionSortDESC(arr);
        ans.display(arr);
        
        System.out.println("\nBubble sort ASC: ");
        ans.bubbleSortASC(arr);
        ans.display(arr);
        System.out.println("\nBubble sort DESC: ");
        ans.bubbleSortDESC(arr);
        ans.display(arr);
        
        System.out.println("----Part2----");
        System.out.println("Heap sort ASC: ");
        ans.heapSortASC(arr);
        ans.display(arr);
        
        System.out.println("\nHeap sort DESC: ");
        ans.heapSortDESC(arr);
        ans.display(arr);
        
        System.out.println("\nQuick sort ASC: ");
        ans.quickSortASC(arr, 0, arr.length-1);
        ans.display(arr);
        
        System.out.println("\nQuick sort DESC: ");
        ans.quickSortDESC(arr, 0, arr.length-1);
        ans.display(arr);
        
        System.out.println("\nMerge sort ASC: ");
        ans.mergeSortASC(arr, 0, arr.length-1);
        ans.display(arr);
        
        System.out.println("\nMerge sort DESC: ");
        ans.mergeSortDESC(arr, 0, arr.length-1);
        ans.display(arr);
    }

}
