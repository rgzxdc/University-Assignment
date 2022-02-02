#include <stdio.h>
int main() {
    
    int test_arr[10] = {11,12,13,14,15,16,17,18,19,20};
    
    int test_arr_size = sizeof(test_arr)/sizeof(test_arr[0]);
    
    int target_value;
    scanf("%d", &target_value);
    
    int i;
    
    for(i = 0; i<test_arr_size; i++) {
        if(target_value == test_arr[i]) {
            printf("We Found The Number!!");
            break;
        }
        
    }
    
    if(i == test_arr_size) {
        printf("Number Not Found");
    }
    
    return 0;
}