#ifndef STUDENT
#define STUDENT
#include<string>

using namespace std;

class Student
{
public:
	Student(string name, int SAT, string school);
	int chanceFunction();
	string getName();
	void setName(string newName);
	int getScore();
	void setScore(int newScore);
	string getSchool();
	void setSchool(string newSchool);

private:
	string name;
	int SAT;
	string school;
};

#endif
