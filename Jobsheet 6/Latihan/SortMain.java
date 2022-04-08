package Latihan;

public class SortMain{
    public static void main(String[] bool) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("Sorting Dengan Merge Sort :");
        MergeSorting mSort = new MergeSorting();
        System.out.println("Data Awal :");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Data Setelah Diurutkan");
        mSort.printArray(data);
    }
}

class MergeSorting {
    public void mergeSort(int[] data){
        int left = 0, right = data.length-1;
        sort(data, left, right);
    }

    private void merge(int[] data, int left, int middle, int right){
        int temp[] = new int[data.length];
        for(int i=left; i<=right; i++){
            temp[i] = data[i];
        }

        int a = left, b = middle+1, c = left;
        while(a<=middle && b<=right){
            if(temp[a] <= temp[b]){
                data[c] = temp[a];
                a++;
            }else{
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = middle-a;
        for(int i=0; i<=s; i++){
            data[c+i] = temp[a+i];
        }
    }

    private void sort(int data[], int left, int right){
        if(left < right){
            int middle = (left+right)/2;
            sort(data, left, middle);
            sort(data, middle+1, right);
            merge(data, left, middle, right);
        }
    }

    public void printArray(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}