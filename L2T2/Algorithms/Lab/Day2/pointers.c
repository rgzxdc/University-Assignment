#include <stdio.h>  

int main() {
    int *ptr;
    int x = 9;
    
    ptr = &x;
    
    //printing address of x
    printf("%d\n", ptr);
    printf("%u\n", ptr);  //hexa to decimal
    printf("%x\n", ptr);  // hexa value 
    
    //printing value of x
    printf("%d\n", *ptr);
}