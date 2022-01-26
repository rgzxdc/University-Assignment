#include <stdio.h>  

int main() {
    int *ptr1, *ptr2, temp;
    int x = 9;
    int y = 3;
    ptr1 = &x;
    ptr2 = &y;
    
    temp = *ptr1;
    *ptr1 = y;
    *ptr2 = temp;
    
    printf("x = %d y = %d\n", x, y);
}