#include <stdio.h>  

int main() {
    int *ptr;
    int x = 9;
    ptr = &x;
    printf("%d\n", *ptr);
     
    *ptr = 10;
    
    printf("%d\n", *ptr);
}