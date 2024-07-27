#include <stdio.h>

int main(void) {
    int n, i, dot = 3, inc = 2;
    scanf_s("%d", &n);

    for (i = 1; i < n; i++) {
        dot += inc;
        inc *= 2;
    }

    printf("%d", dot * dot);

    return 0;
}