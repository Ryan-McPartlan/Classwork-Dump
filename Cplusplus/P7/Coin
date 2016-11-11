#include<ctime>
#include<iostream>
#include<cstdlib>
#include<string>
#include"Coin.h"

using namespace std;

Coin::Coin()
{
	int result = rand() % 2 + 1;

	if (result == 1)
		sideUp = "heads";
	else if (result == 2)
		sideUp = "tails";
	else
		cout << "error" << endl;
}

string Coin::getSideUp()
{
	return sideUp;
}

void Coin::toss()
{
	int result = rand() % 2 + 1;

	if (result == 1)
		sideUp = "heads";
	else if (result == 2)
		sideUp = "tails";
	else
		cout << "error" << endl;
}
