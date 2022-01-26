#include <stdio.h>

void display_arry_element_inReverse_Order(int *p, int size) {
    
    for(int i = 0; i<size; i++) {
        printf("%d ", *(p));
        p--;
    }
    
}

int main() {
    
    int size;
    scanf("%d", &size);
    int a[size];
    for(int i = 0; i<size; i++) {
        scanf("%d", &(a[i]));
    }
    int *ptr;
    ptr = &a[size-1];

    display_arry_element_inReverse_Order(ptr, size);
    
    return 0;
}