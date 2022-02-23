//implemetation of Merge Sort
#include <stdio.h>
void MergeSort();
void Merge();

int main() {
    
    int n, i = 0, left, right;
    scanf("%d", &n);
    int A[n];
    
    for(i = 0; i<n; i++){
        scanf("%d", &A[i]);
    }
    
    left = 0;
    right = n-1;
    
    MergeSort(A, left, right);
    
    for(i = 0; i<n; i++){
        printf("%d " , A[i]);
    }
    return 0;
}

void MergeSort(int A[], int left, int right) {
    int mid;
    if(left<right) {
        mid = (left+right)/2;
        MergeSort(A,left,mid);
        MergeSort(A,mid+1,right);
        Merge(A,left,right,mid);
    }
}

void Merge(int A[], int left, int right, int mid) {
    int n1, n2, i = 0, j = 0, k;
    
    n1 = (mid-left) + 1;
    n2 = right -mid;
    
    int L[n1], R[n2];
    
    for( i = 0 ; i <n1; i++) {
        L[i] = A[left+i];
    }
    for( j = 0 ; j <n1; j++) {
        R[j] = A[mid+1+j];
    }
    
    i = 0; j =0; k = left;
    
    while(i<n1 && j <n2) {
        if(L[i] <= R[j]) {
            A[k] = L[i];
            i++;
        }
        else {
            A[k] = R[j];
            j++;
        }
        k++;
    }
    while(i<n1) {
       
        A[k] = L[i];
        i++;
        k++;
    }
     while(j<n2) {
       
        A[k] = R[j];
        j++;
        k++;
    }
}