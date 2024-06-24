
    #include<iostream>
    using namespace std;

    bool isPrime(int n){
        if(n<=1){
            return 0;
        }
        for(int i=2; i<n; i++){
            if(n%i==0){
                return 1;
            }
        }
        return 0;

    }


    int totalPrime(int n){
        int count=0;
        for(int i=2; i<n; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }


    int main(){
        system("CLS");
        int num;
        cout<<"Enter a number to until get prime numbers: ";
        cin>>num;
        int total= totalPrime(num);
        cout<<"Total prime numbers are: "<<total<<endl;
    
        return 0;
    }