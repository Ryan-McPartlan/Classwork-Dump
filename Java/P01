#include <iostream>
#include "Item.h"

using namespace std;

int Item::getItemNumbrer()
{return itemNumber;}

int Item::getQuantity()
{return quantity;}


double Item::getCost()
{return cost;}


double Item::getTotalCost()
{return cost*quantity;}

void Item::setItemNumber(int newID)
{
	if (newID >= 0)
		itemNumber = newID;
	else
		cout << "That is not a valid input";
}


void Item::setQuantity(int newQuantity)
{
	if (newQuantity >= 0)
		quantity = newQuantity;
	else
		cout << "That is not a valid input";
}


void Item::setCost(double newCost)
{	if (newCost >= 0)
		itemNumber = newCost;
	else
		cout << "That is not a valid input";
}

class Item
{
public:
	Item();
	Item(int itemNumber, double cost, int quantity);
	~Item();


	int getItemNumbrer();
	int getQuantity();
	double getCost();
	double getTotalCost();
	void setItemNumber(int);
	void setQuantity(int);
	void setCost(double);


private:
	int itemNumber;
	int quantity;
	double cost;
};


Item::Item()
{
}


Item::~Item()
{
}

