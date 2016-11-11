#include<cstdlib>
#include<iostream>
#include"Student.h"

Student::Student(string studentName, int score, string applyingSchool)
{
	name = studentName;
	if (score >= 600 && score <= 2400)
		SAT = score;
	else
	{
		cout << "SAT score must be between 600 and 2400!" << endl;
		exit(EXIT_FAILURE);
	}
	school = applyingSchool;
}

int Student::chanceFunction()
{
	if (SAT > 2000)
		return 90;
	else if (SAT > 1700)
		return 75;
	else if (SAT > 1400)
		return 65;
	else if (SAT > 1000)
		return 34;
	else
		return 13;
}

string Student::getName()
{
	return name;
}

void  Student::setName(string newName)
{
	name = newName;
}

int  Student::getScore()
{
	return SAT;
}

void  Student::setScore(int newScore)
{
	if (newScore >= 600 && newScore <= 2400)
		SAT = newScore;
	else
	{
		cout << "SAT score must be between 600 and 2400!" << endl;
		exit(EXIT_FAILURE);
	}}

string Student::getSchool()
{
	return school;
}

void  Student::setSchool(string newSchool)
{
	school = newSchool;
}
