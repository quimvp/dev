#include <iostream>
using namespace std;
int main() {

    int skaitlis;

    cout << "Ievadi skaitli: ";
    cin >> skaitlis;

    if(skaitlis % 2 == 0 && skaitlis > 100) {
        cout << "Derigs" << endl;
    } 
    else if(skaitlis % 2 == 0 && skaitlis < 100) {
        cout << "Derigs" << endl;
    } else if(skaitlis % 2 == 1) {
        cout << "Nederigs" << endl;
    }
    return 0;
    
}