/* 
Programmer: Ryan McPartlan
Course: CMPT 102-02
Time taken: ~30 minuets
Due date: March 10th

This program asks the user to find a way to make one dollar out of 
pennies, quarters, nickles, and dimes After asking for a number of 
each of these coins, the program will tell the user if their value
is more than, less than, or equal to $1.00
*/

#include<iostream>
#include<iomanip>
using namespace std;

int main ()
{
	double value = 0;
	int pennies = 0;
	int nickles = 0;
	int dimes = 0;
	int quarters = 0;

	//Intro
	cout << "Welcome to Change for a Dollar RPG!" << endl;
	cout << "Try to make $1.00 out of different types of coins!";

	//Get change from user
	cout << endl << "How many pennies will you use?   ";
	cin >> pennies;
	cout << "How many nickles will you use?   ";
	cin >> nickles;
	cout << "How many dimes will you use?   ";
	cin >> dimes;
	cout << "How many quarters will you use?   ";
	cin >> quarters;

	//Calculate value of change
	value = pennies*.01 + .05 * nickles + .10 * dimes + .25 * quarters;

	//Give the user feedback
	cout << endl;
	cout << setprecision(2) << fixed << showpoint;
	cout << "Your coins are worth $" << value << "!" << endl;
	if (value > 1)
		cout << "Thats more than $1.00! Try again!" << endl;
	else if (value < 1)
		cout << "Sorry, thats less than $1.00! Try again!" << endl;
	else if (value == 1)
		cout << "You win! Congratulations, good counting!" << endl;
	else
		cout <<  "Error" << endl;
	cout << "Thanks for playing!" << endl;

	return 0;
}
