/* Ryan McPartlan
Febuary 27, 2015
CMPT 102-02
20 minuets

This program will recieve an input of an amount of US dollars and then display the value of that many dollars in Japanese yen as well as euros.
*/

#include<iostream>
#include<iomanip>
using namespace std;

int main()
{
	double dollars;
	double YEN_PER_DOLLAR = 118.99;
	double EUROS_PER_DOLLAR = .88;

	cout << "Please input an amount of dollars you wish to convert!" << endl;
	cin >> dollars;

	cout << endl;
	cout << setprecision(2) << fixed; 
	cout << "USD:" << setw(17) << dollars << endl;
	cout << "Value (Yen):" << setw(9) << dollars*YEN_PER_DOLLAR << endl;
	cout << "Value (Euro):" << setw(8) << dollars*EUROS_PER_DOLLAR << endl;

	return 0;
}
