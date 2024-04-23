#include <iostream>

using namespace std;

class student{
    private:
        double num;
        double privateMethod(double num){return num+1;}
    public:
        double get(){return num;}
        void set(double n){num = n;}
        void publicMethod(){
            privateMethod(num);
        }
};

int main(){
    student std1;
    std1.set(7);
    cout<<std1.get()<<endl;
}