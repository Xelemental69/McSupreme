/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/file.cc to edit this template
 */

#include <iostream>
#include <array>

using namespace std;

const int PT = 690;
typedef array<int, PT> TLista;

int main() {
  

    TLista lista1;
    TLista Cameos = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    TLista lista2;

    
    int i = 0;
    int y = 0;
    int x, lim;
    int n = 0;
    int jdep = 0;

    do {
        cout << "Introduce un limite entre 1 y 100: ";
        cin>>lim;
        if (lim < 1 || lim > 100) cout << "Error (entrada inválida).";
    } while (lim < 1 || lim > 100);
    

    cout << "Introduzca una secuencia de " << lim << " dígitos: ";
 

    do {

        cin >> lista1[i];


        switch (lista1[i]) {

            case 0:
                Cameos[0]++;
                break;

            case 1:
                Cameos[1]++;
                break;

            case 2:
                Cameos[2]++;
                break;

            case 3:
                Cameos[3]++;
                break;

            case 4:
                Cameos[4]++;
                break;

            case 5:
                Cameos[5]++;
                break;

            case 6:
                Cameos[6]++;
                break;

            case 7:
                Cameos[7]++;
                break;

            case 8:
                Cameos[8]++;
                break;

            case 9:
                Cameos[9]++;
                break;
        }

        y++;

    } while (y < lim);

    for (int f = 0; f<y+1; f++) {

        if (n < Cameos[f]) {
            n = Cameos[f];
        }

    }

    cout << "Frecuencia de cada dígito: " << endl;
    cout << "0: " << Cameos[0] << endl;
    cout << "1: " << Cameos[1] << endl;
    cout << "2: " << Cameos[2] << endl;
    cout << "3: " << Cameos[3] << endl;
    cout << "4: " << Cameos[4] << endl;
    cout << "5: " << Cameos[5] << endl;
    cout << "6: " << Cameos[6] << endl;
    cout << "7: " << Cameos[7] << endl;
    cout << "8: " << Cameos[8] << endl;
    cout << "9: " << Cameos[9] << endl;
    cout << "Mas alto: " << n << endl;


    cout << "Introduzca un valor de x: ";
    cin>>x;

    if (x <= n) {
        for (int j = 0; j <= y; j++) {

            if (x == Cameos[j]) {
                lista2[jdep] = j;
                jdep++;
            }

        }

        cout << "Contenido de lista 2 es:";
        for (int k = 0; k < jdep; k++) {

            cout << " " << lista2[k];

        }
        cout << endl;
    } else {

        cout << "No hay contenido en lista 2." << endl;

    }

    //system("pause");
    return 0;
}
