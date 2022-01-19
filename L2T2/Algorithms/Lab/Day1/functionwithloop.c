#include <stdio.h>

void disply(int a) {
    for(int i = 1; i <= a; i++) {
        printf("%d ", i);
    }
    }
    
int main() {
    printf("Hello BLC!\n");
    
    int x;
    scanf("%d", &x);
    disply(x);
    
    return 0;
}
