#include <stdio.h>
int maxInt();
int dpKnapsack();

int main() {
    int n, w;
    scanf("%d%d", &n, &w);
    int s[n], v[n];

    for(int i = 0; i<n; i++) {
        scanf("%d", &s[i]);
    }
    for(int i = 0; i<n; i++) {
        scanf("%d", &v[i]);
    }
    printf("%d", dpKnapsack(w,s,v,n));
    return 0;
}

int dpKnapsack(int W, int s[], int v[], int n) {
    int V[n+1][S+1];
    for(int i = 0; i<=n; i++) {
        for(int s = 0; s<=W; s++) {
            if(i==0 || s == 0) {
                V[i][s] = 0;
            }
            else if(s[i-1]<=s) {
                V[i][s] = maxInt((v[i-1]+V[i-1][s-s[i-1]]),V[i-1,s]);
            }
            else {
                V[i][s] = V[i-1][s];
            }
        }
    }

    return V[n+1][S+1];
}

int maxInt(int a, int b) {
    if(a>b){
        return a;
    }
    else {
        return b;
    }
}







