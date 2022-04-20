#include <stdio.h>

int partition(int *arr, int low, int high){
    int pivot = arr[high];
    int i = low -1;
    for(int j = low ; j <= high -1 ; j++) {
        if(arr[j] < pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return(i + 1);
}

void quicksort(int *arr, int low, int high) {
    if(low < high) {
        int pi = partition(arr, low, high);

        quicksort(arr, low, pi -1);
        quicksort(arr, pi + 1, high);
    }

}

int oddman(int *arr, int size) {
    int result = 0;
    for(int i = 0 ; i < size ; i++) {
        if(arr[i] != arr[i + 1]) {
            return arr[i];
        }
        i++;
    }
    return -1;
}

int main(void) {
    int testcases;
    scanf("%d", &testcases);

    for(int i = 0 ; i < testcases ; i++) {
        int guests;
        scanf("%d", &guests);
        int arr[guests];
        for(int j = 0 ; j < guests ; j++) {
            int id;
            scanf("%d" , &id);
            arr[j] = id;
        }
        quicksort(arr, 0, guests -1);
        // nu bara hitta den ensamme mannen
        int result = oddman(arr, guests);

        if(result >= 0) {
            printf("Case #%d: %d\n", i + 1, result);
        }


    }
}