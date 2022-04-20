#include <stdio.h>

int main(void) {
    int hour;
    int minutes;

    int a = fscanf(stdin, "%d%d", &hour, &minutes);

    
    if(minutes >= 45) {
        printf("%d %d", hour, minutes - 45);
    }
    else {
        printf("%d %d", (hour + 23) % 24, (minutes + 75 )% 60 );
    }
}