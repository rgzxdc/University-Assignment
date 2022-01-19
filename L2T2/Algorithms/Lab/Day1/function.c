#include <stdio.h>

int multiplicationTwoNumber(int a, int b) {
    int result = a*b;
    return result;
}

int main() {

    printf("Hello BLC!\n");
    
    int x, y, result;
    scanf("%d %d", &x, &y);
    result = multiplicationTwoNumber(x,y);
    printf("a X b is: %d", result);
    return 0;
}
