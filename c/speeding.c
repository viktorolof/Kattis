#include <stdio.h>
#include <math.h>

int main(void) {
    int n;
    scanf("%d", &n);
    int arr_of_times[n];
    int arr_of_distances[n];
    int result = 0;
    for(int i = 0 ; i < n ; i++) {
        int t, d;
        scanf("%d" ,&t);
        scanf("%d" , &d);
        arr_of_times[i] = t;
        arr_of_distances[i] = d;
        if(i != 0) {
            d = d - arr_of_distances[i - 1];
            t = t - arr_of_times[i - 1];
            int resulting_speed =  d / t;
            if(resulting_speed >= result) {
                result = resulting_speed;
            }
        }
        
        
    }
    printf("%d\n", result);

    return 0;
}