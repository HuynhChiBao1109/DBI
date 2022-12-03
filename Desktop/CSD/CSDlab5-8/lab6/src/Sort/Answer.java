package Sort;


public class Answer {

    static int converToInt(String id) {
        int result = Integer.parseInt(id.substring(1, id.length()));
        return result;
    }

    void selectionSortASC(Employee arr[]) {
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (converToInt(arr[j].getId()) < converToInt(arr[min_idx].getId())) {
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first
            // element
            Employee temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    void selectionSortDESC(Employee arr[]) {
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (converToInt(arr[j].getId()) > converToInt(arr[min_idx].getId())) {
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first
            // element
            Employee temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    void insertionSortASC(Employee arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Employee key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && converToInt(arr[j].getId()) > converToInt(key.getId())) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    void insertionSortDESC(Employee arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Employee key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && converToInt(arr[j].getId()) < converToInt(key.getId())) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    void bubbleSortASC(Employee arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (converToInt(arr[j].getId()) > converToInt(arr[j + 1].getId())) {
                    // swap arr[j+1] and arr[j]
                    Employee temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void bubbleSortDESC(Employee arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (converToInt(arr[j].getId()) < converToInt(arr[j + 1].getId())) {
                    // swap arr[j+1] and arr[j]
                    Employee temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void heapSortASC(Employee arr[]) {
      int n = arr.length;
  
      // Build max heap
      for (int i = n / 2 - 1; i >= 0; i--) {
        heapifyASC(arr, n, i);
      }
  
      // Heap sort
      for (int i = n - 1; i >= 0; i--) {
        Employee temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
  
        // Heapify root element
        heapifyASC(arr, i, 0);
      }
    }
  
    void heapifyASC(Employee arr[], int n, int i) {
      // Find largest among root, left child and right child
      int largest = i;
      int l = 2 * i + 1;
      int r = 2 * i + 2;
  
      if (l < n && converToInt(arr[l].id) > converToInt(arr[largest].id))
        largest = l;
  
      if (r < n && converToInt(arr[r].id) > converToInt(arr[largest].id))
        largest = r;
  
      // Swap and continue heapifying if root is not largest
      if (largest != i) {
        Employee swap = arr[i];
        arr[i] = arr[largest];
        arr[largest] = swap;
  
        heapifyASC(arr, n, largest);
      }
    }
    
    
    public void heapSortDESC(Employee arr[]) {
      int n = arr.length;
  
      // Build max heap
      for (int i = n / 2 - 1; i >= 0; i--) {
        heapifyDESC(arr, n, i);
      }
  
      // Heap sort
      for (int i = n - 1; i >= 0; i--) {
        Employee temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
  
        // Heapify root element
        heapifyDESC(arr, i, 0);
      }
    }
  
    void heapifyDESC(Employee arr[], int n, int i) {
      // Find largest among root, left child and right child
      int largest = i;
      int l = 2 * i + 1;
      int r = 2 * i + 2;
  
      if (l < n && converToInt(arr[l].id) < converToInt(arr[largest].id))
        largest = l;
  
      if (r < n && converToInt(arr[r].id) < converToInt(arr[largest].id))
        largest = r;
  
      // Swap and continue heapifying if root is not largest
      if (largest != i) {
        Employee swap = arr[i];
        arr[i] = arr[largest];
        arr[largest] = swap;
  
        heapifyDESC(arr, n, largest);
      }
    }
    
    
    static void swap(Employee[] arr, int i, int j)
    {
        Employee temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
  
    static int partitionASC(Employee[] arr, int low, int high)
    {
  
        // pivot
        Employee pivot = arr[high];
  
        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);
  
        for (int j = low; j <= high - 1; j++) {
  
            // If current element is smaller
            // than the pivot
            if (converToInt(arr[j].id) < converToInt(pivot.id)) {
  
                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
  
    
    static void quickSortASC(Employee[] arr, int low, int high)
    {
        if (low < high) {
  
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partitionASC(arr, low, high);
  
            // Separately sort elements before
            // partition and after partition
            quickSortASC(arr, low, pi - 1);
            quickSortASC(arr, pi + 1, high);
        }
    }
    
    static int partitionDESC(Employee[] arr, int low, int high)
    {
  
        // pivot
        Employee pivot = arr[high];
  
        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);
  
        for (int j = low; j <= high - 1; j++) {
  
            // If current element is smaller
            // than the pivot
            if (converToInt(arr[j].id) > converToInt(pivot.id)) {
  
                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    
    static void quickSortDESC(Employee[] arr, int low, int high)
    {
        if (low < high) {
  
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partitionDESC(arr, low, high);
  
            // Separately sort elements before
            // partition and after partition
            quickSortDESC(arr, low, pi - 1);
            quickSortDESC(arr, pi + 1, high);
        }
    }
    
    //
     void mergeASC(Employee arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        Employee L[] = new Employee[n1];
        Employee R[] = new Employee[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (converToInt(L[i].id) <= converToInt(R[j].id)) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    void mergeSortASC(Employee arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;
 
            // Sort first and second halves
            mergeSortASC(arr, l, m);
            mergeSortASC(arr, m + 1, r);
 
            // Merge the sorted halves
            mergeASC(arr, l, m, r);
        }
    }
    
    void mergeDESC(Employee arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        Employee L[] = new Employee[n1];
        Employee R[] = new Employee[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (converToInt(L[i].id) >= converToInt(R[j].id)) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    void mergeSortDESC(Employee arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;
 
            // Sort first and second halves
            mergeSortDESC(arr, l, m);
            mergeSortDESC(arr, m + 1, r);
 
            // Merge the sorted halves
            mergeDESC(arr, l, m, r);
        }
    }
    
    public void display(Employee arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].id + " " + arr[i].name + " " + arr[i].level);
        }
    }

}
