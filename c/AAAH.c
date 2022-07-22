#include <stdio.h>

int calc_length(char str[]) {
    int i = 0;
    while(1) {
        if(str[i++] == 'h') {
            return i;
        }
    }

}

int main(void) {
    char jon[999];
    char doc[999];

    fscanf(stdin, "%s", jon);
    fscanf(stdin, "%s", doc);

    int x = calc_length(&jon[0]);
    int y = calc_length(&doc[0]);

    if(x < y) {
        fprintf(stdout, "no");
    } else {
        fprintf(stdout, "go");
    }

    return 0;
}