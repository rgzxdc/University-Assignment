#include <stdio.h>  

int main() {
    int a[] = {10,20,30,40,50, 60, 70, 80};
    int size = sizeof(a)/sizeof(a[0]);
    int *ptr;
    ptr = a;
    
    //accessing array element with first address
    printf("%d\n", *(ptr));
    printf("%d\n", *(ptr+1));
    
    //accessing all array element with first address and loop
    for(int i = 0; i<size; i++) {
        printf("%d ", *(ptr+i));
    }

}