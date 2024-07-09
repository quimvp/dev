/*插入排序算法*/
#define maxn 1000
void insertSort(){
    int A[maxn], n;
    for(int i = 2; i < n; i++){
        int temp = A[i], j = i;
        while(j > 1 && temp < A[j-1]){  //只要temp小于前一个元素A[j-1]
            A[j] = A[j-1];
            j--;
        }
    A[j] = temp;
    }
}

23:57