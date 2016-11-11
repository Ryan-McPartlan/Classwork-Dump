#ifndef COIN
#define COIN

#include<string>

using namespace std;

class Coin{
private:
	string sideUp;
public:
	Coin();
	string getSideUp();
	void toss();
};

#endif
