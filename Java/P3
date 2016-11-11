#include"Inventory.h"
#include<string>


using namespace std;


Inventory::Inventory(int inSerial, int inLot, int inMonth, int inDay, int inYear)
{
	serialNum = inSerial;
	lotNum = inLot;
	manufacDate = to_string(inMonth) + '/' + to_string(inDay) + '/' + to_string(inYear);
}


string Inventory::getDate()
{
    return manufacDate;
}


int Inventory::getLotNum()
{
	return lotNum;
}


int Inventory::getSerialNum()
{
	return serialNum;
}


































#ifndef INVENTORY_H
#define INVENTORY_H


#include<string>


using namespace std;


class Inventory
{
public:
	Inventory();
	Inventory(int, int, int, int, int);
    int getSerialNum();
    int getLotNum();
    string getDate();


private:
    int serialNum;
    int lotNum;
    string manufacDate;
};


#endif








































#include<iostream>
#include<stack>
#include<string>
#include"Inventory.h"


using namespace std;


int main()
{
	stack<Inventory> inventoryStack;
    int userChoice1 = -1;
    int month;
    int day;
    int year;
    int serial;
    int lot;


    cout << "The inventory is currently empty." << endl;


    while(userChoice1 != 0)
	{
        cout << "If you would like to add a part, input 1. If you would like to withdraw a part, input 2. If you would like to quit, input 0." << endl;
		cout << "Input 1, 2, or 0: ";
		cin >> userChoice1;
		cout << endl;


        if(userChoice1 == 1)
		{
            cout << "To add a part to the inventory, you must input it's serial number, a lot number, as well as its manufacturing month, day and year" << endl << endl;


            cout << "First, input the serial number written on your part, an integer with a length of 7. If the first didget is 0, you are looking at the wrong number.  ";
            cin >> serial;
            while(serial < 1000000 || serial > 9999999 )
			{
				cout << "Sorry, the serial number is a 7 didget long integer. Try checking the label on your part more closely and tryign again.  ";
                cin >> serial;
			}
            cout << endl;


            cout << "Now, input the lot number. As there are only 2300 lots at Ryanco, the parts lot number will be less than 2300 and greater than 0.  ";
            cin >> lot;
            while(lot <= 0 || lot >= 2300)
			{
                cout << "Sorry, the lot number should be betweem 0 and 2301. Try again. ";
                cin >> lot;
			}
            cout << endl;
            
            cout << "Now, input the month the part was made.  ";
            cin >> month;
            while(month <= 0 || month > 12)
			{
                cout << "Are we using the same calander? Months only go up to 12...";
                cin >> month;
			}
            cout << endl;
            
            cout << "Now, input the day the part was made. Warning: Ryanco does not check if your month does not have 31 days, please be carful! We dont want any bugs in the system!  ";
            cin >> day;
            while(day <= 0 || day > 31)
			{
                cout << "We do, however, make sure your day is <= 31. Try again. ";
                cin >> day;
			}
            cout << endl;


            cout << "Now, input the year the part was made. If your part was created before 1800, you might be better off bringing it to a museum.  ";
            cin >> year;
            while(year <= 1800 || year > 2015)
			{
                cout << "Sorry, we only accept parts between 1800 and this year. Try again. ";
                cin >> year;
			}
            cout << endl;


            cout << "Your part is now being added to the part pile!" << endl;
			inventoryStack.push(Inventory(serial, lot, month, day, year));
            cout << "Your part was added successfully!" << endl;
            cout << endl;
		}
		else if(userChoice1 == 2 && !inventoryStack.empty())
		{
            cout << "You have removed the top part. " << endl;
			cout << "The serial number of this part is " << inventoryStack.top().getSerialNum() << "." << endl;
			cout << "The lot number of this part is " << inventoryStack.top().getLotNum() << "." << endl;
			cout << "The manufacture date of this part is " << inventoryStack.top().getDate() << "." << endl;
			cout << endl;


			inventoryStack.pop();
		}
		else if(userChoice1 == 2 && inventoryStack.empty())
		{
			cout << "Sorry, we are out of parts!" << endl;
			cout << endl;
		}


		if(userChoice1 != 0)
		{
			cout << "Welcome back! ";
		}
	}

    return 0;
}
