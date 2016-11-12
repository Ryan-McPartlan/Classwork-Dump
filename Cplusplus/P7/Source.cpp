/*
Programmer: Ryan McPartlan
Course: CMPT 102-02
Time taken: ~1 hour
Due date: April 27th

This program creates a class for a coin, and "flips" a coin 20
times, outputting the results. 
*/

#include<iostream>
#include<ctime>
#include<cstdlib>
#include"Coin.h"

using namespace std;

int main()
{
	srand(time(0));

	int headsCount = 0;
	int tailsCount = 0;

	Coin c;

	cout << "We have a coin with " << c.getSideUp() << " facing up!";
	cout << endl << "Lets flip it 20 times!" << endl;
	cout << endl;

	for(int i = 0; i < 20; i++)
	{
		c.toss();
		if (c.getSideUp() == "heads")
		{
			tailsCount++;
			cout << "The coin landed tails up!" << endl;
		}
		else if (c.getSideUp() == "tails")
		{
			headsCount++;
			cout << "The coin landed heads up!" << endl;
		}
		else
			cout << "error" << endl;
	}

	cout << endl;
	cout << "The coin landed heads up " << headsCount << " times..." << endl;
	cout << "and we got tails " << tailsCount << " times!" << endl;
	cout << "I hope you had fun flipping! Goodbye!" << endl;
}
