#include <stdio.h>

float multiplicationTwoNumber(int a, float b) {
    float result = a*b;
    return result;
    }
    
int main() {
    printf("Hello BLC!\n");
    
    int x;
    float y, result;
    scanf("%d %f", &x, &y);
    result = multiplicationTwoNumber(x,y);
    
    printf("m X k is: %f", result);
    return 0;
}
