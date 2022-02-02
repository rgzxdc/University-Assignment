#include <stdio.h>
#include <string.h>
int main() {
    
    int number_of_employee;
    scanf("%d", &number_of_employee);
    char employee[number_of_employee][30];
    char target_employee[30];
    int i;
    
    for(i =0; i<number_of_employee; i++) {
            scanf("%s", employee[i]);
        }
    
    
    scanf("%s", target_employee);
    
    for(i = 0; i<number_of_employee; i++) {
        if(strcmp(employee[i], target_employee)==0) {
            printf("Matched");
            break;
        }
    }
    
    if(i == number_of_employee) {
        printf("Not Matched");
    }
    return 0;
}