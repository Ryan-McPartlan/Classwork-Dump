/*
Programmer: Ryan McPartlan
Course: CMPT 102-02
Time taken: ~2 hours
Due date: April 9th

This program outputs a chart displaying temperature conversions
*/
#include<iostream>
#include<iomanip>
#include<math.h>
using namespace std;

float celsius(float temperatureF);
float fahrenheit(float temperatureC);
int numChars(int number);

int main()
{
	int currentChars;

	cout << setprecision(2) << fixed; 

	//Celsius to fahrenehit chart
	cout << "Celsius" << setw(5) << "==>" << setw(13) << "Fahrenheit" << setw(20);
	cout << "Celsius" << setw(5) << "==>" << setw(13) << "Fahrenheit" << endl << endl;

	for(int i = 0; i < 30; i++)
	{
		//Left part of chart
		currentChars = numChars(i-30);
		cout << (i - 30) << setw(25 - currentChars);
		cout << fahrenheit(i - 30) << setw(20);

		//Right part of chart
		cout << (i) << setw(17);
		cout << fahrenheit(i) << endl;
	}
	cout << setw(42) << 30 << setw(17) << fahrenheit(30);

	cout << endl << endl << endl;

	//Fahrenheight to celsius chart
	cout << "Fahrenheit" << setw(4) << "==>" << setw(8) << "Celsius" << setw(25);
	cout << "Fahrenheit" << setw(4) << "==>" << setw(9) << "Celsius" << endl << endl;

	for(int i = 0; i < 50; i++)
	{
		//Left part of chart
		currentChars = numChars(i);
		cout << (i) << setw(25 - currentChars);
		cout << celsius(i) << setw(20);

		//Right part of chart
		cout << (i + 50) << setw(17);
		cout << celsius(i + 50) << endl;
	}
	cout << setw(43) << 100 << setw(17) << fahrenheit(100);

	cout << endl << endl;

	return 0;
}

float celsius(float temperatureF)
{
	return (temperatureF - 32) * 5 / 9;
}

float fahrenheit(float temperatureC)
{
	return temperatureC * 9 / 5 + 32;
}

//Finds how many characters a number will use
int numChars(int number)
{
	int total;
	total = 4;
	if (number < 0)
		total += 1;
	if (abs(number) / 10 > 0)
		total += 1;
	if (abs(number) / 100 > 0)
		total +=1;
	return total;
}
