/*
Programmer: Ryan McPartlan
Course: CMPT 102-02
Time taken: ~1.5 hours
Due date: April 27th

This program creates a class for students.
*/

#include<iostream>
#include<string>
#include"Student.h"

using namespace std;

int main()
{
	string name;
	int score;

	cout << "What is your name?" << endl;
	cin >> name;
	cout << "What did you score on your SAT?" << endl;
	cin >> score;

	Student student1(name, score, "Harvard");

	cout << "With a score of " << student1.getScore() << ", you have a ";
	cout << student1.chanceFunction() << "% chance of getting into Harvard!";
	cout << endl;
	cout << "Good luck " << student1.getName() << "!" << endl;

return 0;
}
