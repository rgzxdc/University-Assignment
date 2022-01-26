#include <stdio.h>  

int changeI(int *i) {
    *i = 10;
}

int main() {
    int i = 0;
    changeI(&i);
    
    printf("%d", i);
    return 0;
}