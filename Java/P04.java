#include<string>
#include<iostream>

using namespace std;

int count(const string& s, char a);
void reverseDisplay(int value);
int sumDigits(int n);


int main()
{
    char inchar;
    string instring;
    int occurs;
    int invalue;


    cout << "The program will display your value...but backwards!" << endl;
    cout << "Enter a positive integer: ";
    cin >> invalue;
    cout << "Your number backwards is: ";
    reverseDisplay(invalue);
    cout << endl << endl;
    
    cout << "The program will display the sum of the digets of your value." << endl;
    cout << "Enter a positive integer: ";
    cin >> invalue;
    cout << "The sum of this numbers didgets is: " << sumDigits(invalue);
    cout << endl << endl;


    cout << "The program will now find the number of times a character appears in a string." << endl;
    cout << "Input a single character: ";
    cin >> inchar;
    cout << "Input a string with no spaces: ";
    cin >> instring;


    occurs = count(instring, inchar);
    
    cout << "The character " << inchar << " appears " << occurs << " times in this string." << endl;


    return 0;
}




int count(const string& s, char a) 
{
    string p = s.substr(0, s.size()-1);
    if(s.size() == 0)
    {
        return 0;
    }
    else if(s[s.size()-1] == a)
    {
        return 1  + count(p, a);
    }
    
    return count(p, a);
}


void reverseDisplay(int value)
{
    
    if(value >= 1)
    {
        cout << value % 10;
        reverseDisplay(value/10);
    }
}


int sumDigits(int value)
{
    if(value >= 1)
    {
        return ((value % 10) + sumDigits(value / 10));
    }
    
    return 0;
}
