#include <iostream>
using namespace std;
int main() {

    int sk1,sk2,sk3;
    bool bsk1, bsk2, bsk3;

    cout << "skaitlis viens: ";
    cin >> sk1;
    cout << "skaitlis divi: ";
    cin >> sk2;
    cout << "skaitlis tris: ";
    cin >> sk3;

    if(sk1 <= 0) {
        cout << "ne visi ir pozitivi" << endl;
    } else if(sk2 <= 0) {
        cout << "ne visi ir pozitivi" << endl;
    } else if(sk3 <= 0) {
        cout << "ne visi ir pozitivi" << endl;
    } else {
        cout << "visi ir pozitivi!!!!!" << endl;
    }

    return 0;
    
}