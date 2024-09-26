#include <iostream>
using namespace std;
int main() {

    int atz1,atz2,atz3;

    cout << "atz viens: ";
    cin >> atz1;
    cout << "atz divi: ";
    cin >> atz2;
    cout << "atz tris: ";
    cin >> atz3;

    cout << atz1 << endl;
    cout << atz2 << endl;
    cout << atz3 << endl;

    if(atz1 and atz2 > 50) {
        cout << "Visas Sekmigas";
    } else if(atz1 or atz2 or atz3 < 50) {
        cout << ":(";
    }

    return 0;
    
}