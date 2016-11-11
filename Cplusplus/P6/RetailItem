#include <cstdlib>
#include <iostream>
#include <iomanip>
#include "RetailItem.h"

RetailItem::RetailItem(string desc, int units, double p)
{
	description = desc;
	unitsOnHand = units;
	price = p;
}

string RetailItem::getDescription()
{
	return description;
}

int RetailItem::getUnitsOnHand()
{
	return unitsOnHand;
}

double RetailItem::getPrice()
{
	return price;
}

void RetailItem::setDescription(string desc)
{
	if(desc != "")
		description = desc;
	else
	{
		cout << "Description should not be left blank";
		exit(EXIT_FAILURE);
	}
}

void RetailItem::setUnitsOnHand(int units)
{
	if(units > 0)
		unitsOnHand = units;
	else
	{
		cout << "Available units must be positive";
		exit(EXIT_FAILURE);
	}
}

void RetailItem::setPrice(double p)
{
	if(p >= .01)
		price = p;
	else
	{
		cout << "Price cannot be less than one cent";
		exit(EXIT_FAILURE);
	}
}

void RetailItem::report()
{
	cout << description << ": " << unitsOnHand;
	cout << " on sale for " << price << " each!" << endl;
}
