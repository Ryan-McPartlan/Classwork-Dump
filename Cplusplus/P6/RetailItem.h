#ifndef RETAILITEM
#define RETAILITEM
#include <string>

using namespace std;

class RetailItem
{
public:
	RetailItem(string, int, double);
	string getDescription();
	int getUnitsOnHand();
	double getPrice();
	void setDescription(string);
	void setUnitsOnHand(int);
	void setPrice(double);
	void report();
private:
	string description;
	int unitsOnHand;
	double price;
};

#endif
