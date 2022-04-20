#include <stdio.h>

void main(void) {
    int a;
    int b;
    scanf("%d %d", &a, &b);
    if(a <= b) {
        printf("%d %d", a, b);
    }
    else{
        printf("%d %d", b, a);
    }
}