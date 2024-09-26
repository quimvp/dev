#include <iostream>
using namespace std;
int main() {

    int skaitlis;
    cout << "ievadi skaitli: ";
    cin >> skaitlis;
    if(skaitlis > 0) {
        cout << "skaitlis ir pozitivs";
    } else if(skaitlis == 0) {
        cout << "skaitlis ir nulle";
    } else {
        cout << "negativs";
    }
    return 0;
}