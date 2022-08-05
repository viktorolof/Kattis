#include <stdio.h>

int main(void) {
    int testcases;
    int length_of_row;
    
    scanf("%d %d", &testcases, &length_of_row);
    printf("%d %d", testcases, length_of_row);

    int arr[testcases][length_of_row];

    for(int i = 0 ; i < testcases ; i++) {
        for(int j = 0; j < length_of_row ; j++) {
            scanf("%d", &arr[i][j]);
        }
    }

    for(int i = 0 ; i < testcases ; i++) {
        for(int j = 0; j < length_of_row ; j++) {
            printf("%d", arr[i][j]);
        }
        printf("\n");
    }
}