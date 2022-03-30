#include <stdio.h>
void dp_coin_change();
void backtrack();
int find_min();
void count_frequency_output();

int main() {
    int k, c, n;
    scanf("%d %d %d", &k, &c, &n);
    int coins[n];
    int payable = k - c;
    
    for(int i = 0; i<n; i++) {
        scanf("%d", &coins[i]);
    }
    
    //it was for checking the input
   /* for(int i = 0; i<n; i++) {
        printf(" %d ", coins[i]);
    } */
    
    dp_coin_change(coins, payable, n);
    
    return 0;
    
}

void dp_coin_change(int coins[], int payable,int n) {
    
    int t[payable+1];
    int c[payable+1];
    t[0] = 0;
    c[0] = -1;
    
    for(int i = 1; i<=payable; i++) {
        t[i] = 100000;
        c[i] = -1;
    }
    for(int j = 0; j<n; j++) {
        for(int i = coins[j]; i<=payable; i++) {
            int temp = find_min(t[i], 1+t[i-coins[j]]);
            if(temp != t[i]) {
                t[i] = temp;
                c[i] = j;
            }
        }
    }
    int total_pay = t[payable];
    
    
    backtrack(coins, c, payable, total_pay);
}

void backtrack(int coins[], int c[], int payable, int total_pay) {
    int payout[total_pay];
    for(int i = 0; i<payable; i++){
        if(payable==0){
            break;
        }
        else {
            payout[i] = coins[c[payable]];
            payable = payable - coins[c[payable]];
        }
    }
    count_frequency_output(payout, total_pay);
}

void count_frequency_output(int payout[], int total_pay) {
    int count = 0;
    int payout_frq[total_pay];
    for(int i = 0; i<total_pay; i++) {
        count = 1;
        if(payout[i]!=-1) {
            for(int j = i+1; j<total_pay; j++) {
                if(payout[i] == payout[j]) {
                    count++;
                    payout[j] = -1;
                }
            }
           payout_frq[i]=count;
        }
    }
    
    //results_output
    printf("%d\n", total_pay);
    for(int i = 0; i<total_pay; i++) {
        if(payout[i] != -1) {
            printf("%d coins of %d\n", payout_frq[i], payout[i]);
        }
    }
    
}
int find_min(int x, int y) {
   if(x>y) {
       return y;
   }
   else {
       return x;
   }
}


