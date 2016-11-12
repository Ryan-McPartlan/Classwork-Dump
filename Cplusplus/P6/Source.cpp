/*
Programmer: Ryan McPartlan
Course: CMPT 102-02
Time taken: ~2 hours
Due date: April 20th

This program creates a class for retail items.
*/

#include <iostream>
#include <iomanip>
#include "RetailItem.h"

using namespace std;

int main()
{
	RetailItem jackets("Jacket", 12, 59.95);
	RetailItem jeans("Designer Jeans", 40, 34.95);
	RetailItem shirts("Shirt", 20, 24.95);

	jackets.report();
	jeans.report();
	shirts.report();

	return 0;
}
