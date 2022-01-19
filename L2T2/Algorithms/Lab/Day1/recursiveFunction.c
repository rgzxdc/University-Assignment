#include <stdio.h>

void disply(int a) {            //I think i used a cheatcode hare!
    if(a>0) {
        disply(--a);
        printf("%d", a+1);      
    }
}
int main() {
    printf("Hello BLC!\n");
    
    int x;
    scanf("%d", &x);
    disply(x);
    
    return 0;
}
