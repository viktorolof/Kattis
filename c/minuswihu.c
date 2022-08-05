#include <stdio.h>

int main(void) {
    unsigned long x = 0 ;
    unsigned long y = 0;

    while(fscanf(stdin, "%lu%lu", &x, &y) == 2) {
        
        if(x < y) {
            printf("%lld\n", y - x);
        } else {
            printf("%lld\n", x - y);
        }
    }
    return 0;
}