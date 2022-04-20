#include <stdio.h>

int main(void) {
    int testcases;
    scanf("%d", &testcases);

    for(int i = 0; i < testcases ; i++) {
        int gnomes;
        scanf("%d", &gnomes);
        int first_gnome;
        scanf("%d", &first_gnome);

        for(int j = 0; j < gnomes - 1 ; j++) {
            int next_gnome;
            scanf("%d", &next_gnome);
            if(!(next_gnome == first_gnome +1)) {
                printf("%d\n", j + 2);
                for(int k = 0 ; k < gnomes - j - 2 ; k++) {
                    int jojo;
                    scanf("%d", &jojo);
                }
                j = gnomes - 1;
            }
            first_gnome = next_gnome;
        }        
        
    }

    return 0;
}