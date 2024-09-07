#include <iostream>
using namespace std;

int main() {
  int viajes, saldo, horario;

  cout << "Ingrese la cantidad de viajes a realizar: ";
  cin >> viajes;

  cout << "Ingrese el saldo de la tarjeta: ";
  cin >> saldo;

  for(int i = 1; i <= viajes; i++){
    cout << "Ingrese el horario del viaje " << i << "(1-Punta, 2-Valle): ";
    cin >> horario;

    if(horario == 1){
      saldo -= 800;
    }
    else if(horario == 2){
      saldo -= 720;
    }
  }

  cout << "El saldo final del día sería $" << saldo << endl;
  
  return 0;
 }